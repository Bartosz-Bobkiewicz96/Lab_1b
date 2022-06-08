package pl.lublin.wsei.java.cwiczenia.myLib;


import java.util.Locale;

public class StringFun {
    public static String transliteracja(String arg) {
        var result = new StringBuilder();

        for (int indeks = 0; indeks < arg.length(); indeks++) {
            var orignalneLitery = arg.charAt(indeks);
            var litery = String.valueOf(orignalneLitery);


            if (Character.isUpperCase(orignalneLitery) == true) {
                var l1 = litery.toLowerCase(Locale.ROOT);
                result.append(l1);
            } else {
                var l2 = litery.toUpperCase(Locale.ROOT);
                result.append(l2);
            }
        }
        return result.toString();
    }

    public static String camelize(String arg) {

        String[] words = arg.split("[\\W_]+");


        var result = new StringBuilder();


        for (int index = 0; index < words.length; index++) {
            String word = words[index];
            if (index == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();

            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();

            }
            result.append(word);
        }
        return result.toString();
    }
}

