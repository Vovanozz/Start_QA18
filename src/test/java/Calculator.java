public class Calculator {

public static void PrintCalc(){
    System.out.println("This is a calculator");
}
public void calc(int a, int b, char action) {
    String res=null;

    switch (action) {
        case '+':

            res= String.valueOf((a + b));
            break;
        case '-':
            res = String.valueOf((a - b));
            break;
        case '*':
            res = String.valueOf((a * b));
            break;
        case '/':
            if (b != 0)
                res = String.valueOf((a / b));
            else System.out.println("Error:division by ZERO");
            break;
        default:
            System.out.println("Error:wrong action");


    }
    System.out.println("Result="+res);

}



}
