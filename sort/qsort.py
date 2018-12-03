a = [1,2,6,3,8,5]

def qsort(array):
    if len(array) < 2:
        return array
    mid = array[0]
    low = [array[i] for i in range(1,len(array)) if array[i] <= mid]
    up = [array[i] for i in range(1,len(array)) if array[i] > mid]
    return qsort(low)+[mid]+qsort(up)
print(qsort(a))