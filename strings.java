
read a string and print number of alphabets,no.of upper case letters,no of lower case letters,no.of digits and no.of special symbols.
import java.util.*;
class Heloworld
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int alp=0,up=0,lo=0,d=0,sp=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                alp++;
                if(Character.isUpperCase(ch))
                up++;
                else
                lo++;
            }
            else if(Character.isDigit(ch))
            d++;
            else
            sp++;
        }
        System.out.println("Alphabets="+alp);
        System.out.println("Uppercase="+up);
        System.out.println("Lowercase="+lo);
        System.out.println("Digits="+d);
        System.out.println("Symbols="+sp);
    }
}



output

  @jag JAG 123
Alphabets=6
Uppercase=3
Lowercase=3
Digits=3
Symbols=3

=== Code Execution Successful ===
