package Model;

public class NighttimeBehavior implements TimeOfDayBehavior {

    @Override
    public void updateView() {
        System.out.println("NIGHT");
    }
}
