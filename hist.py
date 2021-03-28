import matplotlib.pyplot as plt
import pandas as pd

data = pd.read_csv('deterministc_partial_HistV2.csv', usecols=[1])

data.plot(kind='density')
plt.ylabel('Frequency')
plt.xlabel('Number of Comparisons')
plt.title('Partially Sorted Deterministic Larger Number of Elements')

ax=plt.gca()
#ax.get_yaxis().get_major_formatter().set_scientific(False)
#ax.get_xaxis().get_major_formatter().set_scientific(False)

plt.show()