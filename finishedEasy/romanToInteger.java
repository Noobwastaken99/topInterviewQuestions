package finishedEasy;
/* Question 13. Roman to Integer (easy)
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.


Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/

public class romanToInteger {

    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
    }

    public static int solution(String s) {
        int num = 0;
        String rn = "IVXLCDM";
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            // This is M
            if (arr[i] == rn.charAt(6)) {
                num += 1000;
            }
            // This is D
            if (arr[i] == rn.charAt(5)) {
                num += 500;
            }

            // This is C
            if (arr[i] == rn.charAt(4) && (i+1) < arr.length && arr[i+1] == rn.charAt(6)) {
                num += 900;
                i++;
            } else if (arr[i] == rn.charAt(4) && (i+1) < arr.length && arr[i+1] == rn.charAt(5)) {
                num += 400;
                i++;
            } else if (arr[i] == rn.charAt(4)) {
                num += 100;
            }

            // This is L
            if (arr[i] == rn.charAt(3)) {
                num += 50;
            }

            // This is X
            if (arr[i] == rn.charAt(2) && (i+1) < arr.length && arr[i+1] == rn.charAt(4)) {
                num += 90;
                i++;
            } else if (arr[i] == rn.charAt(2) && (i+1) < arr.length && arr[i+1] == rn.charAt(3)) {
                num += 40;
                i++;
            } else if (arr[i] == rn.charAt(2)) {
                num += 10;
            }

            // This is V
            if (arr[i] == rn.charAt(1)) {
                num += 5;
            }

            // This is I
            if (arr[i] == rn.charAt(0) && (i+1) < arr.length && arr[i+1] == rn.charAt(2)) {
                num += 9;
                i++;
            } else if (arr[i] == rn.charAt(0) && (i+1) < arr.length && arr[i+1] == rn.charAt(1)) {
                num += 4;
                i++;
            } else if (arr[i] == rn.charAt(0)) {
                num += 1;
            }
        }

        return num;
    }
    
}
