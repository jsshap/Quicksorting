import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

random_data = pd.read_csv("deterministic_random.txt")
partial_data=pd.read_csv("deterministic_partial.txt")
mostly_data=pd.read_csv("deterministic_mostly.txt")



random_x = random_data['elements*1000']
random_y= random_data['comparisons']

mostly_x=mostly_data['elements*1000']
mostly_y=mostly_data['comparisons']

partial_x=partial_data['elements*1000']
partial_y=partial_data['comparisons']

plt.plot(random_x[:int(len(random_x)/5)],random_y[:int(len(random_y)/5)], label = "Random Input")
plt.plot(partial_x, partial_y, label= "Partially Sorted")
plt.plot(mostly_x, mostly_y, label="Mostly Sorted")

plt.legend(loc="best")
plt.title("Comparisons vs. Time for Deterministic Quicksort")
plt.xlabel("Elements (*1000)")
plt.ylabel("Comparisons")

#https://stackoverflow.com/questions/14711655/how-to-prevent-numbers-being-changed-to-exponential-form-in-python-matplotlib-fi
ax=plt.gca()
ax.get_yaxis().get_major_formatter().set_scientific(False)
ax.get_xaxis().get_major_formatter().set_scientific(False)



plt.show()