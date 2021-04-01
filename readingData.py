import pandas as pd
import matplotlib.pyplot as plt
import numpy as np
import math

random_data = pd.read_csv("ourTestRandomSortedV2.csv")
partial_data=pd.read_csv("ourTestPartialSortedV2.csv")
mostly_data=pd.read_csv("ourTestMostlySortedV2.csv")



random_x = random_data['elements*1000']
random_y= random_data['avg comparisons']

mostly_x=mostly_data['elements*1000']
mostly_y=mostly_data['avg comparisons']

partial_x=partial_data['elements*1000']
partial_y=partial_data['avg comparisons']


baseX=[i for i in range (1,200)]
baseY=[(2*i*1000*math.log(i*1000)) for i in baseX]
print(baseY)

plt.plot(random_x,random_y, label = "Random Input")
plt.plot(partial_x, partial_y, label= "Partially Sorted")
plt.plot(mostly_x, mostly_y, label="Mostly Sorted")
plt.plot(baseX,baseY, label="2nln(n)")

plt.legend(loc="best")
plt.title("Comparisons vs. Time for Deterministic Quicksort")
plt.xlabel("Elements (*1000)")
plt.ylabel("Comparisons")

#https://stackoverflow.com/questions/14711655/how-to-prevent-numbers-being-changed-to-exponential-form-in-python-matplotlib-fi
ax=plt.gca()
ax.get_yaxis().get_major_formatter().set_scientific(False)
ax.get_xaxis().get_major_formatter().set_scientific(False)



plt.show()