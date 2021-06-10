import java.util.*;

public class Ques8{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String string_number = Integer.toString(n);
        for (int i = 0; i < string_number.length(); i++){
            System.out.println(string_number.charAt(i));
        }
    }
}

