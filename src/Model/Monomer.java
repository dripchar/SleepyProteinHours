package Model;

import java.awt.*;

public class Monomer {

    private double length;
    private double width;
    private double kp1;
    private double kp3;

    public Monomer(double length, double kp1, double kp3){
        this.length = length;
        this.width = this.length / 1.61; // To obtain the GOLDEN rectangle
        this.kp1 = kp1;
        this.kp3 = kp3;

    }




}
