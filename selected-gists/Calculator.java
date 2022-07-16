import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.*;

public class Calculator {
    public static void main(String[] args) {
        int i = 1;
        boolean stop = false;
        while(!stop) {
            try {
                out.print("Enter your first number: ");
                double firstNumber = new Scanner(in).nextDouble();
                out.print("Enter a math operator (a/s/m/d): ");
                String mathOperator = new Scanner(in).nextLine();
                out.print("Enter your second number: ");
                double secondNumber = new Scanner(in).nextDouble();
                out.println("OK!");
                switch (mathOperator){
                    case "a": out.println("The result is " + (firstNumber + secondNumber)); break; // add
                    case "s": out.println("The result is " + (firstNumber - secondNumber)); break; // subtract
                    case "m": out.println("The result is " + firstNumber * secondNumber); break; // multiply
                    case "d": out.println("The result is " + firstNumber / secondNumber); break; // divide
                    default: out.println("error!"); break;
                }
            } catch(InputMismatchException e){
                out.println("your input is not a number!");
            }
            boolean use = true;
            while(use){
                out.print("Do you still want to use the calculator? (y/n): ");
                String useCalculator = new Scanner(in).nextLine();
                if(Objects.equals(useCalculator, "y")){
                    stop = use = false;
                } else if(Objects.equals(useCalculator, "n")){
                    stop = true;
                    use = false;
                } else {
                    use = true;
                }
            }
            i++;
            if(i == 69) {
                for(int j = 0;j<69;j++){
                    out.println("nice");
                }
            }
        }
    }
}
