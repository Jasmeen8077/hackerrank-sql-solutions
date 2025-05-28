/*
 * 
 * Question Link: https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
 * 
 * Answer
 */
import java.util.*;
public class Dsa4{
    public static long aVeryBigSum(List<Long> n)
    {
        long sum =0;
        for(Long num : n)
        {
            sum+=num;
        }
        return sum;
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       List<Long> list = new ArrayList<>();
       for(int i=0;i < n;i++)
       {
         list.add(sc.nextLong());
       } 
       
       long result = aVeryBigSum(list);
       System.out.println(result);
    }
}