class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
        
        
    def insert(node,data):
            if not node:
                return Node(data)
            queue = [node]
            while len(queue) > 0:
            # n is the current node in the tree
                n = queue.pop(0)

        # if it has no children insert node
        # start from the left
                if not n.left:
                      n.left = Node(data)
                      return node
                if not n.right:
                    n.right = Node(data)
                    return node

                queue.append(n.left)
                queue.append(n.right)
                    
                
    
    
    
    
    def printTree(self,root):
         if root == None:
            return
         print(root.data)
         self.printTree(self,root.left)
         self.printTree(self,root.right)
        
        
        
        
    def printTreeDetailed(self,root):
        if root == None:
           return
        print(root.data, end = ": ")
        if root.left!=None:
            print("L", root.left.data, end = ",")
            
        else:
            print("null" ,end=",")
        if root.right !=None:
                  print("R", root.right.data)
        else:
            print("null",end=",")
        print()
        self.printTreeDetailed(self,root.left)
        self.printTreeDetailed(self,root.right)
    
            
        
        
root=Node(1)
#root.left=Node(2)
#root.right=Node(3)
#root.left.left=Node(4)
#root.left.right=Node(5)
#root.right.left=Node(6)
#root.right.right=Node(7)
root.insert(2)
root.insert(3)
root.insert(4)
root.insert(5)
root.insert(6)
root.insert(7)
Node.printTree(Node,root)
Node.printTreeDetailed(Node,root)


