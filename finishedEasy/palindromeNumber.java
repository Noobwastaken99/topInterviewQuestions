package finishedEasy;
/* Question 9. Palindrome Number (easy)
Given an integer x, return true if x is a palindrome, and false otherwise.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?
*/


public class palindromeNumber {

    public static void main(String[] args) {
        int test1 = 121;
        int test2 = -121;
        int test3 = 10;

        System.out.println("1: " + solution(test1));
        System.out.println("2: " + solution(test2));
        System.out.println("3: " + solution(test3));

    }

    public static boolean solution(int x) {
        int m = reverse(x);

        return x == m;
    }

    public static int reverse(int n) {
        int r = 0;

        while (n > 0) {
            r = r*10 + n%10;
            n = n/10;
        }

        return r;
    }
    
}
