package mja;

import java.util.ArrayList;

/**
 * Created by Mja on 11/28/2016.
 */
public class CostedNode{

    public String data;
    private ArrayList<CostedNode> childs = new ArrayList<CostedNode>();
    private CostedNode whoCalledMe = null ;
    private int cost = 0 ;

    public CostedNode(String Data, int Cost) {
        this.data = Data;
        this.cost=Cost;
    }

    public void addChild ( CostedNode child )
    {
        this.childs.add(child);
    }

    public void addChild ( String childNames , int ChildsCosts)
    {
        for (int i=0 ; i<childNames.length() ; i++)
        {
            // default cost is 0 for all childes
            CostedNode newNode = new CostedNode(Character.toString(childNames.charAt(i)),ChildsCosts);
            childs.add(newNode);
        }
    }

    public ArrayList<CostedNode> getChilds ()
    {
        return childs;
    }

    public CostedNode getChildByValue( String Data )
    {
        for (CostedNode c :
                childs) {
            if(c.data.equals(Data)) return c;

        }
        return null;
    }


    public CostedNode getWhoCalledMe() {
        return whoCalledMe;
    }

    public void setWhoCalledMe(CostedNode whoCalledMe) {
        this.whoCalledMe = whoCalledMe;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
