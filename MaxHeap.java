public class MaxHeap {
    public static void main(String[] args) {
        int[] a={20,30,50,15,10,8,16};

       
        int[] result = maxHeap(a);
    }

    private static int[] maxHeap(int[] a){
        int[] result=new int[a.length];
        int length= a.length;
        int i=0;
        result[i] = a[i];
        res;
        i++;
        while(i < length){
            if (result[i] == 0){
                result[i] == a[i];
                i++;
            }
            int j=0;
            while ()
        }
        return a;
    }

    public int[] swap(int[] a,int parent,int child){
        int temp = a[parent];
        a[parent] = a[child];
        a[child] = temp;
        return a;
    }
    
    
    
}
