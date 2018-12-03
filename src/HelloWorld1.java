public class HelloWorld1 {
    static String randomString = "This is a string";
    static final double PINUM = 3.141529;
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(randomString);
        System.out.println(PINUM);

        int integerOne = 22;

        int integerTwo = integerOne + 1;

        System.out.println(integerTwo);

        byte bigByte = 127;     //Stores whole numbers from -128 to 127
        short bigShort = 32767;     //Stores whole numbers from -32,768 to 32,767
        int bigInt = 2147483647;        //Stores whole numbers from -2,147,483.648 to 2,147,483,647
        long bigLong = 922337203685477580L;     //	Stores whole numbers from -9,223.372,036.854,775.808 to 9,223.372,036,854,775,808
        float bigFloat = 3.14F;     //stores floating point numbers, with decimals, such as 19.99 or -19.99. min: 3.4e−038 max: 3.4e+038
        double bigDouble = 3.145675876976587543; //Stores fractional numbers from 1.7e−308 to 1.7e+038.

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 65; //character
        char anotherChar = 'A'; //character

        char escapedChars = '\\';

        String randomString = "I like my burger with";
        String randomString1 = "extra bacon please.";
        String randomString2 = randomString + " " + randomString1;

        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);

        System.out.println(randomChar);
        System.out.println(anotherChar);
        System.out.println(escapedChars);
        System.out.println(randomString2);

        System.out.print(byteString);
        System.out.print(shortString);
    }
}
