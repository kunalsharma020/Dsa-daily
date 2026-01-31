class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray(); // Convert string to character array
        int i = 0, j = arr.length - 1;
        String vowels = "aeiouAEIOU"; // Vowel set

        while (i < j) {
            // Move left pointer until it finds a vowel
            if (vowels.indexOf(arr[i]) == -1) {
                i++;
                continue;
            }
            // Move right pointer until it finds a vowel
            if (vowels.indexOf(arr[j]) == -1) {
                j--;
                continue;
            }
            // Swap vowels
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr); // Convert back to string
    }
}
