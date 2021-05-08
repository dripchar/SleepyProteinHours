package Model;

import View.View;

public class Model {
    private View view;
    private int time;
    private Cell cell;
    private TimeOfDayBehavior timeOfDayBehavior;
    private Equations equations;

    public Model(View v, Cell c, Equations e){
        this.view = v;
        this.time = 0;
        this.cell = c;
        this.timeOfDayBehavior = new DaytimeBehavior();
        this.equations = e;

    }

    public Model(View v, Equations e){
        this.view = v;
        this.equations = e;
        this.time = 0;
        this.timeOfDayBehavior = new DaytimeBehavior();
    }









    
}
