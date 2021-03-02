import java.io.*;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        int no_tests = 0;
        int[][]exponentials = null;
        int rank = 0;

        try {
            File myObj = new File("input.txt");
            Scanner my_scanner = new Scanner(myObj);
            no_tests = my_scanner.nextInt();
            exponentials = new int[no_tests][2];
            for(int i=0 ; i<no_tests; i++){
                exponentials[i][0] = my_scanner.nextInt();
                exponentials[i][1] = my_scanner.nextInt();
            }
            rank = my_scanner.nextInt();
            my_scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        TreeMap<Double,Integer> tree = new TreeMap<Double,Integer>();

        for(int i=0; i<no_tests; i++){
            double base = exponentials[i][0];
            int exponent = exponentials[i][1];

            double log_res = Math.log10(base);
            double value = log_res * exponent;
            tree.put(value,i);
        }
        for(Map.Entry<Double,Integer> entry : tree.entrySet()) {
            Double key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " => " + value);
        }
        int wanted_index = (int) tree.values().toArray()[rank-1];
        System.out.println(wanted_index+1);
        System.out.println(exponentials[wanted_index][0] + " " + exponentials[wanted_index][1]);

    }
}
