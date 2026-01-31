class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        int lastSpace = s.lastIndexOf(" "); // Find the last space
        
        return s.length() - lastSpace - 1; // Length of last word
    }
}
