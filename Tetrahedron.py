/*Python Program for Program to calculate area of a Tetrahedron*/
import math
def area_of_tetrahedron(sides):
return (math.sqrt(3) * (sides * sides))
sides=int(input('Enter the number of sides:'))
print("Area of Tetrahedron =",
area_of_tetrahedron(sides))
