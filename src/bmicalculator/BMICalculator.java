/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmicalculator;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Jericko James Tano
 */
public class BMICalculator {

    /**
     * @parjeocam args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);         //By Jericko James Tano     // System.exit(0);//close program //https://www.wikihow.com/Calculate-Your-Body-Mass-Index-%28BMI%29 
        DecimalFormat f = new DecimalFormat("##.##");

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("      BMI Calculator with Metric and Imperial units with all greatest what ifs");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Press 1 to access Metric units menu");
        System.out.println("Press 2 to access Imperial units menu");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.print("Enter number with your desired units: ");
        int menu1 = myScan.nextInt();

        if (menu1 == 1) {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("                                     Metric Units");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Press 1 if your height is in meters");
        System.out.println("Press 2 if your height is in centimeters");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.print("Enter your height unit: ");
        double height = myScan.nextDouble();

        if (height == 1) {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("                                Metric Units (Height in m)");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print(  "Enter your height in meters: ");
            double heightm = myScan.nextDouble();
            System.out.print(  "Enter your weight in kilograms: ");
            double weightkg = myScan.nextDouble();
            System.out.println("--------------------------------------------------------------------------------------");
            double sqheight = heightm * heightm;
            double getres = weightkg / sqheight;
            if (getres < 15) {
                System.out.println(  f.format(getres) + " - Very severely underweight");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 15 && getres < 16) {
                System.out.println(  f.format(getres) + " - Severly underweight");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 16 && getres < 18.5) {
                System.out.println(  f.format(getres) + " - Underweight");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 18.5 && getres < 25) {
                System.out.println(  f.format(getres) + " - Normal");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 25 && getres < 30) { 
                System.out.println(  f.format(getres) + " - Overweigth");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 30 && getres < 35) {
                System.out.println(  f.format(getres) + " - Moderately obese");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 35 && getres < 40) {
                System.out.println(  f.format(getres) + " - Severly obese");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres < 40) {
                System.out.println(  f.format(getres) + " - Very severly obese");
                System.out.println("--------------------------------------------------------------------------------------");  
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }
                
            } 

        } else if (height == 2 ) {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("                          Metric Units (Height in cm)");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print(  "Enter your height in cm: ");
            double heightcm = myScan.nextDouble();
            System.out.print(  "Enter your weight in kilograms: ");
            double weightkg = myScan.nextDouble();
            System.out.println("--------------------------------------------------------------------------------------");
            int multi = 10000;
            double getres = (weightkg / heightcm / heightcm) * multi ;
            if (getres < 15) {
                System.out.println(  f.format(getres) + " - Very severely underweight");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 15 && getres < 16) {
                System.out.println(  f.format(getres) + " - Severly underweight");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 16 && getres < 18.5) {
                System.out.println(  f.format(getres) + " - Underweight");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 18.5 && getres < 25) {
                System.out.println(  f.format(getres) + " - Normal");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 25 && getres < 30) { 
                System.out.println(  f.format(getres) + " - Overweigth");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 30 && getres < 35) {
                System.out.println(  f.format(getres) + " - Moderately obese");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres >= 35 && getres < 40) {
                System.out.println(  f.format(getres) + " - Severly obese");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (getres < 40) {
                System.out.println(  f.format(getres) + " - Very severly obese");
                System.out.println("--------------------------------------------------------------------------------------");  
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }
                
            } 
            
        } else {
            main(args);
        }

        } else if (menu1 == 2) {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("                                 Imperial Units");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print("Enter height in inch: ");
            double heightin = myScan.nextDouble();
            System.out.println("Enter weight in pounds: ");
            double weightpnd = myScan.nextDouble();
            System.out.println("--------------------------------------------------------------------------------------");
            double heightsq = heightin * heightin;
            double convert =  (weightpnd / heightsq) * 703;

            if (convert < 15) {
                System.out.println(  f.format(convert) + " - Very severely underweight");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (convert >= 15 && convert < 16) {
                System.out.println(  f.format(convert) + " - Severly underweight");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (convert >= 16 && convert < 18.5) {
                System.out.println(  f.format(convert) + " - Underweight");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (convert >= 18.5 && convert < 25) {
                System.out.println(  f.format(convert) + " - Normal");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (convert >= 25 && convert < 30) { 
                System.out.println(  f.format(convert) + " - Overweigth");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (convert >= 30 && convert < 35) {
                System.out.println(  f.format(convert) + " - Moderately obese");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (convert >= 35 && convert < 40) {
                System.out.println(  f.format(convert) + " - Severly obese");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }

            } else if (convert < 40) {
                System.out.println(  f.format(convert) + " - Very severly obese");
                System.out.println("--------------------------------------------------------------------------------------");  
                System.out.println(  "Would you like to get BMI again?");
                System.out.print(  "Press 1 if you want to convert again, Press 2 if you want to exit now: ");
                int convertagain = myScan.nextInt();

                if (convertagain == 1 ) {
                    main(args);

                } else if (convertagain == 2 ) {
                    System.exit(0);
                }
                
            } 
            

        } else {
            System.out.println("Entered number does not match to units");
            System.out.println("Read and enter code again!");
            main(args);
        }
    myScan.close();
    } 
    
} 


/*
 * 
 Less than 15 = Very severely underweight 
bmi >= 15 but bmi < 16 = Severely underweight
bmi >= 16 but bmi < 18.5 =  Underweight
bmi >= 18.5 but bmi < 25 = Normal (healthy weight)
bmi >= 25 but bmi < 30 = Overweight
bmi >= 30 but bmi < 35 = Moderately obese
bmi >= 35 but bmi < 40 = Severely obese
bmi > 40 = Very severely obese



IDK the source of this :)
 */