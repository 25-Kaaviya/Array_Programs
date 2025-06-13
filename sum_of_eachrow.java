import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][] = new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    
   for(int i=0;i<n;i++){
     int r_sum = 0;
     for(int j=0;j<m;j++){
       r_sum += arr[i][j];
     }
     System.out.println(r_sum);
   } 
  }
}
