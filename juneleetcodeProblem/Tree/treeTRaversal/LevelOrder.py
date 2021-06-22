from queue import Queue
class BinaryTreeNode:
  def __init__(self, data):
    self.data = data
    self.left = None
    self.right=None
     
def insert(root,newValue):
    #if binary search tree is empty, make a new node and declare it as root
    if root is None:
        root=BinaryTreeNode(newValue)
        return root
    #binary search tree is not empty, so we will insert it into the tree
    #if newValue is less than value of data in root, add it to left subtree and proceed recursively
    if newValue<root.data:
        root.left=insert(root.left,newValue)
    else:
        #if newValue is greater than value of data in root, add it to right subtree and proceed recursively
        root.right=insert(root.right,newValue)
    return root
def levelorder(root):
    if root==None:
        return
    Q=Queue()
    Q.put(root)
    while(not Q.empty()):
        node=Q.get()
        if node==None:
            continue
        print(node.data)
        Q.put(node.left)
        Q.put(node.right)
     
root= insert(None,15)
insert(root,10)
insert(root,25)
insert(root,6)
insert(root,14)
insert(root,20)
insert(root,60)
print("Printing the level order traversal of the binary tree.")
levelorder(root)
