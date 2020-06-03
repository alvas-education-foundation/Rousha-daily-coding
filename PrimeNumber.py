/*2. Write a python program to generate prime number in an interval 
You just need to take two number as input from stdin and you need to find prime
numbers between those two numbers and print them.
Input Format
You will be taking two numbers as an input from stdin one on each line respectively.
Constraints
1 &lt;= A, B &lt;= 10^4
Output Format
You need to print the prime numbers one on each line
sample example:
Input
900
1000
Output
907
911
919
929
937
941
947
953
967
971
977
983
991
997*/

lower = int(input("Enter lower range:"))
upper = int(input("Enter upper range:"))

for num in range(lower,upper + 1):
if num &gt; 1:
for i in range(2,num):
if (num % i) == 0:
break

else:
print(num)
