package patterns.mvc.view;

import patterns.mvc.controller.Controller;

public class View {
    private static Controller controller = new Controller();

    public static void main(String[] args) {
        controller.printAllModels();
        System.out.println("Price for all the models :: " + controller.getPriceForModels());
    }
}
