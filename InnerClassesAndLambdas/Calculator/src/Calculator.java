public class Calculator {
    public DoMath toOperation(String op){
        DoMath res; //domath interface object
        switch (op) {
            case "+":
                res= (Double d1, Double d2) -> d1+d2;
                    /* TODO */
//Use a lambda expression to set "res" to the correct function.
                break;
            case "-":
                res = (Double d1, Double d2) -> d1-d2;

            /* TODO */
//Use a lambda expression to set "res" to the correct function.-x2;
                break;
            case "*":
                res = (Double d1, Double d2) -> d1*d2;
                     /* TODO */
//Use a lambda expression to set "res" to the correct function.->x1*x2;

                break;
            case "/":
                res = (Double d1, Double d2) -> d2 == 0 ? Double.POSITIVE_INFINITY : d1/d2;

            /* TODO */
//Use a lambda expression to set "res" to the correct function. You must account for divisions by zero as specified in the instructions.INITY:x1/x2;
                break;
          /* TODO */
//In the default value, the res function should return the minimun possible value.ouble.MIN_VALUE;

            default:
            res = (Double d1, Double d2) -> Double.MIN_VALUE;
            break;
        }
        return res;
    }
    public Double compute(Double n1, Double n2, String op){
        DoMath mathFunc = this.toOperation(op); //domath intferface object
        return mathFunc.compute(n1, n2);
    }
}

      /* TODO */
//set calc to the correct function calling the method above.toOperation(op);
//
// /* TODO */
//return the result of calc.compute with the numbers given..compute(n1,n2);


