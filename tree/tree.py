

class binTNode:
    def __init__(self,dat,left=None,right=None):
        self.data=dat
        self.right=right
        self.left=left

def count(t):
    if t is None:
        return 0
    else:
        return 1+count(t.left)+count(t.right)

def sum_binTnodes(t):
    if t is None:
        return 0
    else:
        return  t.data+sum_binTnodes(t.left)+sum_binTnodes(t.right)

def proc(data):
    print(data)
def preorder(t,proc):#根序便利
    if t is None:
        return
    proc(t.data)
    preorder(t.left,proc)
    preorder(t.right,proc)

def preleft(t,proc): #中序
    if t is None:
        return
    preleft(t.left,proc)
    proc(t.data)
    preleft(t.right,proc)


def preafter(t, proc):  # 中序
    if t is None:
        return
    preleft(t.right, proc)

    proc(t.data)
    preleft(t.left, proc)


def print_(t):
    if t is None:
        print("^",end="")
        return
    print("("+str(t.data),end="")
    print_(t.left)
    print_(t.right)
    print(")",end="")

# def levelorder(t,proc):
#

t=binTNode(1,binTNode(5),binTNode(3))
# print_(t)

preafter(t,proc)
# print(sum_binTnodes(t))