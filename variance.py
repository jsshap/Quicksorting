import pandas as pd
data = pd.read_csv('Data/HistData/random_mostly_HistV2.csv')


print("Variance for Random Quicksort on Mostly Sorted Input\n")
for column in data:
    var=(data[column].var())
    print("Variance for", int(column), "elements:", var)
    scv = var/(data[column].mean())**2
    print("Squared Coefficient of Variation for", int(column), "elements: ", scv)

print("\n")

