package mja;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Tree_Search {

    public void levelOrderQueue(Node root , String Goal) {
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Node> visited = new ArrayList<Node>();

        if (root == null)
            return;
        q.add(root);
        while (!q.isEmpty()) {
            Node n = (Node) q.remove();
            visited.add(n);
            for (Node c : n.getChilds()) {
                c.setWhoCalledMe(n);
                q.add(c);
            }

            printPath(n);

            if ( n.data.equals(Goal) )
            {
                System.out.print("Goal Founded\nvisited vector :");
                for (Node c: visited ) {
                    System.out.print(c.data + " ");
                }
                return;
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Node root = new Node("A");
        root.setWhoCalledMe(null);
        root.addChild("BCDE");

        root.getChildByValue("B").addChild("FG");
        root.getChildByValue("B").getChildByValue("F").addChild("MNO");
        root.getChildByValue("B").getChildByValue("G").addChild("PQR");

        root.getChildByValue("C").addChild("H");
        root.getChildByValue("C").getChildByValue("H").addChild("S");
        root.getChildByValue("C").getChildByValue("H").getChildByValue("S").addChild("WX");

        root.getChildByValue("D").addChild("IJ");
        root.getChildByValue("D").getChildByValue("J").addChild("TU");
        root.getChildByValue("D").getChildByValue("J").getChildByValue("U").addChild("YZ");

        root.getChildByValue("E").addChild("KL");
        root.getChildByValue("E").getChildByValue("L").addChild("V");

        BFS_Tree_Search i = new BFS_Tree_Search();
        System.out.println("Uniform Cost Search : ");
        i.levelOrderQueue(root , "Y");
    }

    void printPath ( Node current )
    {
        Node pointer = current;
        System.out.print(pointer.data + " ");

        while (pointer.getWhoCalledMe()!= null)
        {
            pointer = pointer.getWhoCalledMe() ;
            System.out.print(pointer.data + " ");
        }
        System.out.println(" ");
    }
}

