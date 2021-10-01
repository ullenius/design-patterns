package patterns.interpreter.client;

import patterns.interpreter.abstractexpression.Expression;
import patterns.interpreter.context.Context;
import patterns.interpreter.context.LanguageType;
import patterns.interpreter.nonterminalexpression.LanguageExpression;
import patterns.interpreter.nonterminalexpression.LanguageSource;
import patterns.interpreter.terminalexpression.LanguageTarget;

public class InterpreterClient {
    public static void main(String[] args) {

        Context context = new Context();

        Expression lang = new LanguageExpression(
                new LanguageSource(LanguageType.SWEDISH,
                new LanguageTarget(LanguageType.FRENCH)));
        lang.interpret(context);

        LanguageType sourceLanguage = context.getSource().getLanguageType();
        String sourceLanguageValue = context.getSource().getLanguageType().getValue();
        LanguageType targetLanguage = context.getTarget().getLanguageType();
        String targetLanguageValue = context.getTarget().getLanguageType().getValue();
        System.out.printf("%s in %s == %s in %s",sourceLanguageValue,sourceLanguage,targetLanguageValue,targetLanguage);
    }
}
