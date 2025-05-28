/*
 * 
 * Question Link: https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
 * 
 * Answer
 */
import java.util.*;
public class Dsa5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n]; 
        for(int i=0;i<n;i++)
        {
         for(int j =0; j< n;j++)
         {
            arr[i][j] = sc.nextInt();
         }
        }
        int primaryDiagonal =0;
        int secondaryDiagonal = 0;
        for(int i = 0;i<n;i++)
        {
           primaryDiagonal +=arr[i][i]; 
           secondaryDiagonal+=arr[i][n-i-1];
        }
        
        int diff = Math.abs(primaryDiagonal - secondaryDiagonal);
        System.out.println(diff);
    }
}