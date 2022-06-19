public class Calculate {
    public void calculate(int a, int b){
        System.out.println("add is " + (a + b));
        System.out.println("multiplication is " + a * b);
        System.out.println("substract is " + (a - b));
        System.out.println("division is " + a / b);
    }

    public static void main(String[] args){
        Calculate calc = new Calculate();
        calc.calculate(20, 2);
    }
}
