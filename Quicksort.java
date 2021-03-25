import java.util.Random;
/*
THIS DOESN't WORK

*/


public class Quicksort{

    public static void main (String[] args){
        Generate g = new Generate();
        int[] toSort= g.generateRandomInput(4);

        quicksort(toSort, 0, toSort.length-1);
        System.out.println(isSorted(toSort));

        for (int i= 0; i< toSort.length; i++){
            System.out.println(toSort[i]/1000);
        }

    }

    public static void quicksort(int[] a, int lo, int hi){
        Random rand = new Random();
        int[] toSort=a;
        for (int i= 0; i< toSort.length; i++){
            System.out.println(toSort[i]/1000);
        }
        System.out.println("---");
        if (hi>lo){
            int r = rand.nextInt(hi - lo) + lo;//this gives r between hi and lo

            int p = partition(a, lo, hi, r);
            quicksort(a, lo, p-1);//We never have p = lo
            quicksort(a, p+1, hi);
        }
    }

    public static int partition(int[] a, int lo, int hi, int r){
        swap(a, r, hi);
        int j = hi-1;
        int i = lo;
        int x = a[hi];

        while (i<j){
            if (a[i]<x){//belongs to smalls
                i++;
            }
            else{//belongs to smalls
                swap(a, i, j);
                j--;
            }
        }
        swap(a, hi, j);
        return j;//the new location of x

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