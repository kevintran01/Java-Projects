public class HelloWorld {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "smart"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "outside-the-box", "positioned", "networked"};
        String[] wordListThree = {"process", "tipping-point", "solution", "core competency", "strategy", "mindshare"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Generating three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //building a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] +
                " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase + ".");

        int x = 3;
        if (x > 2) {
            System.out.print("a");
        }
        x = x - 1;
        System.out.print("-");
        while (x > 0) {
            if (x == 2) {
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
