class Solution {
    public int countVowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);
            if ((first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') &&
                (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')) {
                count++;
            }
        }
        return count;
    }
}
