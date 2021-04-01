
public class Experimenting {

    
    public static void main(String[] args){
        
        int[] compArr = new int[10];
        for (int i =1; i< compArr.length; i++){
            Generate g = new Generate();
            for (int j=0; j<10; j++){
                int[] toSort = g.generateRandomInput(i*1000);
                Quicksort.quicksort(toSort, 0, toSort.length-1, true);
            }
            int comparisons = Quicksort.comparisons;
            int comparisonsAverage=comparisons/10;
            compArr[i]=comparisonsAverage;
            Quicksort.comparisons=0;
        }



        //Don't forget to redirect stout
        System.out.println("elements*1000,avg comparisons");
        for (int i=1; i< compArr.length; i++){
            System.out.println(i + "," + compArr[i]);
        }
            

    }
    
}
