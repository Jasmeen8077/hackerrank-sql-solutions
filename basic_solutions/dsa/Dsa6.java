/*
 * 
 * Question Link: https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
 * 
 * 
 * Answer
 */
import java.util.*;

public class Dsa6 {
    public static void miniMaxSum(List<Integer> num) {
        long sum = 0;
        for (int numbers : num) {
            sum += numbers;
        }

        int min = Collections.min(num);
        int max = Collections.max(num);

        long minsum = sum - max;
        long maxsum = sum - min;
        System.out.println(minsum + " " + maxsum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        miniMaxSum(list);
    }
}
