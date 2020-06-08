/*1.Write a python function that will take a string and checks whether it is a palindrome or not. Return If it a palindrome, print true else print false*/

string = input("Enter the String : ")
if(string == string[:: - 1]):
   print("True")
else:
   print("False")
