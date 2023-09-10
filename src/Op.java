public class Op {
    String token;
    Integer index;
    Integer precedence;

    Op(String token, Integer index) {
        this.token = token;
        this.index = index;
        this.precedence = setPrecedence();
    }

    public Boolean isOperand() {
        String regex = "\\d+";
        return token.matches(regex);
    }

    public Boolean isOperator() {
        String validOperators = "+-*/";
        return validOperators.contains(token);
    }

    public Integer setPrecedence() {
        if (Boolean.TRUE.equals(isOperator())) {
            switch (token) {
                case "+":
                    precedence = 1;
                    break;
                case "-":
                    precedence = 2;
                    break;
                case "*":
                    precedence = 3;
                    break;
                case "/":
                    precedence = 4;
                    break;
                default:
                    break;
            }
        } else {
            precedence = 0;
        }

        return precedence;
    }
}
