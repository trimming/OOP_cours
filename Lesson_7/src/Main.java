import Calculate.MainCalculate;
import Calculate.OperationDecorator;
import Calculate.OperationDiff;
import Calculate.OperationMult;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: \n");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите второе число: \n");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите операцию: \n");
        String op = scanner.nextLine();
//        OperationDecorator calculate = new OperationMult(new MainCalculate(num2),num1);
//        double res = calculate.getNumber();
//        System.out.println(res);
    }
}