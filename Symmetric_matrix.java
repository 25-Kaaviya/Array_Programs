import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isSymmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    isSymmetric = false;
                    break; 
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        
        if (isSymmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
