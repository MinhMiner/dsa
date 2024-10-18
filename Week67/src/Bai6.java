import java.util.*;

public class Bai6 {
        
          static void quickSort(int[] ar) {
            sort(ar, 0, ar.length - 1);            
        }

        private static void sort(int[] arr, int low, int high) {
            if (high <= low) {
                return;
            }
            int mid = partition(arr, low, high);
            sort(arr, low, mid - 1);
            sort(arr, mid + 1, high);
        }
    
        private static int partition(int[] arr, int low, int high) {
            int i = low;
            int j = low;
            while (j < high) {
                if (arr[j] < arr[high]) {
                    exch(arr, i, j);
                    i++;
                }
    
                j++;
            }
    
            exch(arr, high, i);
            printArray(arr);
            return i;
        }
    
        private static void exch(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
 
 static void printArray(int[] ar) {
            for(int n: ar){
                System.out.print(n+" ");
            }
            System.out.println("");
        }
        
       public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
               ar[i]=in.nextInt(); 
            }
            quickSort(ar);

            in.close();
        }    
    }
