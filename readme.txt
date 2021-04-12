How to Run Our Code

All of the code for quicksorting is contained in Quicksorting.java. The only methods we have are quicksort(), partition(), and isSorted(). They do exactly what their names imply

To graph runtime of the sorts, we used Experimenting.java. The main method of this class generates 10 arrays at each increment of 1000 up to a certain number and sorts them, counting comparisons. It writes the data to stout, which must be directed to a csv file. To change between deterministic and random and to change the input, we simply changed the code to specify what we were currently using.

PartThreeAndFour.java sorts 100 arrays of specified size and records the number of comparisons for each one. It prints to stout, which must be redirected to a csv.

Finally, the code for our version of quick sort is created by changing the line "r=hi;" in Quicksorting.java to "r=(hi+lo)/2;."

**Running our code simply requires specifying the input type, number of sorts, and type of quick sort in the code, followed by executing java Experimenting or java PartThreeAndFour.**

To replicate our data, you would have to edit the java files to specify the input, type of sorting, and size. If you want more specific details, we're happy to provide them.

We used the python files to manipulate the data and generate our graphs. Again, we edited the code directly for each graph we made. We're happy to give further details to recreate.