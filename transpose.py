
import pandas as pd
pd.read_csv('deterministic_random_Hist.csv', header=None).T.to_csv('deterministc_random_HistV2.csv', header=False, index=False)
#https://stackoverflow.com/questions/4869189/how-to-transpose-a-dataset-in-a-csv-file