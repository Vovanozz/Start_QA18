public class Main {

    public static void main(String[] args) {
Calculator.PrintCalc();
Calculator calc=new Calculator();
 String res= String.valueOf(calc.calc(30,3,'/'));
        System.out.println(res);
    }



}
