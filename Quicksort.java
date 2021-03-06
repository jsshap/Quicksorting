import java.util.Random;


public class Quicksort{

    static int comparisons=0;

    public static void quicksort(int[] a, int lo, int hi, boolean deterministic){
        Random rand = new Random();
        int r;
        if (hi>lo){
            if (!deterministic){
                r = rand.nextInt(hi - lo + 1 ) + lo;//this gives r between hi and lo
            }
            else {
                r=hi;
            }
            //int r = (hi+lo)/2;
            int p = partition(a, lo, hi, r);
            quicksort(a, lo, p-1, deterministic);//We never have p = lo
            quicksort(a, p+1, hi, deterministic);
        }
    }
    

    public static int partition(int[] a, int lo, int hi, int r){
        swap(a, r, hi);

        int j = hi-1;
        int i = lo;
        int x = a[hi];//x is the pivot value. this was a[r]

        while (i<=j){
            comparisons++;
            if (a[i]<=x){//belongs to smalls                i++;
            }
            else{//belongs to smalls
                swap(a, i, j);
                j--;
            }
        }
        swap(a, hi, j+1);
        return j+1;//the new location of x

    }

    static void printArray(int[] a){
        int[] toSort=a;
        for (int i= 0; i< toSort.length; i++){
            System.out.println(toSort[i]/1000);
        }
        System.out.println("====");

    }

    static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static boolean isSorted(int[] a){
        //Returns true if array is sorted in ascending order
        boolean isSorted=true;
        for (int i= 0; i< a.length-1; i++){
            if (a[i+1]<a[i]){
                isSorted=false;
            }
        }

        return isSorted;
    }


}