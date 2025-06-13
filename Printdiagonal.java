import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();
      }
    }
     
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
    for (int i = 0; i < n; i++) {
            
            if (i != n - 1 - i) {
                System.out.print(arr[i][n - 1 - i] + " ");
            }
        }
        System.out.println();
  }
}
