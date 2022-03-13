

public class PermutationString {

    static void allLexicographicRecur(String str, char[] data,
                                      int last, int index) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            data[index] = str.charAt(i);
            if (index == last)
                System.out.println(new String(data));
            else
                allLexicographicRecur(str, data, last,
                        index + 1);
        }
    }
    static void allLexicographic(String str) {
        int length = str.length();
        char[] data = new char[length];
        char[] temp = str.toCharArray();
        str = new String(temp);
        allLexicographicRecur(str, data, length - 1, 0);
    }
    public static void main(String[] args) {
        String str = "PQR";
        System.out.printf("All permutations with " +
                "repetition of %s are: \n", str);
        allLexicographic(str);
    }
}

