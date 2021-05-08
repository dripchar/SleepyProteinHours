package View;

import Model.Model;

import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    private CellPanel panel;
    private JPanel buttonPanel;
    private JButton lightUp;
    private JButton lightDown;

    public View(){
        buildGUI();
    }


    public void buildGUI(){
        frame = new JFrame("JFrame Example");
        panel = new CellPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setSize(1200, 920);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void redraw(){
        this.panel.revalidate();
        this.panel.repaint();
        frame.setVisible(true);
    }

    public void adjustPanelDims(int[] mrnaDims, int[] monoDims, int[] dimerDims){
        this.panel.setMrnaDimensions(mrnaDims);
        this.panel.setMonomerDimensions(monoDims);
        this.panel.setDimerDimensions(dimerDims);
    }





}
