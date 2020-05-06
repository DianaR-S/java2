public class HomeWork4 {
    public static void main(String[] args) {
        int[] array = getFiboMunbersArray(20);
        // prinInttArrey(array); // вызвать метод
        printHello(3);
        printByWhile(array);

        int a = 10;
        int k = 2;
        while (a > 1) {
            a = a - 2;
            k = k + 1;
        }
        System.out.println("K" + k);
        System.out.println("A" + a);

        int l = 5;
        int j = 0;
        while (l > 10) {
            l += 3;
            j -= 10;
        }
        System.out.println("L" +l);
        System.out.println("J" +j);


    }

    public static void prinInttArrey(int[] arreyToPrint) {
        System.out.print("[");

        for (int i = 0; i < arreyToPrint.length; i++) {
            System.out.print(arreyToPrint[i] + ",");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printByWhile(int[] arr) {
        System.out.println("[");
        int count = 0;
        while (count < arr.length) {
            System.out.print(arr[count]);
            System.out.print(",");
            count++;
        }
        System.out.println("]");
        System.out.println();
    }

    /*
    1. Cоздайте метод. Kotorij sozdajot i vozvrashaet massiv iz pervih dvadcati chisel Fibinachi. Vyvesti rezultaty v console;
2. Cоздайте метод. Kоторый принимает в параметре массив и выводит на печать количество четных и нечетных элементов;
3. Cоздайте метод. Kоторый принимает в параметре массив и выводит на печать индекс последнего вхождения максимального и минимального элемента,
количество вхождений максимального и минимального элемента;
4. Cоздайте метод. Kotorij prinimaet v paramerte dva massiva int i double odinakovoi dliny. Metod doljen vernut massiv sostojashij iz proizvedenija i-go elementa pervogo i vtorogo massiva,
Raspechataite soderjimoe rezultirujushego massiva;
5. Cоздайте метод. Kotorij prinimaet v parametre dvumernij massiv int. i Vyvodit na pechat vse elementy v vide marticy(tablicy);
6. *Cоздайте метод. Kotorij prinimaet v parametre dvumernij massiv int. i nahodit summu vseh elementov;
7. *Cоздайте метод. Kotorij prinimaet v parametre dvumernij massiv int. i nahodit min, max i menjaet ih mestami;
8. Izuchit kak rabotaet cykl "While" i "Do While".
     */
    //Fibinachi - 0-1-1-2-3-5-8-
    public static int[] getFiboMunbersArray(int cap) {
        int[] fiboArray = new int[cap];
        for (int i = 0; i < fiboArray.length; i++) {
            if (i == 0) {
                fiboArray[i] = 0;
                continue;
            }
            if (i == 1) {
                fiboArray[i] = 1;
                continue;
            }
            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
        }
        return fiboArray;
    }

    /*8 "While" i "Do While"
     */
    //0 2 4 6 ... napechatat pervie 20
    public static void printHello(int printCount) {
        int count = 0;
        while (count < printCount) {
            System.out.println("Hello");
            count++;
        }
    }
}
