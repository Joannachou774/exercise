/**
 *
 *@author ZhouYu
 *
 *Output the pass score
 */
import java.util.Scanner;
import java.util.Arrays;

class HWTest01{
    public static int studentNumber=10;
    public static void main(String[] args) {
        // input 10 students' score
        Scanner sc = new Scanner(System.in);
        int []score= new int[studentNumber];
        int result;
        for (int i=0;i<studentNumber ;i++ ) {
           	   score[i] = sc.nextInt();
            }
        Arrays.sort(score);

        if (score[0]>=60) {
        	result = 60;
        }

        // ------选取第六名的分数并对10取整------
        else{
            int passStu = (int)(0.6*studentNumber);
            result = score[studentNumber-passStu]/10*10;
        }
         System.out.println(result);

   }
}
