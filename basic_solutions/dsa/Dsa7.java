/**
 * 
 * Question Link: https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
 * 
 * 
 * Answer
 */
import java.util.*;

public class Dsa7{
    public static void birthdayCakeCandles(List<Integer> candle)
    {
        int maxheight = Integer.MIN_VALUE;
        int count =0;
        for(int num : candle)
        {
            if(num > maxheight)
            {
              maxheight = num;
              count =1;
            }else if(num == maxheight){
                count++;
            }
            
        }
        System.out.println(count);
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        list.add(sc.nextInt());
       } 
       birthdayCakeCandles(list);
    }
}