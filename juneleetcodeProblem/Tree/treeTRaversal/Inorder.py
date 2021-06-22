class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
        
    def printInorder(self,root):
        '''
        input :1,2,3,4,5,6,7
        o/p: 4,2,5,1,6,3,7
        '''
        if root:
            # print left part first
            
            self.printInorder(self,root.left)
            print(root.data)
            self.printInorder(self,root.right)
     
    def printPreOrder(self,root):
        if root:
            print(root.data)
            self.printPreOrder(self,root.left)
            self.printPreOrder(self,root.right)
    def printPosrorder(self,root):
        if root:
            self.printPosrorder(self,root.left)
            self.printPosrorder(self,root.right)
            print(root.data) 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.left.right=Node(5)
root.right.left=Node(6)
root.right.right=Node(7)
print ("Inorder traversal of binary tree is")
Node.printInorder(Node,root)
print ("preorder traversal of binary tree is")
Node.printPreOrder(Node,root)
print ("Postorder traversal of binary tree is")
Node.printPosrorders(Node,root)