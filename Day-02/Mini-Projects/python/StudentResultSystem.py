# Student Result System
Name = input("Enter Your Full Name: ")
Roll_num = int(input("Enter Your Roll Number: "))
sub1 = float(input("Enter Your 1st Subject Marks: "))
sub2 = float(input("Enter Your 2nd Subject Marks: "))
sub3 = float(input("Enter Your 3rd Subject Marks: "))
sub4 = float(input("Enter Your 4th Subject Marks: "))
sub5 = float(input("Enter Your 5th Subject Marks: "))

total_marks = sub1 + sub2 + sub3 + sub4 + sub5
percentage = total_marks / 5

print("=================Result======================")
print(f"Name: {Name}")
print(f"Roll NO: {Roll_num}")
print(f"total marks: {round(total_marks,1)}")
print(f"percentage: {round(percentage,1)}%")

if percentage >= 90 and percentage <= 100:
    print(f"Excellent Your Grade is:'A'")
    print(f"Result: PASS")
elif percentage >= 80 and percentage <= 89:
    print(f"Above Average Your Grade is:'B'")
    print(f"Result: PASS")
elif percentage >= 70 and percentage <= 79:
    print(f"Average Competency Your Grade is:'C'")
    print(f"Result: PASS")
elif percentage >= 40 and percentage <= 69:
    print(f"Below Average But pass Your Grade is:'D'")
    print(f"Result: PASS")
elif percentage < 40 :
    print(f"Result: FAILED")
    print(f"Failed!Immediately Reapply for exam")
else:
    print(f"Invalid percentage{percentage}")
