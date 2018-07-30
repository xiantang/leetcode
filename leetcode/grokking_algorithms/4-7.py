array = [5,7,2,4,3,1,8,6]

def qsort(array):
    if len(array)<=1:
        return array
    mid = array[0]
    smaller = [ array[i] for i in  range(1,len(array)) if array[i]<=mid]
    bigger = [array[i] for i in range(1,len(array))  if array[i]>mid ]
    return  qsort(smaller) + [mid] +qsort(bigger)

print(qsort(array))
