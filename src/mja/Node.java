package mja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Mja on 11/28/2016.
 */

public class Node {

    public String data;
    ArrayList<Node> childs = new ArrayList<Node>();
    Node whoCalledMe = null ;

    public Node(String Data) {
        this.data = Data;
    }

    public void addChild ( Node child )
    {
        this.childs.add(child);
    }

    public void addChild ( String childNames )
    {
        for (int i=0 ; i<childNames.length() ; i++)
        {
            Node newNode = new Node(Character.toString(childNames.charAt(i)));
            childs.add(newNode);
        }
    }

    public ArrayList<Node> getChilds ()
    {
        return childs;
    }

    public Node getChildByValue( String Data )
    {
        for (Node c :
                childs) {
            if(c.data.equals(Data)) return c;

        }
        return null;
    }

    public Node getWhoCalledMe() {
        return whoCalledMe;
    }

    public void setWhoCalledMe(Node whoCalledMe) {
        this.whoCalledMe = whoCalledMe;
    }
}