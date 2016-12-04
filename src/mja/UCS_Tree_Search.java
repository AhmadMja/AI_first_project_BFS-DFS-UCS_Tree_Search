package mja;

import java.util.*;

public class UCS_Tree_Search {

    public void UCS_DoSearch(CostedNode root , String Goal) {
        CostedNodeComparator comparator = new CostedNodeComparator();
        PriorityQueue<CostedNode> frontier = new PriorityQueue<CostedNode>(comparator);
        ArrayList<CostedNode> visited = new ArrayList<CostedNode>();

        if (root == null)
            return;
        frontier.add(root);
        while (!frontier.isEmpty()) {
            CostedNode n = (CostedNode) frontier.remove();
            visited.add(n);
            for (CostedNode c : n.getChilds()) {
                c.setWhoCalledMe(n);
                frontier.add(c);
            }

            printPath(n);

            if ( n.data.equals(Goal) )
            {
                System.out.print("Goal Founded\nvisited vector :");
                for (CostedNode c: visited ) {
                    System.out.print(c.data + " ");
                }
                return;
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        CostedNode root = new CostedNode("A",0);
        root.setWhoCalledMe(null);
        root.addChild("BCDE" , 1);

        root.getChildByValue("B").addChild("FG" , 2);
        root.getChildByValue("B").getChildByValue("F").addChild("MNO" , 3);
        root.getChildByValue("B").getChildByValue("G").addChild("PQR" , 3);

        root.getChildByValue("B").getChildByValue("G").addChild("PQR" , 3);

        root.getChildByValue("C").addChild("H" , 2);
        root.getChildByValue("C").getChildByValue("H").addChild("S" , 3);
        root.getChildByValue("C").getChildByValue("H").getChildByValue("S").addChild("WX" , 4);

        root.getChildByValue("D").addChild("IJ" , 2);
        root.getChildByValue("D").getChildByValue("J").addChild("TU" , 3 );
        root.getChildByValue("D").getChildByValue("J").getChildByValue("U").addChild("YZ" , 4);

        root.getChildByValue("E").addChild("KL" , 2);
        root.getChildByValue("E").getChildByValue("L").addChild("V" , 3);

        UCS_Tree_Search i = new UCS_Tree_Search();
        System.out.println("Breadth First Search : ");
        i.UCS_DoSearch(root , "Y");
    }

    void printPath ( CostedNode current )
    {
        CostedNode pointer = current;
        System.out.print(pointer.data + " ");

        while (pointer.getWhoCalledMe()!= null)
        {
            pointer = pointer.getWhoCalledMe() ;
            System.out.print(pointer.data + " ");
        }
        System.out.println(" ");
    }
}

