package patterns.interpreter.nonterminalexpression;

import patterns.interpreter.abstractexpression.Expression;
import patterns.interpreter.context.Context;

public class LanguageExpression implements Expression {

    private LanguageSource source;

    public LanguageExpression(LanguageSource source) {
        this.source = source;
    }

    @Override
    public String interpret(Context context) {
        context.setSource(source);
        return source.interpret(context);
    }
}
