package controller;

import Calculate.ComplexNumber;
import service.DataService;
import view.ComplexNumberView;

public class Controller {
    private final DataService dataService = new DataService();
    private final ComplexNumberView complexNumberView = new ComplexNumberView();
    public void process(){
        ComplexNumber number = dataService.runCalculate();
        complexNumberView.sendOnConsole(number);
    }
}
