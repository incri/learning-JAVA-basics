public class MiniCalc {
    public MiniCalc (){
        int c = add(1,2);
        int d = multiply(3 ,4);
        int e = substract(6, 7);
        int f = division(10, 7);
        System.out.println(c + " " + d + " " + e + " " + f);
    }
    public int add (int a, int b){
        return a + b;
    }
    public int multiply (int a, int b){
        return a * b;
    }
    public int substract (int a, int b){
        return a - b;
    }
    public int division (int a, int b){
        return a / b;
    }
    public static void main (String[] args){
        System.out.println("MiniCalc");
        MiniCalc mc = new MiniCalc();
    }
}
