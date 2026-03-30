class Solution {
    public boolean isPalindrome(String s) {
        String stringWithoutSpaces = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        

        String reversed = new StringBuilder(stringWithoutSpaces).reverse().toString();
        return stringWithoutSpaces.equals(reversed);
    }
}
