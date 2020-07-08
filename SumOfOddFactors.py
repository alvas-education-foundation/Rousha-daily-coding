/*python-program-for-find-sum-of-odd-factors-of-a-number*/
import math
def sumofoddFactors( n ):
   #prime factors
   res = 1
   # ignore even factors
   while n % 2 == 0:
      n = n // 2
   for i in range(3, int(math.sqrt(n) + 1)):
      count = 0
      curr_sum = 1
      curr_term = 1
      while n % i == 0:
         count+=1
         n = n // i
         curr_term *= i
         curr_sum += curr_term
      res *= curr_sum
   # n is a prime number.
   if n >= 2:
      res *= (1 + n)
      return res
# main
n = 27
print(sumofoddFactors(n))
