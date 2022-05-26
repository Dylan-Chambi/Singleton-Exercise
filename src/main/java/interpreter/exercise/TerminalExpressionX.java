package interpreter.exercise;


public class TerminalExpressionX extends AbstractExpression {
    /**
     * dato entrada contexto = " 1 + 3 + 4 - 4"
     * dato salida = 1
     * si en el mensaje encontramos la letra A, reemplazamos por el numero 1
     * @param context
     */

    public TerminalExpressionX(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        int currentNumber = context.previousNum;
        if(context.input.startsWith("X")){
            if(context.prevExpression != "I") {
                currentNumber += 10;
            }else{
                currentNumber += 10;
                currentNumber -= 1;
            }
            context.previousNum = currentNumber;
            if(digit == context.currentDigit) {
                context.output += currentNumber;
                context.input = context.input.substring(digit);
            }
        }
    }
}
