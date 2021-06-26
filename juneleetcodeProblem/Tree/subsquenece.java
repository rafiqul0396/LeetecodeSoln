package juneleetcodeProblem.Tree;

public class subsquenece {

    public static void main(String[] args) {
        String s = "abcde";
        String str = "abcf";
        if (str.length() > s.length()) {
            System.out.println("false");
        }
        IsSquence(s, str);
    }

    private static void IsSquence(String s, String str) {
        int index_j = 0;
        for (int i = 0; i < s.length() && index_j < str.length(); i++) {
            if (s.charAt(i) == str.charAt(index_j)) {
                index_j++;
            }
        }
        if (index_j == str.length()) {
            System.out.println("this is subsequence of s");
        } else {
            System.out.println("this is not subsequence of s");
        }
    }

}
