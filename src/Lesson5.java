public class Lesson5 {
    public static void main(String[] args) {
        int a = 10;
        int k = 2;
        /*while (a > 1) {
            a = a - 2;
            k = k + 1;
        }*/
        do {
            a = a - 2;
            k = k + 1;
        }
        while (a > 1);

        System.out.println("K" + k);
        System.out.println("A" + a);

        int l = 5;
        int j = 0;
        while (l > 10) {
            l += 3;
            j -= 10;
        }
        System.out.println("L" + l);
        System.out.println("J" + j);

        int q = 0;
        int w = 20;
        while (q > 10) {
            q += 1;
            w += 10;
            if (w < 30) {
                continue;
            }
            System.out.println("Hello!!!");
        }
        System.out.println("Q" + q);
        System.out.println("W" + w);

        int q1 = 0;
        int w1 = 20;
        while (q1 > 10) {
            q1 += 1;
            w1 += 10;
            if (w1 < 30) {
                break;
            }
            if (true) {
                continue;
            }
            System.out.println("Hello!!!");
        }
        System.out.println("Q!" + q1);
        System.out.println("W!" + w1);

        int i1 = 1;
        int i2 = 1;
        while (i1 != i2) {
            System.out.println("Hei!");
        }
        do {
            System.out.println("Hey from DO!!!");
        } while (i1 != i2);

        //String name = "Ivan";
        //boolean isStartFromI = name.startsWith("I");
        //boolean xx = name.startsWith("I");
        //boolean xy = name.contains("");
        //int L = name.Length();

        String[] strings = {"Ivan", "Joe", "Petr", "Olga", "Ilja"};
        int index = 0;
        while (index < strings.length) {
            if (strings[index].startsWith("I")) {
                System.out.println(strings[index]);
            }
            index++;
        }

        /*int index1 = 0;
        while (index < strings.length){
            System.out.println(string[index1]+ strings[index1].length());
            index1++;
        }
        //Ivan - 4
        //Joe - 3 */
        printNameAndSize(strings);


        String sentence = "Hello my friend, How are you";
        String[] words = sentence.split("");
        //String[] words = sentence.split("b");
        printNameAndSize(words);
        //System.out.println(words);

    }
    public static void printNameAndSize(String[] names){
        int index=0;
        while (index<names.length){
        //while (index>names.length){
            String name = names[index];
            System.out.println(name+ "-" + name.length());
            index++;
            //index--;
        }
    }

}
