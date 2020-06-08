/*4.Program program to find whether a string is a palindrome or not */

def palindromecheck(string):
    if(string == string[:: - 1]):
        print("True")
    else:
        print("False")
#main
string = input("Enter the String : ")
palindromecheck(string)
