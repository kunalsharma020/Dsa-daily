class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;  

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;  
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;  // Valid long press, just move in typed
                continue;
            } else {
                return false;  // If character doesn't match and isn't a long press, return false
            }
            j++;  // Always move in typed
        }

        return i == name.length();  // Ensure all characters in name are matched
    }
}
