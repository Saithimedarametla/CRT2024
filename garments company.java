
The garments company Apparel wishes to open outlets at various locations. The company shortlisted several plots in these locations and wishes to select only plots that are square- shaped. Write an algorithm to help Apparel find the number of plots that it can select for its outlets.

Input Format

The first line of the input consists of an integer num0fMots, representing the number of plots shortlisted by the company for outlets (N). The second line consists of N space-separated integers – areal, areal, ….., areaN representing the area of the N plots selected for outlets.

Constraints

0 < num0fPlots < 10^6 0 < area < 10^6 0 < i < num0fPlots

Output Format

Print an integer representing the number of plots that will be selected for outlets.

Sample Input 0

8
79 77 54 81 48 34 25 16
Sample Output 0

3
Explanation 0

The areas that are in square form are 81, 25 and 16. So, the output is 3.

Sample Input 1

6
12 36 49 64 21 9
Sample Output 1

4


  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int i;
        int c=0;
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
            int s_a=(int)Math.sqrt(a[i]);
            if(s_a*s_a==a[i])
                c++;
        }
        System.out.println(c);
        
            
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
