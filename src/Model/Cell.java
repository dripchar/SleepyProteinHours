package Model;
import java.awt.*;

public class Cell {

    private Nucleus nuke;
    private Dimer dimer;
    private Monomer monomer;
    private double radius;
    private double jp;
    private double ka;
    private double kd;
    private double Keq = 0.1;
    private Color color = new Color(147, 197, 114);

    public Cell(Nucleus n, Dimer d, Monomer m, double r, double jp, double ka, double kd){
        this.nuke = n;
        this.dimer = d;
        this.monomer = m;
        this.radius = r;
        this.jp = jp;
        this.ka = ka;
        this.kd = kd;
        this.Keq = ka/kd;
    }

    public Cell(Nucleus n, Dimer d, Monomer m){
        this.nuke = n;
        this.dimer = d;
        this.monomer = m;
    }

}
