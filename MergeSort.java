import java.util.ArrayList;
import java.util.List;

public class MergeSort {
  static int count = 0;
  static int counter = 1;

  public static void main(String[] args) {
    int[] ar = { 3, 1, 20, 9, 5 };
    mergeSort(ar, 0, ar.length - 1);
  }

  public static void mergeSort(int[] a, int l, int h) {
    if (l < h) {
      int mid = (l + h) / 2;
      System.out.println("l : " + l + " h: " + h + " m: " + mid + " counter: " + count++);
      List<Integer> li = new ArrayList<>();
      li.add(34);
      li.add(24);
      li.add(45);

      mergeSort(a, l, mid);
      System.out.println("secound l : " + l + " h: " + h + " m: " + mid + " counter: " + count++);
      mergeSort(a, mid + 1, h);
      System.out.println("reached : " + counter++);
      System.out.println("arr = " + a[mid]);
      merge(a, l, mid, h);

    }
  }

  static void merge(int arr[], int l, int m, int r) {
    // Find sizes of two subarrays to be merged
    int n1 = m - l + 1;
    int n2 = r - m;

    // Create temp arrays
    int L[] = new int[n1];
    int R[] = new int[n2];

    // Copy data to temp arrays
    for (int i = 0; i < n1; ++i)
      L[i] = arr[l + i];
    for (int j = 0; j < n2; ++j)
      R[j] = arr[m + 1 + j];

    // Merge the temp arrays
    // Initial indexes of first and second subarrays
    int i = 0, j = 0;

    // Initial index of merged subarray array
    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements of L[] if any
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    // Copy remaining elements of R[] if any
    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }
}
