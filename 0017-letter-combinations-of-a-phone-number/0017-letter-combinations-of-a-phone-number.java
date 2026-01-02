import java.util.*;

class Solution {

    // Mapping digits to letters
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        // If input is empty, return empty list
        if (digits == null || digits.length() == 0) {
            return result;
        }

        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current,
                           String digits, int index) {

        // If current combination length equals digits length
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get letters corresponding to current digit
        String letters = KEYPAD[digits.charAt(index) - '0'];

        // Try each letter
        for (char ch : letters.toCharArray()) {
            current.append(ch);           // choose
            backtrack(result, current, digits, index + 1); // explore
            current.deleteCharAt(current.length() - 1);   // un-choose
        }
    }
}
