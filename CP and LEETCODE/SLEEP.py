## PROBLEM STATEMENT

# A person is said to be sleep deprived if he slept strictly less than 777 hours in a day.
# Chef was only able to sleep XXX hours yesterday. Determine if he is sleep deprived or not.

for _ in range(int(input())):
    X = int(input())
    if X<7:
        print("Yes")
    else:
        print("No")