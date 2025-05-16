import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeightConversion {

        public static void weightConverter(Scanner scanner) {
            System.out.println("How many weights do you want to enter?");
            int count = scanner.nextInt();
            // Make it so a person can type in a list of weights all at once instead of typing in each weight one by one
            List<Integer> weights = new ArrayList<>();
            {
                int i = 0;
                while (i < count) {
                    System.out.println("Enter weight" + (i + 1) + ": ");
                    int weight = scanner.nextInt();
                    weights.add(weight);
                    System.out.println("Is this the last weight?(y/n)");
                    String contuine = scanner.nextLine();
                    if (contuine.equalsIgnoreCase("n")) {
                        System.out.println("Enter weight" + (i + 1) + ": ");
                        weight = scanner.nextInt();
                    } else {
                        conversionMath(weight);
                        return;

                    }
                }
            }
        }

        private static void conversionMath (int weight){
            Scanner scanner = new Scanner(System.in);
            final String[] weightUnits = {"KG,LBS,Viss"};
            System.out.println("Select a choice from the list" + weightUnits);
            // This is converts the weight
            System.out.println(weightUnits);
            if (weightUnits.equals("KG")) {
                System.out.println("What would you like to convert to? (LBS or Viss)");
                String conversionChoice = scanner.nextLine();
                if (conversionChoice == "LBS") {
                    int newWeight = (int) (weight * 2.2046);
                    System.out.println("Weight in LBS is" + newWeight);
                }
            } else {
                int newWeight = (int) (weight * 0.613);
                System.out.println("Weight in Viss is" + newWeight);
            }
            if (weightUnits.toString().equalsIgnoreCase("LBS")) {
                System.out.println("What would you like to convert to? (KG or Viss)");
                String conversionChoice = scanner.nextLine();
                if (conversionChoice.toLowerCase().startsWith("k")) {
                    int newWeight = (int) (weight / 2.2046);
                    System.out.println("Weight in LBS is:" + newWeight);
                } else {
                    int newWeight = (int) (weight * 0.2835);
                    System.out.println("Weight in Viss is:" + newWeight);
                }

            }
            if (weightUnits.equals("Viss")) {
                System.out.println("What would you like to convert to? (KG or LBS)");
                String conversionChoice = scanner.nextLine();
                if (conversionChoice.toLowerCase().startsWith("k")) {
                    int newWeight = (int) (weight * 1.6);
                    System.out.println("Weight in KG is:" + newWeight);
                } else {
                    int newWeight = (int) (weight * 3.527);
                    System.out.println("Weight in LBS is:" + newWeight);
                }
            }
            System.out.println("Would you like to convert to Tons?(y/n)");
            String getBigger = scanner.nextLine();
            if (getBigger.equalsIgnoreCase("yes")) {
                getTons();
            } else {
            }
        }
        //This allows someone to make the weight into tons which could be used for shipping on a freighter or another method business may use
        public static void getTons() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the weight?");
            int weight = scanner.nextInt();
            System.out.println("What is the unit of weight?");
            String unit = scanner.nextLine();
            if (unit.equalsIgnoreCase("kg")) {
                int tonsWeight;
                tonsWeight = (int) (weight / 1000);
            }
            if (unit.equalsIgnoreCase("lbs")) {
                int tonsWeight;
                tonsWeight = (int) (weight / 2000);
            }
        }



    }

