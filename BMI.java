public class BMI{

  private double weight,height,weight_kg,height_cm;
  private static final double POUND_TO_KG = 0.45359237;
  private static final double INCHES_TO_CM = 0.0254;

  
    public BMI(double weight, double height) {
        this.weight = weight*POUND_TO_KG;
        this.height = height*INCHES_TO_CM;
    }

    public double calculated_BMI(){
        double calculated_BMI = this.weight/(Math.pow(this.height,2));
        return calculated_BMI;
    }

    public String getInterpretation(){
        double calculated_BMI = calculated_BMI();
        if(calculated_BMI < 18.5){
            return "Underweight";
        }
        else if(calculated_BMI<25){
            return("Normal");
        }
        else if(calculated_BMI<30){
            return("Overweight");
        }
        else if(calculated_BMI >= 30){
            return("Obese");
        }
        return "Invalid";
    }
}
