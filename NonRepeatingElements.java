import java.util.Scanner;

public class NonRepeatingElements {
    
    static void findNonRepeating(int arr[], int n) {
        System.out.println("Non-repeating elements are:");
        
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j])
                    break;
            }
            if (j == n) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findNonRepeating(arr, n);
    }
}

