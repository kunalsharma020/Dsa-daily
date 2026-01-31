class Solution {
    public int countHomogenous(String s) {
        int MOD = 1000000007;
        long count = 1, result = 1;  

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;  
            } else {
                count = 1;  
            }
            result = (result + count) % MOD;  
        }
        return (int) result;
    }
}

// 