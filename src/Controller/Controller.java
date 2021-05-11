package Controller;

import Model.Model;
import View.View;

public class Controller {

    Model model;
    View view;

    public Controller(Model m, View v){
        this.model = m;
        this.view = v;
    }

    public void pullTheLever() throws InterruptedException {
        model.runEquations();
    }

    public void runTest() throws InterruptedException {
        int i = 10;
        int loopCount = 0;
        while(true){
            if(i>=100){
                i = 10;
                loopCount++;
            }

            view.adjustPanelDims(new int[] {i, i}, new int[] {i, i}, new int[] {i, i});
            view.redraw();

            i+= 10;
            Thread.sleep(100);

            if(loopCount>= 100){
                break;
            }


        }
    }

}
