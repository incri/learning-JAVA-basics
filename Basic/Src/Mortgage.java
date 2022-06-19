import java.util.Scanner;

public class Mortgage {
    public static void input() {

        try (Scanner data = new Scanner(System.in)) {
            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENT = 100;

            System.out.print("Principal : ");
            int principal = data.nextInt();

            System.out.print("Annual Intrest Rate : ");
            float annualIntrestRate = data.nextFloat();

            System.out.print("Period (Years) : ");
            int years = data.nextInt();

            float monthlyIntrestRate = annualIntrestRate / PERCENT / MONTHS_IN_YEAR;
            int numberOfPayments = years * MONTHS_IN_YEAR;

            double mortage = principal*(monthlyIntrestRate*Math.pow(1+monthlyIntrestRate, numberOfPayments))/(Math.pow(1+monthlyIntrestRate, numberOfPayments)-1);
                   
            System.out.println("Mortgage : " + mortage);
        }
        
    }
      
    public static void main(String[] args) {
        Mortgage.input();
    }
}
