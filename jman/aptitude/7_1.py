def generate_random_month(index):
    months = range(1, 13)
    yield months[index]
    yield months[index+2]

next_months = generate_random_month(3)
print(next(next_months),next(next_months))

# ANS : 4 6