import java.util.*;
import java.lang.Math;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int res = arr[0];
    int res1 = arr[0];
    for(int i=0;i<n;i++){
      res = Math.max(res,arr[i]);
      res1 = Math.min(res1,arr[i]);
    }
    System.out.print(res1+" "+res);
  }
}
