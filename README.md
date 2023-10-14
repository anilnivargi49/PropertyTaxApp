# PropertyTaxApp
1) Add property details like name of the owner, type of the property, area in square feet, 
address, status(Owner or Tenated), constructed year, assessment year and zonal classification

Based on requirement so calculation logic is 
1) Total_1 =Built Up area [Square feet] * unit area Value * 10 months
2) Total_2 = Total_1 – Applicable depreciation
3) Total_3 = Total_2 * 20% [Property tax for residential area]
4) Total_4 = Total_3 * 24% [ CESS ==> Health cess + beggary cess + Library cess ]
5) Total_5 = Total_3 + Total_4

Based on above logic, will calculate the property tax and store it into the database.

2) To show the report for each zone wise calculated or collected property tax

   Columns - Zone (example- Zone A, Zone B), Property type(Owner or Tenated), A

   

