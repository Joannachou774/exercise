/**
 *
 *@author ZhouYu
 *
 *remove maxmium and minmium
 */
import java.util.Scanner;
import java.util.Arrays;

class HWTest04{
    public static int N;

    public static void main(String[] args) {
        // 输入一串以逗号分隔的数
        Scanner sc = new Scanner(System.in);
        String []s = sc.nextLine().split(",");
        int []number =new int[s.length];
        int count=0;      
            
        // 找出最大最小值
        int min,max,temp;
        min=max=Integer.parseInt(s[0]);
        for (int i=0;i<number.length ;i++ ) {
            number[i] = Integer.parseInt(s[i]);
            if (number[i]<min) min = number[i];
            if (number[i]>max) max = number[i];      
        }
        // 计算除去后的个数
        for (int i=0;i<number.length ;i++ ) {
            if(number[i]!=max && number[i]!=min)
                count++;
        }
        System.out.println(count);
   }
}
