package service;

import Calculate.*;

import java.util.Scanner;

public class DataService {
    OperationDecorator operation;

    boolean stage;
    public DataService() {
        this.stage = true;
    }

    public ComplexNumber runCalculate(){
        while (stage){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Вас приветствует калькулятор комплексных чисел!");
            try{
                System.out.println("Введите действительную часть первого числа: ");
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Введите мнимую часть первого числа: ");
                double num2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Введите действительную часть второго числа: ");
                double num3 = Double.parseDouble(scanner.nextLine());
                System.out.println("Введите мнимую часть второго числа: ");
                double num4 = Double.parseDouble(scanner.nextLine());

                System.out.println("Введите операцию: ");
                String op = scanner.nextLine();
                switch (op){
                     case "+" -> {
                            operation = new OperationAdd(new MainCalculate(new ComplexNumber(num1, num2)),new ComplexNumber(num3, num4));
                            return operation.getComplexNumber();
                        }
                        case "-" -> {
                            operation = new OperationDiff(new MainCalculate(new ComplexNumber(num1, num2)),new ComplexNumber(num3, num4));
                            return operation.getComplexNumber();
                        }
                        case "*" -> {
                            operation = new OperationMult(new MainCalculate(new ComplexNumber(num1, num2)),new ComplexNumber(num3, num4));
                            return operation.getComplexNumber();
                        }
                        case "/" -> {
                            operation = new OperationDiv(new MainCalculate(new ComplexNumber(num1, num2)),new ComplexNumber(num3, num4));
                            return operation.getComplexNumber();
                        }
                        default -> {
                            throw new RuntimeException(String.format("For input string: '%s'", op));
                        }
                    }
            }
            catch (RuntimeException exception){
                System.out.println(exception.getMessage());
                System.out.println("Некорректное значение.");
                continue;
            }
        }
        return null;
    }
}
