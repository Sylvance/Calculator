public class Calculate {
    public static Double call(String operation, Double[] args) {
        Double ans = 0.0;

        switch (operation) {
            case "Addition":
                ans = Addition.call(args[0], args[1]);
                break;
            case "Ceiling":
                ans = Ceiling.call((double) args[0]);
                break;
            case "Division":
                ans = Division.call(args[0], args[1]);
                break;
            case "Floor":
                ans = Floor.call((double) args[0]);
                break;
            case "Max":
                ans = Max.call(6, 2);
                break;
            case "Min":
                ans = Min.call(6, 2);
                break;
            case "Multiplication":
                ans = Multiplication.call(args[0], args[1]);
                break;
            case "Round":
                ans = Round.call((double) args[0]);
                break;
            case "Sqrt":
                ans = Sqrt.call((double) args[0]);
                break;
            case "Subtraction":
                ans = Subtraction.call(args[0], args[1]);
                break;
            default:
                System.err.println("Invalid Operation. Use: Addition, Division, Multiplication or Subtraction.");
                break;
        }

        return ans;
    }
}
