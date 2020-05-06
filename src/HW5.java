public class HW5 {
    public static void printRevers(String sentence) {
        String[] words =
                sentence.split("");
        int index = words.length - 1;
        while (index >= 0) {
            System.out.println(words[index]);
            index--;
        }
    }

    public static String findShorttest(String[] strAr) {
        String aa = strAr[0];
        for (int i = 1; i < strAr.length; i++) {
            if (aa.length() > strAr[i].length()) {
                aa = strAr[i];
            }
        }
        return aa;
    }
}

