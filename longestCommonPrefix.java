/* Question 14. Longest Common Prefix (easy)
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".


Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

public class longestCommonPrefix {

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};

        System.out.println(solution(strs1));
        System.out.println(solution(strs2));
    }

    public static String solution(String[] strs) {
        if (strs.length == 1 || strs[0].charAt(0) != strs[1].charAt(0)) {
            return "";
        }
        int x = 0;

        for (int i = 0; i < strs[0].length(); i++) {

        }

        return strs[0].substring(0, x);
    }

}
