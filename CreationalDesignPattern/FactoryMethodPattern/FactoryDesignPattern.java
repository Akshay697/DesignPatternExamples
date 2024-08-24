import java.util.Scanner;
import java.util.logging.*;

class FactoryDesignPattern {

    static Logger LOGGER = Logger.getLogger(FactoryDesignPattern.class.getName());
    public static void main(String args[]){
        // example of factoryDesignPattern
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        LOGGER.info("Choose from the below option to generate the bill for \n            1. Domestic plan\n            2. Institual plan\n            3. Commericial plan\n        ");
        LOGGER.info("Please enter your option no. \n");
        Scanner scan = new Scanner(System.in);
        String planType = scan.nextLine();
        scan.close();
        Plans choosenPlan = null;
        
        switch (planType) {
            case "1": choosenPlan = Plans.DOMESTICPLAN;
                      break;
            case "2": choosenPlan = Plans.INSTITUTIONALPLAN;
                      break;
            case "3": choosenPlan = Plans.COMMERCIALPLAN;
                      break;
            default:  choosenPlan = null;
                      break;          
        }

        LOGGER.info("You have choosen plan"+choosenPlan.name());
        LOGGER.info("Generating Bill");

        Plan plan = getPlanFactory.getPlan(choosenPlan);
        plan.getRate();
        plan.calculateBill(3);

    }
}