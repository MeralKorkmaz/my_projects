package basic_calculator;

import java.util.Scanner;

public class BasicCalculator {

    public  String calculator(){
        double result = 0;
        Scanner scan = new Scanner(System.in);


        while(true){

            System.out.println("Enter first number or type 'exit' to stop operation");

            String input = scan.nextLine();

            if(input.equalsIgnoreCase("exit")){
                break;
            }

           double number;
            try{
                number = Double.parseDouble(input);
            }catch (NumberFormatException e){
                System.out.println("Please enter a valid number");
                continue;
            }

            System.out.println("Please enter the other number or type 'exit' to stop the operation");
            String input2 = scan.nextLine();
            double num2;
            if(input2.equalsIgnoreCase("exit")){
                break;
            }else{

                try{
                    num2 = Double.parseDouble(input2);
                }catch (NumberFormatException e){
                    System.err.println("Invalid input. Please enter a valid number.");

                    continue;
                }
            }


            System.out.println("Enter an operator (+, -, *, /): ");
            String operator = scan.nextLine();


            switch(operator){
                case "+":
                    result = number + num2;
                    break;
                case "-":
                    result = number - num2;
                    break;
                case "*":
                    result = number * num2;
                    break;
                case "/" :
                    if(num2 == 0){
                        System.err.println("You cannot divide number to 0. Please try another number");
                       continue;
                    }else{
                        result = number/num2;
                    }
                    break;
                default:
                    System.err.println("Invalid operator. Please enter one of +, -, *, /.");
                    continue;
            }

            System.out.println("The result is " + result);





        }

        return "Calculation ended.";

    }
}
