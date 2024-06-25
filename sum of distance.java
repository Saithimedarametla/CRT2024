Write a program to calculate and return the sum of distances between the adjacent numbers In an array of positive integers.

Input Format

Read size of the array Read n elements of the array side by side

Constraints

1<=n<=10^7

Output Format

Print sum of positive distances

Sample Input 0

5
10 11 7 12 14
Sample Output 0

12
Explanation 0

The first parameters (5) is the size of the array next is an array of integers the total of distance is 12 as per the calculation below. 10-11=1 11-7=4 7-12=5 12-14=2 Total distance-1+4+5+2=12

Sample Input 1

6
12 15 8 20 32 16
Sample Output 1

50



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int s1=0;
        for(i=1;i<n;i++){
            s1=s1+Math.abs(a[i]-a[i-1]);
        }
        System.out.println(s1);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
