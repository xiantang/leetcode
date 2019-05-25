

# JAVA刷题常用API

## java.lang.String

| 方法 | 描述 | 
|---| ----- |
| char charAt(int index) | 返回给定位置的代码单元 | 
| boolean equals(Object other) boolean equalsIngoreCase(String other) |	如果字符串与other相等，返回true 忽略大小写 | 
| int length() |	返回字符串的长度 |
| String substring(int beginIndex) String substring(int beginIndex, int endIndex) |	返回一个新字符串，包含原始字符串从beginIndex到串尾或到endIndex-1的所有代码单元 | 
| String toLowerCase() String toUpperCase() |返回小写字符串返回大写字符串|
| int indexOf(String str[, int fromIndex])
int lastIndexOF(String str[, int fromIndex]) | 	返回第一个/最后一个子串的位置,从起始位置或者fromIndex开始 |  


## java.util.Scanner

| 方法 | 描述 | 
|---| ----- |
| Scanner(InputStream in) Scanner(File f) Scanner(String data) | 	用给定的输入流创建一个Scanner对象    例子：Scanner in = new Scanner(System.in)| 
|String nextLine() |	读取输入的下一行内容 |
|String next()	|读取输入的下一个单词（以空格作为间隔） |
|int nextInt()   double nextDouble()	|读取并转换下一个表示整数或浮点数的字符序列|



## java.util.Arrays

| 方法 | 描述 | 
|---| ----- |
| static String toString(type[] a) |	返回包含a中数据元素的字符串 |
| static void sort(type[] a) |	采用优化的快速排序算法对数组进行排序 |
| static void binarySearch(type[] a, type v)   |	使用二分搜索算法查找值v | 
| static Boolean equals(type[] a, type[] b)	|如果两个数字相同，返回true |


## java.util.List<E>

| 方法 | 描述 | 
|---| ----- |
| `ListIterator<E> listIterator()`  `ListIterator<E> listIterator(int index)`| 返回一个列表迭代器 迭代器第一次调用next返回给定位置元素  | 
|  `void add(int i, E element)` `void addAll(int i, Colletion<? extend E> elements)` | 向集合指定位置添加元素 | 
E remove(int i)	删除给定位置元素并返回
E get(int i)	获得给定位置元素并返回
E set(int i, E element)
设置给定位置元素并返回原来的元素
int indexOf(Object element)
int lastIndexOf(Object element)	返回与指定元素相等元素在列表中第一次出现的位置
返回与指定元素相等元素在列表中最后一次出现的位置



## Queue

add        增加一个元索                     如果队列已满，则抛出一个IIIegaISlabEepeplian异常
remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
element  返回队列头部的元素             如果队列为空，则抛出一个NoSuchElementException异常
offer       添加一个元素并返回true       如果队列已满，则返回false
poll         移除并返问队列头部的元素    如果队列为空，则返回null
peek       返回队列头部的元素             如果队列为空，则返回null
put         添加一个元素                      如果队列满，则阻塞
take        移除并返回队列头部的元素     如果队列为空，则阻塞

# LeetCode 300
## Tree 
| Tree | Title | Solution | Difficulty |
|---| ----- | -------- | ---------- |
|988|[Path Sum II](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/113.path-sum-ii.java) | [Java] | Medium |
|114|[Flatten Binary Tree to Linked List](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/114.flatten-binary-tree-to-linked-list.java) | [Java] | Medium |
|129|[sum root to leaf numbers](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/129.sum-root-to-leaf-numbers.java) | [Java] | Medium |
|199|[binary tree right side view](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/199.binary-tree-right-side-view.java) | [Java] | Medium |
|230|[kth smallest element in a bst](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/230.kth-smallest-element-in-a-bst) | [Java] | Medium |
|337|[house robber iii ](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/337.house-robber-iii.java) | [Java] | Medium |
|449|[serialize and deserialize bst](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/449.serialize-and-deserialize-bst.java) | [Java] | Medium |
|623|[add-one-row-to-tree](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/623.add-one-row-to-tree.java) | [Java] | Medium |
|652|[find-duplicate-subtrees](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/652.find-duplicate-subtrees.java) | [Java] | Medium |
|662|[maximum-width-of-binary-tree](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/662.maximum-width-of-binary-tree.java) | [Java] | Medium |
|684|[redundant-connection](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/684.redundant-connection.java) | [Java] | Medium |
|958|[check-completeness-of-a-binary-tree](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/958.check-completeness-of-a-binary-tree.java) | [Java] | Medium |
|96|[check-completeness-of-a-binary-tree](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/958.check-completeness-of-a-binary-tree.java) | [Java] | Medium |
|894|[All Possible Full Binary Trees](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/AllPossibleFullBinaryTrees.java) | [Java] | Medium |
|450|[delete-node-in-a-bst](https://github.com/xiantang/leetcode/blob/master/java/src/Tree/450.delete-node-in-a-bst.java) | [Java] | Medium |


## BinarySearch

| BinarySearch | Title | Solution | Difficulty |  
|---| ----- | -------- | ---------- | 
|154|[FindMinimuminRotatedSortedArrayII](https://github.com/xiantang/leetcode/blob/master/python/binarySearch/154FindMinimuminRotatedSortedArrayII.py) | [Python] | Hard |


## LinkList

| LinkList | Title | Solution | Difficulty |
|---| ----- | -------- | ---------- |
|109|[ConvertSortedListtoBinarySearchTree](https://github.com/xiantang/leetcode/blob/master/python/linkList/109ConvertSortedListtoBinarySearchTree.py) | [Python] | Hard |
|141|[LinkedListCycle](https://github.com/xiantang/leetcode/blob/master/python/linkList/141LinkedListCycle.py) | [Python] | Easy |
|143|[ReorderList](https://github.com/xiantang/leetcode/blob/master/python/linkList/143ReorderList.py) | [Python] | 	Medium |
|160|[getIntersectionNode](https://github.com/xiantang/leetcode/blob/master/python/linkList/160getIntersectionNode.py) | [Python] | Easy |

## DP
| DP | Title | Solution | Difficulty |  
|---| ----- | -------- | ---------- | 

