import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

data = pd.read_csv("deterministic_random.txt")

print(data)

x = data['i*1000']
y= data['comparisons']

plt.plot(x,y)
plt.title("Comparisons vs. Time for Deterministic Quicksort on Random input")
plt.xlabel("Elements (*1000)")
plt.ylabel("Comparisons")

#https://stackoverflow.com/questions/14711655/how-to-prevent-numbers-being-changed-to-exponential-form-in-python-matplotlib-fi
ax=plt.gca()
ax.get_yaxis().get_major_formatter().set_scientific(False)

plt.show()