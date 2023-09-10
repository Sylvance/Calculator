import java.util.ArrayList;
import java.util.List;

public class Steps {
    public static List<Op> call(String tokenString) {
        Integer count = 0;
        List<String> tokens = Tokens.call(tokenString);
        ArrayList<Op> ops = new ArrayList<>();

        for (String token : tokens) {
            System.out.println(token);
            Op op = new Op(token, count + 1);
            ops.add(op);
        }

        return ops;
    }
}
