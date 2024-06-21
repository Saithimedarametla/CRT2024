
Electricity board has decided to charge rupees based on the units consumed by a particular home. If the units consumed is less than or equal to 200, the cost for one unit is 0.5. If the unit is less than or equal to 400, the cost for one unit is 0.65 and Rs.100 extra charge. If the unit is less than or equal to 600, the cost for one unit is 0.80 and Rs.200 extra charge. If the unit is greater than 600 the cost for one unit is 1.25 and Rs.425 extra charge. You need to now calculate the electricity bill based on the units consumed (given input).

Input Format

Input consists of one integer. This corresponds to the units consumed.

Constraints

1<=n<=10^7

Output Format

The output consists of one integer. This corresponds to the electricity bill in rupees.

Sample Input 0

200
Sample Output 0

Rs.100

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int uc;
        float bill;
        uc=s.nextInt();
        if(uc<=200){
            bill=(float)(uc*0.5);
        }
        else if(uc>200 && uc<=400){
          bill=(float)(uc*0.65)+100;
        }
        else if(uc>400 && uc<=600){
            bill=(float)(uc*0.80)+200;
            
        }
        else 
        {
            bill=(float)(uc*1.25)+425;
        }
        System.out.printf("Rs.%.0f",bill);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
