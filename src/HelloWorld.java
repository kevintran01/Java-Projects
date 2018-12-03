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
                System.out.println("d");
                x = x - 1;
            }
        }
        int a = 0;
        int b = 0;
        while (a < 5) {
            b = a - b;
            System.out.println(a + "" + b + " ");
            a = a + 1;
        }
        int c = 0;
        int d = 0;
        while (c < 5) {
            d = d + c;
            System.out.print(c + "" + d + " ");
            c = c + 1;
        }
        int e = 0;
        int f = 0;
        while (e < 5) {
            f = f + 2;
            if (f > 4) {
                f = f - 1;
            }
            System.out.println(e + "" + f + " ");
            e = e + 1;
        }
        int g = 0;
        int h = 0;
        while (g < 5) {
            g = g + 1;
            h = h + g;
            System.out.print(g + "" + h + " ");
            g = g + 1;
        }
        int i = 0;
        int j = 0;
        while (i < 5) {
            if (j < 5) {
                i = i + 1;
                if (j < 3) {
                    i = i - 1;
                }
            }
            j = j + 2;
            System.out.print(i + "" + j + " ");
            i = i + 1;
        }
        int k = 0;
        while (k < 4) {
            System.out.print("a");
            if (k < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (k > 1) {
                System.out.print(" oyster");
                k = k + 2;
            }
            if (k == 1) {
                System.out.print("noys");
            }
            if (k < 1) {
                System.out.print("oise");
            }
            System.out.println("");
            k = k + 1;
        }

        int l = 0;
        while (l < 10) {
            l = l + 1;
            if (l > 7) {
                System.out.println("big l");
            }
        }
        int m = 0;
        while (m > 1) {
            m = m - 1;
            if (m < 3) {
                System.out.println("small m");
            }
        }
    }
}
//instance variables of a tv
//turns off and on, controls volume and channels
//setOff, setOn, setVolume, setChannel