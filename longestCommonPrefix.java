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
        String[] strs3 = {"aaa","aa","aaa"};
        String[] strs4 = {"aac","acab","aa","abba","aa"};

        System.out.println(solution(strs4));
        //System.out.println(solution(strs2));
    }

    public static String solution(String[] strs) {
        if (strs.length == 1 || strs[0].length() < 1) {
            return strs[0];
        }
        
        String str = "";
        int cap = strs[0].length();

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j<strs[i].length(); j++) {
                if (j < strs[0].length() && strs[0].charAt(j) == strs[i].charAt(j) && strs[i].length() <= cap) {
                    str += strs[0].charAt(j);
                } else if (j < strs[0].length() && strs[0].charAt(j) != strs[i].charAt(j)) {
                    str = str.substring(0, j);
                    j = strs[i].length();
                    // System.out.println(cap);
                }
            }
            if (strs[i].length() < str.length()) {
                cap = strs[i].length();
                str = str.substring(0, cap);
                // System.out.println(cap);
            } else if (str.length() < 1) {
                return "";
            }
        }

        return str;
    }

}
