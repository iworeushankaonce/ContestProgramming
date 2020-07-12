# Find the smallest number among 3 numbers
# without conditional statements (if) and
# comparison (greater than, less than) operators


def smallest(x,y,z):
  # not(y//x) is the same as y<x
  
  # conditional 'if' is replaced with 
  # multiplication, so:
  # in case the expression 
  # (((not(y//x)) and (not(y//z))) is false
  # it will be 0 and multiplyting 0*y will 
  # be zero
  
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
