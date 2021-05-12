package Model;

import javax.swing.*;

public class DaytimeBehavior implements TimeOfDayBehavior {

    @Override
    public void updateView(int time, JPanel p) {
        System.out.println("DAY");
    }
}
