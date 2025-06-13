import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int res = -1;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i] == arr[j]){
          res = arr[i];
          break;
        }
      }
      if(res != -1){
        break;
      }
    }
    System.out.println(res);
  }
}
