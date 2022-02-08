public class BMI{

  private double weight,height,weight_kg,height_cm;
  
    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.weight_kg = weight*0.45359237;
        this.height_cm = height*0.0254;
    }

    public double calculated_BMI(){
        double calculated_BMI = this.weight_kg/(Math.pow(this.height_cm,2));
        return calculated_BMI;
    }

    public String getInterpretation(){
        double calculated_BMI = calculated_BMI();
        if(calculated_BMI < 18.5){
            return "Underweight";
        }
        else if(calculated_BMI >= 18.5 && calculated_BMI<25){
            return("Normal");
        }
        else if(calculated_BMI >= 25 && calculated_BMI<30){
            return("Overweight");
        }
        else if(calculated_BMI >= 30){
            return("Obese");
        }
        return "Invalid";
    }
}