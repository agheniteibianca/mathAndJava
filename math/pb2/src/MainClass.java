/*
*By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
* */

public class MainClass {
    static long compute_sum(long limit){
        long a = 2;
        long b = 8;
        long sum = a + b;
        long new_term = b;
        while(b < limit){
            new_term = a + 4 * b;
            //update sum
            sum += new_term;
            //update a and b
            a = b;
            b = new_term;
        }
        return sum - new_term;
    }

    public static void main(String[] args) {
        long sum = compute_sum(4000000);
        System.out.println(sum);
    }
}
