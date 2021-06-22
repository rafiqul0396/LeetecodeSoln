#from NodeTree import Node
class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
        
    def maxElement(self,root):
        root_val=0
        right=0
        left=0
        max=0;
        if(root!=None):
            root_val=root.data
            
            left=self.maxElement(self,root.left)
            right=self.maxElement(self,root.right)
            if(left>right):
                max=left
            else:
                max=right
                
            if(root_val>max):
                max=root_val
        return max
    
    
root=Node(1)
root.left=Node(2)
root.right=Node(300)
root.left.left=Node(4)
root.left.right=Node(5)
root.right.left=Node(6)
root.right.right=Node(7)
print(Node.maxElement(Node,root))     
                
            
    
    