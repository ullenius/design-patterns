package patterns.interpreter.abstractexpression;

import patterns.interpreter.context.Context;

public interface Expression {
    String interpret(Context context);
}
