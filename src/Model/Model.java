package Model;

import View.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Model {
    private View view;
    private int time;
    private Cell cell;
    private TimeOfDayBehavior timeOfDayBehavior;
    private TysonEquations equations;

    public Model(View v, Cell c, TysonEquations e){
        this.view = v;
        this.time = 0;
        this.cell = c;
        this.timeOfDayBehavior = new NighttimeBehavior();
        this.equations = e;

    }

    public Model(View v, TysonEquations e){
        this.view = v;
        this.equations = e;
        this.time = 0;
        this.timeOfDayBehavior = new NighttimeBehavior();
    }


    public void runEquations() throws InterruptedException {
        double M = 0.0;
        double P1 = 0;
        double P2 = 0;

        double Pt = 0.0;
        double q = 1;

        double tempPt = 0;
        double tempM = 0;
        time = 0;

        while(true){
            //TODO: Think about how calculating then immediately saving affects the other parameters. They
            //view.adjustPanelDims(new int[] {M % 100, M % 100}, new int[] {P1 % 250, P1 % 250}, new int[] {P2%100, P2%100});
            view.adjustPanelDims(new int[] {(int) (M*10.0), (int) (M*20.0)}, new int[] {(int) (300.0*P1),
                    (int) (300.0*P1)}, new int[] {(int) (50.0*P2), (int) (50.0*P2)});
            view.redraw();

            tempPt = Pt;
            if(Pt < 0.0){
                tempPt = 0.1;
            }

            tempM = M;

            q = this.equations.calculate_q(tempPt);
            Pt += this.equations.dPtdt(tempM, tempPt, q);
            M += this.equations.dMdt(tempM, tempPt, q);
            P1 = this.equations.calculateP1(tempPt, q); P2 = this.equations.calculateP2(tempPt, q);

            Thread.sleep(100);

            if(time % 24 == 0) {
                System.out.println(M + ", " + P1 + ", " + P2 + ", " + q + ", " + Pt + ", time: " + time % 24);
            }
            timeOfDayBehavior.updateView(time, view.getCellPanel());
            time++;
            //System.out.println(M + ", "  + Pt + ", " + q);


        }


    }


    public TysonEquations getEquations() {
        return this.equations;
    }





    
}
