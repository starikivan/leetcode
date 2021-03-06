package leetcode;//344. Reverse String
//        Easy
//
//        Write a function that reverses a string. The input string is given as an array of characters char[].
//
//        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//        You may assume all the characters consist of printable ascii characters.
//
//
//
//        Example 1:
//
//        Input: ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]
//        Example 2:
//
//        Input: ["H","a","n","n","a","h"]
//        Output: ["h","a","n","n","a","H"]

class LC_0344_ReverseString {
    public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length /2; i++) {
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp;
        }
    }
}