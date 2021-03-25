import java.util.Random;


public class Quicksort{

    public static void main (String[] args){
        Generate g = new Generate();
        int[] toSort= g.generateRandomInput(10000);

        quicksort(toSort, 0, toSort.length-1);
        System.out.println(isSorted(toSort));

    }

    public static void quicksort(int[] a, int lo, int hi){
        Random rand = new Random();

        if (hi>lo){
            int r = rand.nextInt(hi - lo + 1 ) + lo;//this gives r between hi and lo
            //int r = (hi+lo)/2;
            int p = partition(a, lo, hi, r);
            quicksort(a, lo, p-1);//We never have p = lo
            quicksort(a, p+1, hi);
        }
    }

    public static int partition(int[] a, int lo, int hi, int r){
        //System.out.println("line 38");
        //printArray(a);
        //System.out.println("r is "+ r );
        //System.out.println("Swapping a[r]= "+ a[r]/1000+ " and a[hi]=" + a[hi]/1000);
        swap(a, r, hi);
        //System.out.println("line 39");
        //printArray(a);
        int j = hi-1;
        int i = lo;
        int x = a[hi];//x is the pivot value. this was a[r]
        //System.out.println("x="+x/1000);
        while (i<=j){
            if (a[i]<=x){//belongs to smalls
                //System.out.println(a[i]/1000 + "is less than " + x/1000);
                i++;
            }
            else{//belongs to smalls
                //System.out.println("Swapping a[i]=" + a[i]/1000 + " with a[j]=" + a[j]/1000);
                
                //System.out.println("Pre swap");
                //printArray(a);
                swap(a, i, j);
                //System.out.println("Swap is done");
                //printArray(a);
                j--;
            }
        }
        /*System.out.println("now the array is: ");
        printArray(a);
        System.out.println("Swapping hi and j+1");*/
        swap(a, hi, j+1);
        /*System.out.println("That swap is done");
        printArray(a);
        System.out.println("J+1 is "+ (j+1) + "a[j+1] is " + a[j+1]);*/
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