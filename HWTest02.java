/**
 *
 *@author ZhouYu
 *
 *count bright lights
 */
import java.util.Scanner;
import java.util.Arrays;

class HWTest02{
    public static int N;

    public static void main(String[] args) {
        // input 10 students' score
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        int count=0;
        boolean []lighton =new boolean[N]; 

        // @parm:i---学生，j-电灯
        for (int i=0;i<N ;i++ ) {
            for (int j=0;j<N ;j++ ) {
                if ((j+1)%(i+1)==0)
                    lighton[j]=changeStatus(lighton[j]);   
            }
        }

        for (int i=0;i<N ;i++ ) {
            if (lighton[i]==true) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);

   }

   public static boolean changeStatus(boolean flag){
        if(flag == true)
            return  false;
        else
            return true;
   }
}
