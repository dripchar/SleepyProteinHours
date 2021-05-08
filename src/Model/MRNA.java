package Model;

import java.awt.*;

public class MRNA {

    private double width;
    private double height;
    private double vm;
    private double km;
    private double vp;
    private Color color = new Color(255,140,0);

    public MRNA(double width, double height, double vm, double km, double vp){
        this.width = width;
        this.height = height;
        this.vm = vm;
        this.km = km;
        this.vp = vp;
    }


}
