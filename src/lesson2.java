import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class lesson2 {
    public static void main(String[] args) {
        // >, <, ==, >=, <=, !=(не равно)
        System.out.println("7>8=" + (7 > 8));
        System.out.println("7<8=" + (7 < 8));
        System.out.println("7==8=" + (7 == 8));
        System.out.println("7>=8=" + (7 >= 8));
        System.out.println("7<=8=" + (7 <= 8));
        System.out.println("7!=8=" + (7 != 8));

        boolean expr1 = 7 > 6;
        boolean expr2 = 8 > 6;
        boolean expr3 = 10 > 6;

        //& -> LOGICAL AND
        //&& -> speedup calculation - ускоряет вычислнние
        boolean result = expr1 & expr2 & expr3;
        System.out.println("AND result:" + result);

        int x = 7;
        //Chek if numbers are from the range [5..9); [ - включительно, ( -не включительно
        boolean fromRange = x >= 5 && x < 9;
        System.out.println("Belong to the range [5..9): + fronRange");
        System.out.println("Doesn´t belong to the range [5..9): + !fromRange");

        // ! -> LOGICAL NOT
        boolean t = true;
        boolean t1 = !t;

        System.out.println("t=" + t);
        System.out.println("t1=" + t1);

        // | -> LOGICAL OR

        //Chek if numbers are from the range [2..5), (10..12);
        int x1 = 3;
        boolean fromRange1 = x >= 2 && x < 5;
        boolean fromRange2 = x > 10 && x < 12;

        boolean resultForOR = fromRange1 || fromRange1;
        // или boolean resultForOR = (x >= 2  && x< 5) || (x >10  && x< 12);
        System.out.println("Belong to the range [2..5),(10..12):" + resultForOR);

        //Ternary operator - (= bb ? "TRUE" : "FALSE")
        boolean bb = true;

        String str = bb ? "TRUE" : "FALSE";
        System.out.println(str);

        //задача:


        //int strp = resultp ? n : m;
       // int strp = Math.abs(target - n) < Math.abs(target - m) ? n : m;
        //System.out.println(strp);

        boolean a = true;
        boolean b = false;
        if (true) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        // треугольник
        int at = 10;
        int bt = 10;
        int ct = 10;
        if (at + bt > ct && at + ct > bt & ct + bt > at) {
            System.out.println("Triangle!!!");
        } else {
            System.out.println("Not possible!!!");
        }


        // switch / case
        int r = 1;
        switch (r) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Def");
        }
        printNumber(5, "EE");
        printNumber(9, "DD");
        printNumber(222, "CC");



    }

    public static void printClosest(int m, int n, int target) {

        //int m = 5;
        //int n = 31;
        //int target = 20;
        //printClosest(m : 8, n:11, target:10)

        int resM = Math.abs(target - m);
        int resN = Math.abs(target - n);
        int strp = resN < resM ? n : m;
        int resultp = resN < resM ? n : m;
        boolean str = Math.abs(target - n) < Math.abs(target - m);
    }

    public static void printNumber(int number, String username) {
        //number++;

        //number *=10;
        //System.out.println(number);

        System.out.println("Number is" + number + "!!!");
        System.out.println("End!");

        //void + printNumber (имя) + int number (значение - сигнатура метода)

        double dd = 1.03;
        System.out.println("Username is" + username);
    }


}