“VideoShare” is an online video sharing platform. The company has decided to rate its users channels based on the sum total of the number of views received online and the subscribers. The sum total is reffered to as user points. The rating will be given according to the below charts:

User points ratings: 30-50 Average 51-60 Good 61-80 Excellent 81-100 Outstanding

The whole process is automated and it can be carried out by the company’s system.

Input Format

The input consists of an integer userpoints representing the calculated points

Constraints

30>= userpoints <=100

Output Format

Print rating if not possible print "Invalid Input"

Sample Input 0

77
Sample Output 0

Excellent
Submissions: 232
Max Score: 20
Difficulty: Medium
Rate This Challenge:

    
More

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        a=s.nextInt();
     if(a>=30 && a<=50)
    {
        System.out.println("Average");
    }
    else if(a>=51 && a<=60)
    {
       System.out.println("Good");
    }
    else if(a>=61 && a<=80)
    {
        System.out.println("Excellent");
    }
    else if(a>=81 && a<=100)
    {
        System.out.println("Outstanding");
    }
    else
    {
       System.out.println("Invalid Input");
    }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
