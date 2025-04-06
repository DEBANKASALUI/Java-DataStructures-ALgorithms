Learning Reference:
  - https://github.com/LearnCodeWithDurgesh/YouTube-DSA-Series

Binary Tree: Hierarchical DataStructure where each Node has Atmost 2 Children.
  - Full Binary Tree: Every Node has either 0 or 2 children.
  - Complete Binary Tree: All levels are completely filled except possibly the last level, which is filled from left to right.
  - Perfect Binary Tree: All Internal Nodes have 2 children and all leaf nodes are at the same level.
  - Balanced Binary Tree: Difference in height between left and right subtrees is atmost 1.
  - Degenerate Skewed Tree: Every Parent has only one child.

Binary Search Tree Properties:
  - Left Child contains smaller value than Parent Node
  - Right Child contains larger value than Parent Node
  - No Duplicate values are allowed

Binary Search Tree Operations:
  
  Insert Opeartions in BST:
    To Insert New Node
  - Case 1: If Tree is empty, make new Node as Root Node.
  - Case 2: If key is smaller than Root, insert in Left subtree.
  - Case 3: If key is larger than Root, insert in Right subtree.

  Search Opeartions in BST:
  - Case 1: If tree is empty or root matches the key, return the root.
  - Case 2: If key is smaller than root, search in Left Subtree.
  - Case 3: If key is greater than root, search in Right Subtree.
  
  Deletion in BST:
  - Case 1: If Node has no children, remove the Node.
  - Case 2: If Node has 1 child, remove the node and connect the parent to its child.
  - Case 3: If Node has 2 children, find inorder successor(smallest node in right subtree), replace node's value with it and then delete the successor.
