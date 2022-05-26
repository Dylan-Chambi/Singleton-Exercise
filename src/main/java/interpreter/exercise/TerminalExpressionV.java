package interpreter.exercise;


public class TerminalExpressionV extends AbstractExpression {
    /**
     * dato entrada contexto = " 1 + 3 + 4 - 4"
     * dato salida = 1
     * si en el mensaje encontramos la letra A, reemplazamos por el numero 1
     * @param context
     */

    public TerminalExpressionV(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        int currentNumber = context.previousNum;
        if(context.input.startsWith("V")){
            if(context.prevExpression != "I") {
                currentNumber += 5;
            }else{
                currentNumber += 5;
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
