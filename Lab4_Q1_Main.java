import java.util.Scanner;

public class Lab4_Q1_Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        
        input.close();

        BMI BMI = new BMI(weight,height);

        System.out.println("Bmi is " + BMI.calculated_BMI());
        System.out.print(BMI.getInterpretation());

    }
}