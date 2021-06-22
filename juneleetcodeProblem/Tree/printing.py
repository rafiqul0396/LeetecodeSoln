class Node:
    
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
        
        
    def insert(self,data):
        pass
    
    
    
class Tree:
    root=Node()
    def printTree(self,root):
         if root == None:
            return
         print(root.data)
         self.printTree(root.left)
         self.printTree(root.right)
     
     
     
t=Tree()    
root= Node(0,1)
print(t.printTree())
