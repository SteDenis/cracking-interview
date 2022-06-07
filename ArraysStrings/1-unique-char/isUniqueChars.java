// This method assume that the string is ASCII only

class isUniqueChars {

    // Complexity time O(n) and complexity space O(1)
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] charset = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charset[val]) {
                return false;
            }
            charset[val] = true;
        }
        return true;
    }

    public static void main(String args[]) throws Exception {
        if (!isUniqueChars("abcdeflou")) {
            throw new Exception("1");
        }
        if (isUniqueChars("abcdefloul")) {
            throw new Exception("2");
        }
    }
}
