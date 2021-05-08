package Main;

import Controller.Controller;
import Model.Model;
import Model.TysonEquations;
import View.View;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        View view = new View();
        Model model = new Model(view, new TysonEquations());
        Controller controller = new Controller(model, view);

        //controller.runTest();

        System.out.println("All done!");


    }
}
