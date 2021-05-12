package View;

import Model.Model;
import Model.TysonEquations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {

    private JFrame frame;
    private CellPanel panel;
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JButton lightUp;
    private JButton lightDown;

    public View(){
        buildGUI();
    }


    public void buildGUI(){
        frame = new JFrame("JFrame Example");
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        panel = new CellPanel();
        panel.setPreferredSize(new Dimension(1500,900));
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        lightUp = new JButton("Lights Up");

        lightDown = new JButton("Lights Down!");

        buttonPanel.add(lightUp);
        buttonPanel.add(lightDown);


        mainPanel.add(panel);
        mainPanel.add(buttonPanel);
        frame.add(mainPanel);
        frame.setSize(1200, 920);
        frame.setLocationRelativeTo(null);
        frame.pack();
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

    public void setLightDownListener(TysonEquations tysonEquations) {
        lightDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tysonEquations.setKeq(-5.0);
            }
        });
    }

    public void setLightUpListener(TysonEquations tysonEquations) {
        lightUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tysonEquations.setKeq(5.0);
                System.out.println("Lights up! Keq: " + tysonEquations.getKeq());
            }
        });
    }

    public JPanel getCellPanel(){
        return this.panel;
    }
}
