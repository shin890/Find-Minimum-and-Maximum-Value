package academy.programming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int minValue=0, maxValue=0, var, counter=0;
	System.out.println("This program is made for getting the minimum and maximum values and \nTo get out of the program press any Alphabet :) ");
	Scanner scanner= new Scanner(System.in);

	while(true){

        System.out.println("Enter number: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            var= scanner.nextInt();

            if(counter==0)  minValue=var;

            else if(counter==1){
                if(minValue<var){
                    maxValue=var;
                }

                else if(minValue>var){
                    minValue=var;
                }
            }

            else{
                if(var<minValue){
                    minValue=var;
                }

                else if(var>maxValue){
                    maxValue=var;
                }
            }

            counter++;

        }

        else break;

    }

	scanner.close();

	if(counter==0) System.out.println("No value was inputted, please re-run the code using the values");

	else {
        System.out.println("The Minimum Value is " + minValue);
        System.out.println("The Maximum value is " + maxValue);
    }

    }
}
