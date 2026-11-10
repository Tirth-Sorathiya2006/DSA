/*
You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

A number which completely divides another number is called it's divisor.
1 <= n <= 1000
*/

import java.util.ArrayList;
import java.util.List;

public class Solution35 {
    public static void main(String[] args) {
        System.out.println(divisors(654));
    }

    private static List<Integer> divisors(int num) {
        List<Integer> divisorList = new ArrayList<>();
        
        for (int i = 1; i <= num / 2; i++) {
            if(num % i == 0) {
                divisorList.add(i);
            }
        }

        divisorList.add(num);
        return divisorList;
    }
}
