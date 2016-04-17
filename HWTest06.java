/**
 *
 *@author ZhouYu
 *
 *count bright lights
 */
import java.util.Scanner;
import java.util.Arrays;

class HWTest06{
    public static int N;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int count_a=0,count_b=0,count_c=0,count_d=0;
        for (int i=0;i<s.length() ;i++ ) {
            if (s.charAt(i)=='(') 
                count_a++;
            else if (s.charAt(i)==')') 
                count_b++;
            else if (s.charAt(i)=='[')           
                count_c++;
            else if(s.charAt(i)==']')
                count_d++;
         } 

        if (count_a==count_b && count_c==count_d) {
            System.out.println(0);
        }
        else System.out.println(1);
      
   }
}
