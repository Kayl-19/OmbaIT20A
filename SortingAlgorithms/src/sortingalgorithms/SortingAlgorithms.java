import java.util.Arrays;

public class SortingAlgorithms {

   
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; 
            }
        }
    }

    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; 
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11, 90, 34, 7, 58, 3, 45, 19};

 
        int[] bubbleArray = Arrays.copyOf(original, original.length);
        int[] selectionArray = Arrays.copyOf(original, original.length);
        int[] insertionArray = Arrays.copyOf(original, original.length);

        bubbleSort(bubbleArray);
        selectionSort(selectionArray);
        insertionSort(insertionArray);

        System.out.println("Original array : " + Arrays.toString(original));
        System.out.println();
        System.out.println("Bubble Sort    : " + Arrays.toString(bubbleArray));
        System.out.println("Selection Sort : " + Arrays.toString(selectionArray));
        System.out.println("Insertion Sort : " + Arrays.toString(insertionArray));
    }
}