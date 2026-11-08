/*
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
0 <= n <= 5000
n will contain no leading zeroes except when it is 0 itself.
*/

public class Solution25 {
    public static void main(String[] args) {
        System.out.println(reverse(0));
    }

    private static int reverse(int num) {
        int rev = 0;

        while(num != 0){
            rev =  (rev * 10) + (num % 10);
            num /= 10;
        }

        return rev;
    }
}
