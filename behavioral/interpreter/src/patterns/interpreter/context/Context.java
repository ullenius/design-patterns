package patterns.interpreter.context;

import patterns.interpreter.nonterminalexpression.LanguageSource;
import patterns.interpreter.terminalexpression.LanguageTarget;

public class Context {
    private LanguageSource source;
    private LanguageTarget target;

    public String evaluate() {
        return target.getLanguageType().getValue();
    }

    public void setSource(LanguageSource source) {
        this.source = source;
    }

    public void setTarget(LanguageTarget target) {
        this.target = target;
    }

    public LanguageSource getSource() {
        return source;
    }

    public LanguageTarget getTarget() {
        return target;
    }
}
