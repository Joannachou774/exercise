/**
 *
 *@author ZhouYu
 *
 *求在差值最小情况下的最大身高
 */
import java.util.Scanner;
import java.util.Arrays;

class HWTest05{
    public static int N;

    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       int []Height= new int[5];
       int index=0,temp;
       for (int i=0;i<Height.length ;i++ ){
            Height[i] = sc.nextInt();
        } 
        Arrays.sort(Height);
        int subHeight = Height[1]-Height[0];
        for (int i=1;i<Height.length-1 ;i++ ) {
            temp = Height[i+1]-Height[i];
            if (subHeight>=temp) {
                subHeight =temp;
                index = i;
            }
        }
        System.out.println(Height[index]+","+Height[index+1]);

   }
}
