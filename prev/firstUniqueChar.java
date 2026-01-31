class Solution {
    public int firstUniqChar(String s) {
        // Array to store character counts
        int[] count = new int[26];

        // First loop: Count each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        // Second loop: Find the first character with count = 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c - 'a'] == 1) {
                return i; // First unique character's index
            }
        }

        // If no unique character is found
        return -1;
    }
}
