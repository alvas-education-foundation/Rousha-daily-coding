/*Python Program for Difference between sums of odd and even digits*/
def isDiff(n):
    return (n % 11 == 0)
n = 1243;
if (isDiff(n)):
    print("Yes")
else:
    print("No")
