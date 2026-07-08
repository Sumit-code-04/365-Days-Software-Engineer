import random

# Generate a random number between 1 and 100
min_num = 1
max_num = 100
random_number = random.randint(min_num, max_num)

guess = 0
attempts = 0

print("===== Number Guessing Game =====")
print(f"Guess the number between {min_num} and {max_num}")

while guess != random_number:
    guess = int(input("Enter your guess: "))
    attempts += 1

    if guess < random_number:
        print("TOO LOW! Try Again")
    elif guess > random_number:
        print("TOO HIGH! Try Again")
    else:
        print(f"\nCORRECT! The number was {guess}")
        print(f"Number of attempts: {attempts}")