### 二分查找
```python
import math
def bina_search(list,item):
    low = 0
    hight = len(list)-1
    while low<=hight:
        #每次猜测
        mid = math.floor((low + hight)/2)
        guess = list[mid]
        if guess == item:
            return mid
        if guess > item:
            hight = mid-1
        else:
            low = mid+1
    return None

my_list = [1,3,5,7,8]
print(bina_search(my_list,7))
```
这个思路主要是不断中断数组
然后判断是否在中点上  
* 疑问: 为什么判断错误之后 mid 要+1/-1呢?
* 回答: 画了张图理解了一下 主要是把猜错的中点给排除掉


###选择排序

```python
def find_small(arry:list)->int:
    """
    找到最小的元素
    :param arry: 
    :return: 
    """
    smallest = arry[0]
    smallest_index = 0
    for i in range(1,len(arry)):
        if smallest>arry[i]:
            smallest = arry[i]
            smallest_index = i
    return smallest_index


def selectionSort(arry:list)->list:
    """
    选择排序
    :param arry: 
    :return: 
    """
    
    new_array = []
    for i in range(len(arry)):
        smallest = find_small(arry)
        new_array.append(arry.pop(smallest))
    return new_array

print(selectionSort([5,3,6,2,10]))
```
* 疑问:为什么循环`len(array)`次就可以完成了排序?
* 回答:因为数组长度是`len(array)`,每次都会弹出一个元素,
弹`len(array)`次就会让原数组为空.

### 数组链表区别 

* 数组元素是在一起的/列表是分开的,每个元素到都存储了下一个元素的地址  
* 数组读取,随机读取很快/链表插入删除很快.
* 数组中所有元素都是一个类型.

### 递归 
```python
def countdown1(i):
    print(i)
    countdown1(i-1)
# countdown(1)

def countdown2(i):
    print(i)
    if i<=1:#基线条件
        return
    else: #递归条件
        countdown2(i-1)

a=countdown2(3)
```
递归主要由两个部分组成:   
    1. 递归条件:函数调用自己   
    2. 基线条件:函数不再调用自己  
### 调用栈
* 当调用另一个函数时候,当前函数处于未完成状态.
```python
def fact(x):
    if x==1:
        return 1
    else:
        return x*fact(x-1)#塞入栈中 #fact函数没有结束
```

### 递归总结
* 递归指的是调用自己的函数
*   1. 递归条件:函数调用自己   
    2. 基线条件:函数不再调用自己
* 两种操作1.压入栈中 2.弹出栈
* 所有函数都进入调用栈  
* 调用栈很长就会很占用内存

### D&C算法 
```python
def DC(x,y):
    if x>y:
        x=x%y
        if x ==0:#基线条件
            return y
        return DC(x,y)
    if x<y:
        y=y%x
        if y ==0:
            return x
        return DC(x,y)
```
分治法思路
1. 找出基线条件/尽可能简单 
2. 不断分割问题->符合基线条件
#### 求和
```python
#我写的
a = [1,2,3,4,5]
def sum(array):
    if len(array) ==0 :
        return 0
    if len(array) ==1 :
        return array[0]
    else:
        first = array[0]
        array.pop(0) #pop 指的是pop的索引
        return first + sum(array)

print(sum(a))
```

```python
#标准答案
a = [1,2,3,4,5]
def sum(array):
    if array == []:
        return 0
    else:
        return array[0] + sum(array[1:])

print(sum(a))
```

数组求和问题
1. 将数组问题分割成数组第一个元素之后的元素和第一个元素相加  
2. 涉及数组的递归函数时候,基线条件通常是数组为空/只包含一个元素

#### 求数目

```python
a = [1,2,3,4,5]
def count(array):
    if array == []:
        return 0
    else:
        return 1+count(array[1:])
print(count(a))
```

### 求最大值 

```python
a = [1, 2, 8, 4, 5]


def biggest(array):
    if array == []:
        return 0
    else:
        return array[0] if\
            array[0] > biggest(array[1:])\
            else biggest(array[1:])
print(biggest(a))
```

* 或许我们接触的是for循环/如果我们用递归呢?
使用递归实现二分法
```python
import math
a = [1, 2, 3, 4, 5, 8, 10]
def cut(array, item):
    len_array = len(array)
    if len_array == 1:
        return 0
    else:
        mid = math.floor(len_array / 2)
        if item == array[mid]:
            return mid
        if item > array[mid]:
            return len(array[:mid]) + cut(array[mid:], item)
        else:
            return cut(array[:mid], item)
print(cut(a, 8))
```
* 基线条件
    1. 只剩下一个元素,就是那个需要的元素
    2. 中点直接是猜到的元素
* 递归条件
    1. 猜的元素比中点大
    2. 猜的元素比中点小
    
    
### qsort

```python
a = [1,2,6,3,8,5]

def qsort(array):
    if len(array) < 2:
        return array
    mid = array[0]
    low = [array[i] for i in range(1,len(array)) if array[i] <= mid]
    up = [array[i] for i in range(1,len(array)) if array[i] > mid]
    return qsort(low)+[mid]+qsort(up)
print(qsort(a))
```
1. 选择基准值
2. 分别找出比基准大的值和比基准小的值
3. 递归的对子数组进行排序

##### 归纳证明
1. 基线条件
2. 归纳条件 证明排序len=1的数组有用 len=2 有用 len=3有用
所以之后无需证明都有效 

###大O表示法
结论:
* 指明的是算法的增速
* 指出的是算法的最糟运行时间
* 不考虑`+*-/`
* 通常不考虑常量(快速查找常量比归并小)

### qsort 时间复杂度
* 最糟糕(头)
    1. 以头为基准,需要涉及整个列表
    2. 因为要遍历两边的数组,而且O(n)不受常量影响
* 最优(中间)
    1. 以中间为基准(类似二分log n)
    2. 每层O(n)
最佳的就是平均的情况 
TODO: 随机的选择用作基准的元素

```python
array = [5,7,2,4,3,1,8,6]
from random import randint
def qsort(array):
    if len(array)<=1:
        return array
    ran=randint(0,len(array)-1)

    mid = array[ran]
    array.pop(ran)
    smaller = [ i for i in array   if i<=mid]
    bigger = [i for i in array  if i>mid ]
    return  qsort(smaller) + [mid] +qsort(bigger)

print(qsort(array))
```