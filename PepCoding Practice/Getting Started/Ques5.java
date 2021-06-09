import java.util.*;

public class Ques5{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int i=low; i<= high; i++){
            int count=0;
            for(int div=2; div<=high/2; div++) {
                if (i % div == 0) {
                    count++;
                }
            }
                if( count  == 0){
                    System.out.println(i);
                }


        }

    }
}
