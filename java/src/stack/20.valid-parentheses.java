/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (35.88%)
 * Total Accepted:    533K
 * Total Submissions: 1.5M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(') {
                deque.push(cur);
            } else if (cur == '{') {
                deque.push(cur);
            } else if (cur == '[') {
                deque.push(cur);
            } else if (cur == ')') {
                char get;
                try {
                    get = deque.pop();
                } catch (Exception e) {
                    return false;
                }
                if (get != '(') {
                    return false;
                }
            } else if (cur == ']') {
                char get;
                try {
                    get = deque.pop();
                } catch (Exception e) {
                    return false;
                }

                if (get != '[') {
                    return false;
                }
            } else if (cur == '}') {
                char get;
                try {
                    get = deque.pop();
                } catch (Exception e) {
                    return false;
                }
                if (get != '{') {
                    return false;
                }
            }
        }
        if (deque.size() > 0) {
            return false;
        }
        return true;
    }
}

