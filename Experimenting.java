import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Experimenting {

    
    public static void main(String[] args){
        
        int[] compArr = new int[20];
        for (int i =1; i< compArr.length; i++){
            Generate g = new Generate();
            int[] toSort = g.generateMostlySortedInput(i*1000);
            Quicksort.quicksort(toSort, 0, toSort.length-1, true);
            int comparisons = Quicksort.comparisons;
            compArr[i]=comparisons;
            Quicksort.comparisons=0;
        }



        //Don't forget to redirect stout
        System.out.println("elements*1000,comparisons");
        for (int i=1; i< compArr.length; i++){
            System.out.println(i + "," + compArr[i]);
        }
            

    }
    
}
