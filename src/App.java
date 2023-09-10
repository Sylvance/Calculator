import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("What operation do you want to do on 6 and 2?");
        String key = scanner.nextLine();
        Integer ans;
        String answerString = "Answer: ";

        switch (key) {
            case "Addition":
                ans = Addition.call(6,2);
                System.out.println(answerString + ans);
                break;
            case "Division":
                ans = Division.call(6,2);
                System.out.println(answerString + ans);
                break;
            case "Multiplication":
                ans = Multiplication.call(6,2);
                System.out.println(answerString + ans);
                break;
            case "Subtraction":
                ans = Subtraction.call(6,2);
                System.out.println(answerString + ans);
                break;
            default:
                System.err.println("Invalid Operation. Use: Addition, Division, Multiplication or Subtraction.");
                break;
        }

        scanner.close();
    }
}
