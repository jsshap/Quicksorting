import matplotlib.pyplot as plt
import pandas as pd

data = pd.read_csv('random_mostly_HistV2.csv', usecols=[5])

data.plot(kind='density')
plt.ylabel('Frequency')
plt.xlabel('Number of Comparisons')
plt.title('Randomized Quicksort on Mostly Sorted Inputs for More Elements')

ax=plt.gca()
#ax.get_yaxis().get_major_formatter().set_scientific(False)
#ax.get_xaxis().get_major_formatter().set_scientific(False)

plt.show()