"""
You are given a string moves of length n consisting only of characters 'L', 'R', and '_'. The string represents your movement on a number line starting from the origin 0.

In the ith move, you can choose one of the following directions:

move to the left if moves[i] = 'L' or moves[i] = '_'
move to the right if moves[i] = 'R' or moves[i] = '_'
Return the distance from the origin of the furthest point you can get to after n moves.

 

Example 1:

Input: moves = "L_RL__R"
Output: 3
Explanation: The furthest point we can reach from the origin 0 is point -3 through the following sequence of moves "LLRLLLR".
Example 2:

Input: moves = "_R__LL_"
Output: 5
Explanation: The furthest point we can reach from the origin 0 is point -5 through the following sequence of moves "LRLLLLL".
Example 3:

Input: moves = "_______"
Output: 7
Explanation: The furthest point we can reach from the origin 0 is point 7 through the following sequence of moves "RRRRRRR".
 

Constraints:

1 <= moves.length == n <= 50
moves consists only of characters 'L', 'R' and '_'. """


# my solution 

# lets take one string that contains only L or R or _ 
# L means that you can only move to the left
# R means that you can only move to the right 
# _ means that you can move to left or right 

#     L _ R L _ _ R 
#.    0 1 2 3 4 5 6

#     origin 0
#     
# so from above string in 0 index is L that will move to the left now so our value is -1 count is 1
# next we have _ that will go left or right so i will take left first  now value is -2 count is 2
# now we have R that will move to the right now value is -1 count is 1
# next we have L that will move to the left now value is -2 count is 2
# next we have _ that will move to the left or right so i will take left first  now value is -3 count is 3
# next we have _ that will move to the left or right so i will take left first  now value is -4 count is 4
# next we have R that will move to the right now value is -3 count is 3
# 
# same thing i will take _ as right so now L _ R L _ _ R 
#              left first -1 again _ come to 0 and next r right so count = 1 and next  L left so count = 0 
# and then  _ right so count = 1 and next _ right so count = 2 and next r right so count = 3
#
# i have observed that if i have more left moves i will go to the left and if i have more right moves i will go to the right 
# and if i have equal left and right moves i will go to the left or right 
# and if i have more underscore moves i will go to the left or right 
#
# lets take L_RL__R this string have L count 2 right count 2 underscore count 3
#  so i can go to the left or right both are equal count 

# we will count l 
# we will count r 
# we will count _ 
# and will caluclate difference between l and r 
# and will add underscorecount in it
#    we will maximum left or right move


class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        leftcount = rightcount = underscorecount = 0
        n = len(moves)
        for i in range(n):
            if moves[i] == "L":
                leftcount+=1
            elif moves[i] == "R":
                rightcount +=1
            else:
                underscorecount+=1
        
        diff = leftcount - rightcount
        if diff < 0:
            return -diff+underscorecount
        else :
            return diff+underscorecount
        



                