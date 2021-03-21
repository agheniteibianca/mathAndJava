/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*
* from 3*1 to 3*333
* from 5*1 to 5*200
substract duplicates: multiples of 15
* from 15*1 to 15*66
* */
public class MainClass {
    public static void main(String[] args) {
        int limit = 1000;
        limit--;
        int lim3 = limit/3;
        int lim5 = limit/5;
        int lim15 = limit/15;
        int sum3 = (lim3 * (lim3+1)) /2;
        int sum5 = (lim5 * (lim5+1)) /2;
        int sum15 = (lim15 * (lim15+1)) /2;
        int sum = 3 * sum3 + 5 * sum5 - 15* sum15;
        System.out.println(sum);
    }
}
