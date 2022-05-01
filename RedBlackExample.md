Red-Black-Tree
---

**TODO**
Insert your answers and solutions for the Red-Black-Tree tasks!
First :
A red-black tree is a binary search tree with one extra bit of storage per node: its colour, which is either red or black.
By constraining the way nodes can be coloured on any path from the root to a leaf, 
red-black trees ensure that no such path is more than twice as long as any other, so that the tree is approximately balanced.

Properties of Red Black tree :
-> Every node is either red or black.
-> Every leaf is black.
-> If a node is red, then both its children are black.
-> Every path from a node to a descendant leaf contains same no. of black nodes.

Second and Third :

    6(B)                6(B)                                                                6(B)               6(B)              6(B)
    /  \       -->    /     \   [Red-Red violation because parent and child are red] -->  /     \     -->   /       \   -->    /     \   [Red-Red violation because parent and child are red]
3(R)    7(R)        3(R)    7(R)                                                         3(B)    7(R)     3(B)     7(R)      3(B)    7(R)
                      \                                                                    \            /     \            /     \
                      4(R)                                                                4(R)         2(R)   4(R)        2(R)   4(R)
                                                                                                                          /
                                                                                                                         1(R)



-->    6(B)                     
      /  \
   3(R)    7(B)  [Final Red-Black Tree]
   /  \
 2(B)  4(B)
  /
1(R)


Fourth :
AVL tree:
         3
       /   \
      2     6
     /     /  \
    1     4    7

-> AVL trees provide faster lookups tahn red black trees.
-> Due to fewer rotations in Red - Black trees , it has faster insertion and deletion operations.
-> AVL trees require balance factors for each nodes and requires increased storage whereas in red-black trees it just needs 1 information per node.

Fifth :

--> 6 and 3 are the top most elements or the root of both AVL and Red-Black trees.
--> 7 is the right node in both the tree structures
--> 2 and 1 are the left nodes in AVL and Red-Black trees. 


Sixth :
Transformation of red-black tree to 2-4 tree
     |3-6|
  /    |   \
|1-2|  4    7

