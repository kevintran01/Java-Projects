// While loops. Examples including how to calculate PI with a while loop.
//Do / for loop.
import java.util.Scanner;

public class LessonFour {

    static Scanner userinput = new Scanner (System.in);

    public static void main(String[] args) {
        int i = 0;
        while (i <= 20) {
            if (i == 3) {
                i+=2;
                continue;
            }
            System.out.println(i);
            i++;

            if((i % 2) == 1) {
                i++;
            }
            if (i == 10) {
                System.out.println("10 is my favorite number!");
            }
        }
        double myPi= 4.0;

        double j = 3.0;

        while (j < 11) {
            myPi = myPi - (4/j) + (4/(j+2));
            j += 4;
            System.out.println(myPi);
        }
        System.out.println("Value of PI: " + Math.PI);

        String contYorN = "Y";

        int h = 1;

        while (contYorN.equalsIgnoreCase("y")) {
            System.out.println(h);
            System.out.println("Continue y or n?");
            contYorN = userinput.nextLine();
            h++;
        }
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k < 10);
        k++;

        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }
    }
}
