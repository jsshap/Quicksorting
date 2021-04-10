How to Run Our Code

All of the code for quicksorting is contained in Quicksorting.java.

To graph runtime of the sorts, we used Experimenting.java. The main method of this class generates 10 arrays at each increment of 1000 up to a certain number and sorts them, counting comparisons. It writes the data to stout, which must be directed to a csv file. To change between deterministic and random and to change the input, we simply changed the code to specify what we were currently using.

PartThreeAndFour.java sorts 100 arrays of specified size and records the number of comparisons for each one. It prints to stout, which must be redirected to a csv.

Running our code simply requires specifying the input type, number of sorts, and type of quick sort in the code, followed by executing java Experimenting or java PartThreeAndFour.

We used the python files to manipulate the data and generate our graphs.