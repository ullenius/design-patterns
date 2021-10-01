package patterns.interpreter.terminalexpression;

import patterns.interpreter.abstractexpression.Expression;
import patterns.interpreter.context.Context;
import patterns.interpreter.context.LanguageType;

public class LanguageTarget implements Expression {

    private LanguageType languageType;

    public LanguageTarget(LanguageType languageType) {
        this.languageType = languageType;
    }
    @Override
    public String interpret(Context context) {
        return context.evaluate();
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

}
