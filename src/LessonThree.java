//if statement, relational operators, logical operators, ternary operator and the switch statement.

public class LessonThree {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 50);

        /* Relational Operators:
        Java has 6 relational operators
        > : Greater than
        < : Less Than
        == : Equal To
        != : Not Equal To
        >= : Greater Than Or Equal To
        <= : Less Than Or Equal To
         */

        System.out.println("The random number is: " + randomNumber);
        if (randomNumber < 25) {
            System.out.println("The random number is less than 25");
        } else if (randomNumber > 40) {
            System.out.println("The random number is greater than 40");
        } else {
            System.out.println("The random number is greater than 25");
        }

        if (!(false)) {
            System.out.println("\nI turned false into true"); // Using \n will skip to a new line
        }
        if (!(false) && (true)) {
            System.out.println("Both are true");
        }
        int valueOne = 1;
        int valueTwo = 2;

        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
        System.out.println(biggestValue);

        char theGrade = 'a';

        switch (theGrade) {
            case 'A':
            case 'a':
                System.out.println("Great Job!");
                break;
            case 'B':
                System.out.println("Nice!");
                break;
            case 'C':
                System.out.println("Alright");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("You Failed");
                break;
        }
    }
}
