import Calculate.MainComponent;
import Calculate.OperationAdd;
import Calculate.OperationDecorator;

public class Main {
    public static void main(String[] args) {

        OperationDecorator calculate = new OperationAdd(new MainComponent(),78);
        double res = calculate.getNumber();
        System.out.println(res);
    }
}