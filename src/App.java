//Part 1 - Write a program where a user enters the grade of a student and the program returns a grade based on the following conditions:
// Failed if they scored 3 or less 
//Insufficient if they scored > 3 but less than 5. (5 included)
//Good if they scored > 5 but less than 8. (8 included)
// Excellent Grade if they scored 10.
// if participants enter a negative number or a number outside the range supported (outside 0 - 10)

import java.util.Scanner; //importing the scanner class

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creating a new scanner object
        System.out.println("Enter your grade: "); //prompting the user to enter their grade
        int grade = input.nextInt(); //assigning the user's grade to the variable grade
        
        if (grade <= 3) { //if the user's grade is less than 3   
            System.out.println("You failed the class.");
        } else if (grade > 3 && grade <= 5) {
            System.out.println("Your grade is insufficient.");
        } else if (grade > 5 && grade <=8) {
            System.out.println("Your grade is good.");
        } else if (grade == 10) {
            System.out.println("You got an excellent grade!");
        } else {
            System.out.println("You entered an invalid grade.");
        }  //end of if statement
        
    }
}





