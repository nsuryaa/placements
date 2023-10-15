value = 0
def modify_value():
    global value 
    value = 10
def printing_value():
    value = 20
    print(value)
modify_value()
printing_value()
print(value)

# ANS : 20
# 10