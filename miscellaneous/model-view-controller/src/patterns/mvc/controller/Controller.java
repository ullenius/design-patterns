package patterns.mvc.controller;

import patterns.mvc.model.Model;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Model> modelsDatabase = new ArrayList<>();

    {
        Model model1 = new Model("Thing no.1", 25);
        Model model2 = new Model("Thing no.2", 52);
        Model model3 = new Model("Thing no.3", 79);
        Model model4 = new Model("Thing no.4", 13);

        addModel(model1);
        addModel(model2);
        addModel(model3);
        addModel(model4);
    }

    public void addModel(Model model) {
        modelsDatabase.add(model);
    }

    public int getPriceForModels() {
        int price = 0;
        for (Model model : modelsDatabase) {
            price += model.getPrice();
        }
        return price;
    }

    public void printAllModels() {
        modelsDatabase.forEach(System.out::println);
    }
}
