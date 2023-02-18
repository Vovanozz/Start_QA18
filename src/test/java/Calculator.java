

public class Calculator {

int a,b;
char action;
String res;
public static void CalculatorPrint(){
    System.out.println("This is a calculator");
}
public double calc(int a, int b, char action){
    double res=0;
    switch (action)
    {
        case '+':res=a+b;break;
        case '-':res=a-b;break;
        case '*':res=b*b;break;
        case '/':
            if (b!=0)
                res=a/b;
            else System.out.println("Error:division by ZERO");break;
        default:
            System.out.println("Error:wrong action");

    }
    return res;
}




}
