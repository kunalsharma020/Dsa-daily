class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int lastDigit = x % 10; // Get the last digit
            rev = rev * 10 + lastDigit; // Shift left and add digit
            x = x / 10; // Remove the last digit from x
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}
