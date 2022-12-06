from car import *
from vehicle import *

v_1 = Vehicle()
print(v_1)
print("---------")
v_2 = Vehicle('kkkoee', 33, 2000)
print(v_2)
print("---------")
print(v_1.prod_year)
print("---------")
v_1.prod_year = 1990
print(v_1.prod_year)
print("---------")

c_1 = Car()
print(c_1)
print("---------")
c_2 = Car('kkkoee', 22, 2000)
print(c_2)
print("---------")
if c_1 == c_2:
    print("są równe")
else:
    print("nie są równe")
