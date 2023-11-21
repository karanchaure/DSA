// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BinarySearch {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int[] a = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
        for(int i=0 ; i<a.length; i++){
        int index = binarySearch(a,0,a.length-1,3); System.out.println(index); } } private static int binarySearch(int[] a,int l,int h,int key){ // if (l>h)
        //     return -1;
        if(l == h){
            if( key == a[l])
                return l;
            else
                return -1;
        }
        else{
            int mid = (l+h)/2;
            if (key == a[mid])
                return mid;
            else if (key <a[mid])
                return binarySearch(a,l,mid-1,key);
            else
                return binarySearch(a,mid+1,h,key);
            
        }    
    }
}