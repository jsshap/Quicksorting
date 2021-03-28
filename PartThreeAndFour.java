public class PartThreeAndFour {

    static int[] nValues= {100, 1000, 5000, 10000, 15000, 20000};
    public static void main(String[] args){
        int[][] values = new int[nValues.length][100];//matrix goes value, then each number of comparisions at that value
        for (int i= 0; i<values.length; i++){
            int numElements= nValues[i];
            for (int j =0; j< 100; j++ ){
                Generate g = new Generate();
                int[] toSort= g.generateRandomInput(numElements);
                boolean deterministic= true;
                Quicksort.quicksort(toSort, 0, toSort.length-1, deterministic);
                int comparisonsLocal = Quicksort.comparisons;
                Quicksort.comparisons =0;
                values[i][j]=comparisonsLocal;
            }
        }

        for (int i=0; i< nValues.length;i++){//note: nValues.length==values.length
            System.out.print(nValues[i]+",");
            for (int j=0; j<values[i].length-1;j++){
                System.out.print(values[i][j]+",");
            }
            System.out.println();
        }
    }
    
}
