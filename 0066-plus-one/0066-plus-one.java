class Solution {
    public int[] plusOne(int[] digits) {

        // Start from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and continue
            digits[i] = 0;
        }

        // If all digits were 9 (example: 9, 99, 999)
        int[] result = new int[digits.length + 1];
        result[0] = 1;   // first digit becomes 1
        return result;
    }
}
