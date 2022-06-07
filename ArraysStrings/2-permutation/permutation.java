class Permutation {
    private static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return sort(s1).equals(sort(s2));
    }

    public static void main(String args[]) throws Exception {
        if (!isPermutation("abcdeflou", "flouabcde")) {
            throw new Exception("1");
        }
        if (isPermutation("abcdefloul", "kvcnsdx")) {
            throw new Exception("2");
        }
    }
}
