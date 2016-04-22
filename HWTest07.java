/**
 *
 *@author ZhouYu
 *
 *判断回文数（按照输入为字符串来判断）
 */
import java.util.Scanner;
import java.util.Arrays;

class HWTest07{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
        int    x=Integer.parseInt(input);
        int y;
        StringBuffer output = new StringBuffer();

        while(x!=0){
            y = x%10;
            x=x/10;
            output.append(y);
        }

        if (input.equals(output.toString())) {
            System.out.println("1");
        }
        else System.out.println("0");
      
   }
}
