import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("What operation do you want to do?");
        String operation = scanner.nextLine();
        scanner.close();

        List<Op> ans = Steps.call(operation);
        String answerString = "Answer: ";

        System.out.println(answerString + ans);
    }
}
