/*
*
*
* */
import java.util.*;
public class MainClass {

    public static void main(String[] args) {
        Scanner my_scanner = new Scanner(System.in);
        long n = my_scanner.nextLong();
        long no_combinations = 0;
        for(int k=2; k< Math.sqrt(n); k+=2){
            long max_hole_size = (long)((double)n/k-k)/2;
            if(max_hole_size > 0){
                no_combinations += max_hole_size;
            }
        }
        System.out.println(no_combinations);
    }
}