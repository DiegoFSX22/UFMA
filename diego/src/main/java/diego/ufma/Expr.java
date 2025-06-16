package diego.ufma;

import java.util.List;

abstract class Expr {

    static class Binary extends Expr {
        Binary(Expr left, Token operator, Expr right){
            this.left = left;
            this.operator = operator;
            this.right = right;
        }
    
        final Expr left;
        final Token operator;
        final Expr rigt;
    }
    static class Grouping extends Expr {
        Grouping(Expr expression) {
            this.expression = expression;
        }
        
        final Expr expression;
    }
    static class Literal extends Expr{
        Literal(Object value) {
            this.value = value;
        }

        final Object expression;
    }
    static class Unary extends Expr {
    Unary(Token operator, Expr right) {
        this.operator = operator;
        this.right = right;
    }
        
    final Token operator;
    final Expr right;
    }
}