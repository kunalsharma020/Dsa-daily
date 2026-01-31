class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // If mapping is not same, return false
            if (sMap[ch1] != tMap[ch2]) return false;

            // Store current index + 1 as mapping value (to avoid default 0 confusion)
            sMap[ch1] = i + 1;
            tMap[ch2] = i + 1;
        }
        return true;
    }
}
