public class Lesson4 {
    /*
создайте метод,
     */



    public static void main(String[] args) {
        int[] arr = getOddArray();
        double average = getAverage(arr);
        System.out.println(average);
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0; i<array.length; i++){
            //sum=sum+array[i];
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int[] getOddArray() {
        int[] result = new int[15];
        int current = 1;

        for (int i = 0; i < result.length; i++) {
            if (current < 30) {
                result[i] = current;
            }
            current = current + 2;
        }
        printForward(result);
        printReverse(result);

        return result;

    }

    public static void printForward(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printReverse(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
    }

/*
 */

    public static void method2() {
        int[] array = getArray(6,-10,10);
        int iMax = getMaxIndex(array);

        /*
        int iMax = 0;
        int max = array[iMax];
        for (int i = 1; i < array.length; i++) {
            //if (array[i] > max)
            if (array[i] > max) {
                //max = array[i];
                iMax = i;
            }

        }
        System.out.println("Maximum is array is:" + array[iMax]);
        */
        int iMin = getMixIndex(array);

        /* int iMin = 0;
        int min = array[iMin];
        for (int i = 1; i < array.length; i++) {
            //if (array[i] > min)
            if (array[i] < array[iMin]) {
                iMin = i;
            }
        }
        System.out.println("Minimum is array is:" + array[iMin]);
         */

        // 1 2 9 6 -1
        int temp = array[iMax]; //9
        array[iMax] = array[iMin]; //-1
        // 1 2 -1 6 -1
        array[iMin] = temp;
        //1 2 -1 6 9
    }

    public static int[] getArray(int capacity, int left, int right) {
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (right)) + left;
        }
        return array;
    }
    public static int getMaxIndex(int[] array) {
        int iMax = 0;
        int max = array[iMax];
        for (int i = 1; i < array.length; i++) {
            //if (array[i] > max)
            if (array[i] > max) {
                //max = array[i];
                iMax = i;
            }
        }
        System.out.println("Maximum is array is:" + array[iMax]);
        return iMax;
    }

    public static int getMixIndex(int[] array) {
        int iMin = 0;
        int min = array[iMin];
        for (int i = 1; i < array.length; i++) {
            //if (array[i] > min)
            if (array[i] < array[iMin]) {
                iMin = i;
            }
        }
        System.out.println("Minimum is array is:" + array[iMin]);
        return iMin;
    }
}





