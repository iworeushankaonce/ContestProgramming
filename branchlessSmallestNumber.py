# Find the smallest number among 3 numbers
# without conditional statements and
# greater than, less than operators


def smallest(x,y,z):
  return (((not(y//x)) and (not(y//z))) * y + 
         ((not(x//y)) and (not(x//z))) * x +
         ((not(z//y)) and (not(z//x)) * z))
x = 78
y = 88
z = 98

print(smallest(x,y,z)) 
print(smallest(z,y,x))
print(smallest(y,z,x))
print(smallest(y,x,z))
