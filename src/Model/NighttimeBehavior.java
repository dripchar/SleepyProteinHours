package Model;

import javax.swing.*;
import java.awt.*;

public class NighttimeBehavior implements TimeOfDayBehavior {

    @Override
    public void updateView(int time, JPanel panel) {
        switch(time % 24){
            case 0:
                panel.setBackground(Color.decode("#012459"));
                break;
            case 1:
                panel.setBackground(Color.decode("#003972"));
                break;
            case 2:
                panel.setBackground(Color.decode("#003972"));
                break;
            case 3:
                panel.setBackground(Color.decode("#004372"));
                break;
            case 4:
                panel.setBackground(Color.decode("#004372"));
                break;
            case 5:
                panel.setBackground(Color.decode("#016792"));
                break;
            case 6:
                panel.setBackground(Color.decode("#07729f"));
                break;
            case 7:
                panel.setBackground(Color.decode("#12a1c0"));
                break;
            case 8:
                panel.setBackground(Color.decode("#74d4cc"));
                break;
            case 9:
                panel.setBackground(Color.decode("#efeebc"));
                break;
            case 10:
                panel.setBackground(Color.decode("#fee154"));
                break;
            case 11:
                panel.setBackground(Color.decode("#fdc352"));
                break;
            case 12:
                panel.setBackground(Color.decode("#ffac6f"));
                break;
            case 13:
                panel.setBackground(Color.decode("#fda65a"));
                break;
            case 14:
                panel.setBackground(Color.decode("#fd9e58"));
                break;
            case 15:
                panel.setBackground(Color.decode("#f18448"));
                break;
            case 16:
                panel.setBackground(Color.decode("#f06b7e"));
                break;
            case 17:
                panel.setBackground(Color.decode("#ca5a92"));
                break;
            case 18:
                panel.setBackground(Color.decode("#5b2c83"));
                break;
            case 19:
                panel.setBackground(Color.decode("#371a79"));
                break;
            case 20:
                panel.setBackground(Color.decode("#28166b"));
                break;
            case 21:
                panel.setBackground(Color.decode("#192861"));
                break;
            case 22:
                panel.setBackground(Color.decode("#040b3c"));
                break;
            case 23:
                panel.setBackground(Color.decode("#012459"));
                break;


        }

    }
}
