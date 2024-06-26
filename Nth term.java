Given a number N, write a program to find the Nth term of the below-mentioned series. 14, 28, 20, 40, 32, 64, 56, 112, 104, 208.....

Input Format

Read n value

Constraints

1<=n<=10000

Output Format

Print nth term

Sample Input 0

2
Sample Output 0

28
Sample Input 1

10
Sample Output 1

208
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=14;
        for(int i=2;i<=n;i++){
            if(i%2==0)
                m=m*2;
            else
                m=m-8;
        }
        System.out.println(m);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
