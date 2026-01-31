class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {  
                i++;  // Move to next character in 's'
            }
            j++;  // Always move to the next character in 't'
        }
        
        return i == s.length();  // If we matched all characters of 's', return true
    }
}

// 
