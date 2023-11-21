import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        
    }

    public static void quickSort(int[] a, int l, int h) {
        if(l<h){
            int j = partition(a,l,h);
            quickSort(a, l, j);
            quickSort(a,j+1,h); } List<Integer> lis =new ArrayList<>(); lis.a } while(a[i+1] < pivot){ i++; } while(a[j] > pivot){ j--; }