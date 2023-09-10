import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("What operation do you want to do on 6 and 2? Or 14.4 if single value operation.");
        String key = scanner.nextLine();
        scanner.close();

        Integer ans = 0;
        String answerString = "Answer: ";

        switch (key) {
            case "Addition":
                ans = Addition.call(6,2);
                break;
            case "Ceiling":
                ans = Ceiling.call(14.4);
                break;
            case "Division":
                ans = Division.call(6,2);
                break;
            case "Floor":
                ans = Floor.call(14.4);
                break;
            case "Max":
                ans = Max.call(6, 2);
                break;
            case "Min":
                ans = Min.call(6, 2);
                break;
            case "Multiplication":
                ans = Multiplication.call(6,2);
                break;
            case "Round":
                ans = Round.call(14.4);
                break;
            case "Sqrt":
                ans = Sqrt.call(14.4);
                break;
            case "Subtraction":
                ans = Subtraction.call(6,2);
                break;
            default:
                System.err.println("Invalid Operation. Use: Addition, Division, Multiplication or Subtraction.");
                break;
        }

        System.out.println(answerString + ans);
    }
}
