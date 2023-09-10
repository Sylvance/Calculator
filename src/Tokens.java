import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tokens {
    public static List<String> call(String expression) {
        List<String> tokens = new ArrayList<>();

        String regex = "\\d+|[-+*/()]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);

        while (matcher.find()) {
            tokens.add(matcher.group());
        }

        return tokens;
    }
}
