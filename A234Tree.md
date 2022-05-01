Solution
---
--> 2-3-4 tree is a self-balancing multi-way search tree. It is self-balancing is always perfectly balanced.
--> The individual nodes can at most hold 3 values sorted in ascending order.
--> All the leaf nodes are at the same level.
--> They can have 2,3,4 children.
--> A leaf node is 2, 3 or 4 node and the children are null.


**TODO** show what happens during the insertion of the numbers 3, 7,
5, 15, 17, 9, 13, 21, 11 and 19 (in this order) into an 2-3-4-Tree

3 --> |3-7| --> |3-5-7|  -->     5      -->       5      -->      |5-15|     -->
                              /      \         /      \          /   |   \
                           |3|    |7-15|     |3|    |7-15-17|  |3| |7-9| |17|


             |5-15|              -->
      /        |       \
    |3|      |7-9-13|  |17|

       |5-15|                 -->               |5-9-15|                     -->         |5-9-15|
/        |       \                         /        |    \     \                    /        |    \     \
|3|    |7-9-13|  |17-21|               |3|    |7|   |11-13|    |17-21|           |3|    |7 |   |11-13|    |17-19-21|


**TODO** show what happens during the insertion of the numbers 3, 5,
7, 9, 11, 13, 15, 17, 19 and 21 (in this order) into an 2-3-4-Tree

3 --> |3-5| --> |3-5-7| --> |5|       -->  |5|           -->    |5-9|           -->     |5-9|                 -->   |5-9-13|          -->     |5-9-13|  
                          /     \         /     \             /   |   \                /   |   \                   /   |   \   \            /   |   \   \
                        |3|    |7-9|    |3|    |7-9-11|     |3|  |7|  |11-13|       |3|  |7|  |11-13-15|       |3|  |7|  |11|  |15-17|   |3|  |7|  |11|  |15-17-19|

-->                     |9|
                      /     \
                    |5|     |13-17|
                 /      \  /   |   \   
               |3|     |7||11| |15| |19-21|  


-->  The difference between the sorted and the unsorted insertions in the trees is that when the tree is sorted the data element is always added to the rightmost sub-tree which leads
to more rotations for balancing the tree. 

