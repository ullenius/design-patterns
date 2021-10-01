package patterns.interpreter.nonterminalexpression;

import patterns.interpreter.abstractexpression.Expression;
import patterns.interpreter.context.Context;
import patterns.interpreter.context.LanguageType;
import patterns.interpreter.terminalexpression.LanguageTarget;

public class LanguageSource implements Expression {

    private LanguageType languageType;
    private LanguageTarget target;

    public LanguageSource(LanguageType languageType, LanguageTarget target) {
        this.languageType = languageType;
        this.target = target;
    }

    @Override
    public String interpret(Context context) {
        context.setTarget(target);
        return target.interpret(context);
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public LanguageTarget getTarget() {
        return target;
    }
}
