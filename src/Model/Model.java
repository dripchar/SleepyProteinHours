package Model;

import View.View;

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
        this.timeOfDayBehavior = new DaytimeBehavior();
        this.equations = e;

    }

    public Model(View v, TysonEquations e){
        this.view = v;
        this.equations = e;
        this.time = 0;
        this.timeOfDayBehavior = new DaytimeBehavior();
    }


    public void runEquations() throws InterruptedException {
        double M = 0;
        double P1 = 0;
        double P2 = 0;

        double Pt = 0;
        double q = 1;

        double tempPt = 0;
        double tempq = 1;

        while(true){
            //TODO: Think about how calculating then immediately saving affects the other parameters. They
            //view.adjustPanelDims(new int[] {M % 100, M % 100}, new int[] {P1 % 250, P1 % 250}, new int[] {P2%100, P2%100});
            //view.adjustPanelDims(new int[] {M, M}, new int[] {P1, P1}, new int[] {P2, P2});
            //view.redraw();

            tempq = q;
            tempPt = Pt;

           M += this.equations.dMdt(M, Pt, q);
           P1 = this.equations.calculateP1(Pt, q);
           P2 = this.equations.calculateP2(Pt, q);

            q = this.equations.calculate_q(tempPt);
            Pt += this.equations.dPtdt(M, tempPt, tempq);



        Thread.sleep(100);

            System.out.println(M + ", " + P1 + ", " + P2 +", " + q + ", " + Pt);



        }
    }








    
}
