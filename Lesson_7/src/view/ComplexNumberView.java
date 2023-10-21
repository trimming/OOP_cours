package view;

import Calculate.ComplexNumber;

import java.util.logging.Logger;

public class ComplexNumberView {
    Logger logger = Logger.getLogger(ComplexNumberView.class.getName());
    public void sendOnConsole(ComplexNumber number){
        logger.info(number.toString());
    }
}
