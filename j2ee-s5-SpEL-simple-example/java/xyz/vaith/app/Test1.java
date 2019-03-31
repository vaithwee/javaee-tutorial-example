package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test1 {
    @Test
    public void test1() {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("'HelloWorld!'");
        System.out.println(expression.getValue());
        expression = parser.parseExpression("'HelloWorld'.concat('!')");
        System.out.println(expression.getValue());
        expression = parser.parseExpression("'HelloWorld'.bytes");
        System.out.println(expression.getValue());
        expression = parser.parseExpression("'HelloWorld'.bytes.length");
        System.out.println(expression.getValue());
        expression = parser.parseExpression("new String('helloworld').toUpperCase()");
        System.out.println(expression.getValue());
        expression = parser.parseExpression("")
    }
}
