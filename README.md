AI Uninformed Tree Search with
BFS, DFS, UCS Algorithms
======

###Discription
This is a project in JAVA. This project implements Breath First Search, Depth First Search & Uniform Cost Search, three uninformed (blind) tree search algorithms.

###About the Code :
three main classes :
  - BFS_Tree_Search.java
  - DFS_Tree_Search.java
  - UCS_Tree_Search.java
  
Class Node is used in BFS and DFS since these two algorithms are not based ob costs. class CostedNode is used in UCS to consider costs. 

###Problem
You can run project from all these clases. in **main** function first the tree are initialized then the search method are called.
the init tree hardcoded in this project is :
![alt text][tree]
[tree]: https://github.com/AhmadMja/AI_Uninformed_TreeSearch_BFS-DFS-UCS/blob/master/tree.PNG "initial tree"
where **Y** node is Goal.
All links have same cost=1. You can change costs in code.

Childes are visited in order (Algorithm Policy, Cost, Alphametric of Data within Node).

------
###Outputs :
Here you can see output of three ahgorithms. First lines in each output, indicate current visiting Node's path to root. after Goal founded, visited vectors are shown.  
Breadth First Search :  
A  
B A  
C A  
D A  
E A  
F B A  
G B A  
H C A  
I D A  
J D A  
K E A  
L E A  
M F B A  
N F B A  
O F B A  
P G B A  
Q G B A  
R G B A  
S H C A  
T J D A  
U J D A  
V L E A  
W S H C A  
X S H C A  
Y U J D A  
Goal Founded,
visited vector :A B C D E F G H I J K L M N O P Q R S T U V W X Y 

------
Depth-First-Search :  
A  
B A  
F B A  
M F B A 
N F B A  
O F B A  
G B A  
P G B A  
Q G B A  
R G B A  
C A  
H C A  
S H C A  
W S H C A  
X S H C A  
D A  
I D A  
J D A  
T J D A  
U J D A  
Y U J D A  
Goal Founded,
visited vector :A B F M N O G P Q R C H S W X D I J T U Y 

------
Uniform Cost Search :  
A  
B A  
C A  
D A  
E A  
F B A  
G B A  
H C A  
I D A  
J D A  
K E A  
L E A  
M F B A  
N F B A  
O F B A  
P G B A  
Q G B A  
R G B A  
S H C A  
T J D A  
U J D A  
V L E A  
W S H C A  
X S H C A  
Y U J D A  
Goal Founded,
visited vector :A B C D E F G H I J K L M N O P Q R S T U V W X Y 
