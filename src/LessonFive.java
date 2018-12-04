//Covering methods, or functions in Java.
public class LessonFive {
    public static void main(String[] args) {
        System.out.println(addThem(1, 2));

        int d = 5;
        tryToChange(d);
        System.out.println("main d = " + d);

    }
    public static int addThem(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void tryToChange (int d) {
        d = d + 3;
        System.out.println("tryToChange d = " + d);
    }
}
