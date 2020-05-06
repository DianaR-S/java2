public class Lesson1 {
    //score 1
    public static void main(String[] args) {
        //Down casting - от высшего к низшему
        int a = 12;
        long b = 12l;
        a = (int) b;
        System.out.println("b=" + b);
        System.out.println("a=" + a);

        //Up casting - их иалого в большой поместится без проблем
        int t = 12;
        double d = 12.99;
        d = (double) t;
        System.out.println(d);

        int i = 1;
        //i=i+1;
        i++;
        System.out.println(i);

        int i1 = 1;
        //i1=i1-1;
        i1--;
        System.out.println(i1);

        int i2 = 1000;
        //i2=i2+5;
        i2 += 5;
        System.out.println(i2);

        int i3 = 1000;
        //i3=i3*6;
        i3 *= 6;
        System.out.println(i3);

        //post fix
        //pre fix
        int tt = 5;
        System.out.println(++tt);
        System.out.println(tt);
        //post fix
        System.out.println(tt++);
        System.out.println(tt);


    }

}
