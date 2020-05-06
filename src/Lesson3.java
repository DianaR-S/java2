import sun.security.mscapi.CPublicKey;

import java.sql.SQLOutput;

public class Lesson3 {
    public static void main1(String[] args) {
        myMethod(99.33, 99.3);

    }

    public static void myMethod(double n1, double n2) {
        if (n1 > n2) {
            System.out.println("N1 is bigger");
        } else {
            System.out.println("N2 is bigger");
        }
    }

    public static void main(String[] args) {
        int x = 5;

        // 0 1 2
        int[] arrayInt = {1, 2, 3};
        //First Index is 0!
        //Index Access:
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);

        //ArrayIndexOutOfBoundsException
        //System.out.println(arrayInt[2]);

        //Can provide size
        System.out.println(arrayInt.length);

        String[] arrStrFilled1 = {"OP", "TT", "RR"}; //готовый
        System.out.println(arrStrFilled1[2]);

        //String [] arrStrEmpty = new String[3]; //пустой - empty, 3 - не существует
        //Arrays are IMMUTABLE !!!

        int[][] squareArr = {
                {1, 2},
                {9, 8},
                {11, 99}
        };
        int[][] squareArrEmpty = new int[3][2];
        System.out.println(squareArr.length);
        System.out.println(squareArr[1].length);
        System.out.println(squareArr[2].length);

        //Iteration construction "for" - итерация

        String[] arrStrFilled = {"OP", "TT", "RR"};
        System.out.println(arrStrFilled);
        System.out.println(arrStrFilled);

        //1 -> 2 -> 3 -> 4 -> 2 -> ---
        //i - инициализируем -> 2                          4
        for (int i = 0; i < arrStrFilled.length; i++) {
            //  3
            System.out.println(arrStrFilled[i]);

        }
        printSum(100, 200 );

        int x1 = 500;
        int x2 = 1000;
        printSum(x1, x2);
        printSum(x1 + 1000, x2 + 2000);

        int summa = getSum(2, 5);
        System.out.println("Summa" + summa);

       //0..1   * 1000
        //1..1000 int

        int randomNumber = (int) (Math.random() * 1000);
        int randomNumber1 = getRandomFromRange(5, 1000);
        System.out.println(randomNumber);

    }
    public static int getRandomFromRange(int left, int right) {
        return (int) (Math.random() * right - left) + left;


    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Summa" + sum);
    }
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void prinInttArrey(int[] arreyToPrint) {
        System.out.print("[");

        for (int i = 0; i < arreyToPrint.length; i++) {
            System.out.println(arreyToPrint[i] + ",");
        }
        System.out.print("]");


    }

    public static int[] generateArrayOfInt(int cap, int left, int right) {
        int [] result = new int[cap];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * (right - left) + left);
        }
        return result;


    }

}
