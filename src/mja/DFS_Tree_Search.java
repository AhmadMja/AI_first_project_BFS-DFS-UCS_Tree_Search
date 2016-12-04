package mja;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by Mja on 11/28/2016.
 */
public class DFS_Tree_Search {

    public void DFS(Node root, String Goal) {
        Stack<Node> s = new Stack<Node>();
        ArrayList<Node> visited = new ArrayList<Node>();

        if (root == null) {
            return;
        }
        s.add(root);

        while (!s.isEmpty()) {
            Node x = s.pop();
            visited.add(x);

            for (int i = x.getChilds().size()-1 ; i >=0 ; i--) {
                x.getChilds().get(i).setWhoCalledMe(x);
                s.add(x.getChilds().get(i));
            }

            printPath(x);

            if (x.data.equals(Goal)) {
                System.out.print("Goal Founded\nvisited vector :");
                for (Node c : visited) {
                    System.out.print(c.data + " ");
                }
                return;
            }
        }
    }

    public static void main(String args[]) {
        Node root = new Node("A");
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

        DFS_Tree_Search b = new DFS_Tree_Search();
        System.out.println("Depth-First-Search : ");
        b.DFS(root, "Y");
    }

    void printPath(Node current) {
        Node pointer = current;
        System.out.print(pointer.data + " ");

        while (pointer.getWhoCalledMe() != null) {
            pointer = pointer.getWhoCalledMe();
            System.out.print(pointer.data + " ");
        }
        System.out.println(" ");
    }
}