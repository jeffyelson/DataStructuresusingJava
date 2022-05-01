Solution
---
-->AVL tree is a self-balancing binary search tree. The difference between heights of left and right subtrees cannot be more than one for all nodes. An AVL tree is said to be balanced if 
the balance factor of each node is between -1 to +1 . The balance factor is the difference between the height of the right subtree and the left subtree.

-->Need for balancing : 
The cost of BST operation is O(h) where h is the height of the tree. It may become O(n) for a skewed binary tree. If we ensure that the cost is O(log N) after every insertion and deletion,
then an upper bound of O(log N) can be guaranteed for all these operations. Therefore, for n nodes, the height of the AVL tree is O(log N).


**TODO** show what happens during the insertion of the numbers 14, 17,
19, 7, 5, 10 and 18 (in this order) into an AVL-Tree

14 --> 14   --> 14   [imbalance R-L=2] --> 17       -->  17        -->  17       --> [imbalance R-L=-2]  --> 17      -->   17   [imbalance R-L = 1-3 = -2]  -->   14
        \        \                       /    \        /    \         /    \                               /    \        /    \                                 /    \
         17      17                     14    19      14    19       14    19                             7     19      7      19                              7     17
                   \                                  /              /                                  /   \         /  \                                    / \      \
                   19                                7              7                                  5    14       5   14                                  5  10     19
                                                                   /                                                     /
                                                                  5                                                     10

-->     14       -[imbalance R-L = 2 - 0 = 2]    14
       /  \                                    /    \
      7   17                                 7       18
    /   \   \                             /    \    /   \
   5    10   9                           5     10  17   19
             /
            18