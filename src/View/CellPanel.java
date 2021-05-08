package View;

import javax.swing.*;
import java.awt.*;

public class CellPanel extends JPanel {

    private final Color cellColor = new Color(147, 197, 114);
    private final Color mrnaColor = new Color(205,221,226);
    private final Color monomerColor = new Color(255,140,0);
    private final Color dimerColor = new Color(0, 115, 255);
    private final Color nukeColor = new Color(47, 32, 66);
    private static final int thing = 50;

    private int[] mrnaDimensions = new int[] {30, 10};
    private int[] monomerDimensions = new int[] {30, 10};
    private int[] dimerDimensions = new int[] {30, 10};

    private int status;

    public CellPanel() {
        super();
        this.setSize(thing, 120);
        this.setBackground(Color.BLACK);
        status = 0;
        this.setVisible(true);
    }

    public CellPanel(int[] mrnaDimensions, int[] monomerDimensions, int[] dimerDimensions) {
        super();
        this.setSize(thing, 120);
        this.setBackground(Color.BLACK);
        this.mrnaDimensions = mrnaDimensions;
        this.dimerDimensions = monomerDimensions;
        this.dimerDimensions = dimerDimensions;
        status = 0;
        this.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Cell
        g.setColor(cellColor);
        g.fillOval(50, 50, 1100,800);

        //Nucleus
        g.setColor(nukeColor);
        g.fillOval(100, 175, 700, 550);

        //mRNA
        g.setColor(mrnaColor);
        g.fillRect(200, 275, this.mrnaDimensions[0]*10, this.mrnaDimensions[1]);

        //Monomers
        g.setColor(monomerColor);
        g.fillRoundRect(850, 250, this.monomerDimensions[0], this.monomerDimensions[1]*5, 10,
                5);

        //Dimers
        g.setColor(dimerColor);
        g.fillOval(225, 500, this.dimerDimensions[0], this.dimerDimensions[1]);

        System.out.println(this.getX()+" "+this.getY());
    }

    public void setMrnaDimensions(int[] dims){
        this.mrnaDimensions = dims;
    }

    public void setMonomerDimensions(int[] dims){
        this.monomerDimensions = dims;
    }

    public void setDimerDimensions(int[] dims){
        this.dimerDimensions = dims;
    }


}
