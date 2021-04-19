package hu.nive.ujratervezes.zarovizsga.words;

public class Words {


    public boolean hasMoreDigits(String s) {
        double length = s.length();

        char[] array = s.toCharArray();

        int counterAlphabetic = 0;

        for (Character item : array
        ) {
            if (Character.isAlphabetic(item)) {
                counterAlphabetic++;
            }
        }

        return length / 2 > counterAlphabetic;
    }

}