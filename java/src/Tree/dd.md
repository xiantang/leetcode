前景提要：    
这两个月一直有在刷`leetcode`，现在国内和国外两个站点加一起已经有200道题目了，感觉自己对刷题也有了一些见解，想分享一些关于算法的技巧。       
当提到递归这两个字的时候，其实很多人都没有很仔细的理解递归，一提到递归就迷糊，原因很简单，因为我们平时使用的都是类C语言，所以接触循环比较多，上来就递归难免会产生迷惑。       
我想引用《算法图解》上的递归，来为大家慢慢解释。      
我们先为递归下一个定义，递归就是函数调用自己来解决问题。但是递归的时候到底发生了什么事情呢？
我们先给出一段简单的代码:

```python
def greet2(name):
    print("how are you, " + name + "?")
def bye():
    print("ok bye!")

def greet(name):
    print("hello, " + name + "!")
    greet2(name)
    print("getting ready to say bye...")
    bye()
greet('maggie')
```
分别有3个函数`greet2()`,`bye()`和`greet()`      
我们调用`greet()`的时候，计算机会给这个函数分配一块内存
![](https://img-blog.csdn.net/20180422211333306?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMDEwMTQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
打印出`hello, maggie!`     
然后你调用`greet2()` 计算机也会为`greet2()`分配一段内存      
![](https://img-blog.csdn.net/20180422211638439?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMDEwMTQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
计算机打印出`how are you, maggie? `   
但是当`greet2()`调用结束之后,`greet2`的值被返回（因为是void 所以不返回值），此时栈顶的内存块就被弹出。      
![](https://img-blog.csdn.net/20180422211829680?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMDEwMTQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)     
下面调用`bye()`也是同样的操作，函数调用的时候向程序栈栈顶插入一个当前函数的内存块。    
![](https://img-blog.csdn.net/20180422211925335?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMDEwMTQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)   
程序结束的时候就将这个内存块推出栈 。      
![](https://img-blog.csdn.net/20180422211925335?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMDEwMTQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)    
最后再执行完`greet()`函数。     
可以看出函数的调用其实就是一个栈的入栈和出栈的操作。我们的递归也是基于如此，只不过调用的函数是自己罢了。       

下面我们要介绍递归的两个条件：
递归条件：递归条件指的是函数继续调用自己的条件。
基线条件:  基线条件就是不再调用自己，也就是将当前函数推出栈。     

我给出一段代码帮助大家更好的理解：

```python
def fact(x):
    if x == 1:
        return 1
    else:
        return x * fact(x-1)
a = fact(3)
print(a)
```
可以很明显的看到`if x==1: return 1`是基线条件    
`else:return x * fact(x-1)`是递归条件。       
下面重点来了，其实我们看这段代码的时候，第一眼看多少有点不理解，
为什么`else`里面的代码是这样的？     
我给出我的解释，在写递归的时候，一定要有一种统筹大局的感觉，想象自己统领这七万大军，这时候我们这样想，假设`x=3`那么我们想用递归的画，只要`3*（2*1）`就行了，也就是`3`和之前值相乘就行了，我们不需要在这一层去解决，只需要交给下面的函数去解决就行了，也就是`fact(x-1)` 他会去计算剩下的值。     
但是我们需要考虑一个特殊的条件，如果`x=1`，会是什么个条件，显而易见，去掉`if`中的语句，会产生`stackoverflow`的错误，现在注意想`x=1`这一层，不要去想其他层，很容易就可以想到，只要在这里返回一个`1`    
然后当这个函数从栈中推出的时候,他就会自动的被`fact(2)`接住。    
![](https://img-blog.csdn.net/20180422213233786?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxMDEwMTQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)      
我们可以得出结论，在面对递归的问题的时候，只需要想当前层产生的问题就可以了，因为人脑对于多层的递归理解是很吃力的（少数人除外），只想当前层的问题，然后有统筹大局的能力就可以解决关于递归的问题。      
下面我以一道leetcode的简单题为例子来再讲解一下这个方法。   

617.合并二叉树
给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。

你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。

示例 1:

输入: 
```
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                 
```	  
输出: 
合并后的树:

```
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
```

我的解法是通过遍历Tree1 然后如果Tree1不存在的节点就将它转换为Tree2 的节点，如果都存在就转换为两个节点相加的值。     
也就是将Tree1 转换成两棵树的合并树。
按照自上向下的思想：
我们先思考对于Tree1的根节点     
我采用的是根左右的先序遍历方式   
根节点分别代表来Tree1的根节点和Tree2的根节点   
如果Tree1不存在，我们就可以直接返回Tree2，因为整个Tree1都是Null，如果Tree2不存在，同理返回Tree1，都存在就将根节点的值更新为两棵树的根节点的和。      
然后我们分别调用自身去构建根节点的左子树和右子树，我们不用去思考细节，只要知道，这两个函数返回的分别是根节点的左子树和右子树就行了。
最后将构建好的根节点返回就行了。   
这是我的解法:

```java
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        TreeNode res = mergeTree(t1,t2);
        return res;
    }
    
    public TreeNode mergeTree(TreeNode t1,TreeNode t2){
        if(t1==null)
            return t2;
        if(t2==null)
            return t1;
        t1.val +=t2.val;
        t1.left= mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);        
        return t1;
        
        
    }
}
```

下面总结一下，写递归的时候要具有统筹大局的思想，并且只向当前层。