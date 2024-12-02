## Problem Description

You're given a binary tree. Your task is to find the size of the largest subtree within this binary tree that also satisfies the properties of a Binary Search Tree (BST). The size of a subtree is defined as the number of nodes it contains.

### Properties of a Valid BST Subtree
A subtree of the binary tree is considered a BST if:
1. Every node's left child is less than the node itself.
2. Every node's right child is greater than the node itself.
3. There are no duplicate values in the subtree.

## Solution Approach

The solution uses a recursive approach with helper functions to:
1. **Validate Subtrees**: The `helper` function checks if a subtree satisfies the BST properties using minimum and maximum bounds for node values.
2. **Calculate Subtree Sizes**: The `non` function calculates the size of a subtree by recursively summing the nodes.
3. **Track Largest Subtree**: A static class `Largest` maintains the size of the largest BST found during traversal.

### Steps
- Traverse the tree using a recursive helper function.
- Validate whether the current subtree satisfies BST conditions.
- If valid, calculate its size and update the largest BST size.
- If not valid, move on to check other subtrees.

### Time and Space Complexity

- **Time Complexity**: O(n²), where n is the number of nodes. Each validation involves traversing a subtree to calculate its size, leading to a potential quadratic complexity in the worst case.
  
- **Space Complexity**: O(h), where h is the height of the tree. This accounts for the recursion stack during tree traversal. In the worst case (unbalanced tree), h can be as large as n.

For a detailed explanation of the approach, visit the [description here](https://www.geeksforgeeks.org/problems/largest-bst/1).
