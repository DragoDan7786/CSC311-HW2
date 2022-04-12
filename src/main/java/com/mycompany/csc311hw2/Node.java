/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc311hw2;

/**
 *
 * @author sulem
 */
public class Node {
    /**
     *  - 0 is no shape, 1 is rectangle , 2 is circle
    */
    private int shapeType;
    
    /**
     *
     * @param shapeType - Inserts shape value for node
     */
    public Node(int shapeType){
        this.shapeType = shapeType;
    }
    
    /**
     * 
     * @return - This method returns 0 for no shape, 1 for rectangle, and 2 for Circle
     */
    public int getShapeType(){
        return shapeType;
    }
    
    @Override
    public boolean equals(Object other){
        Node otherNode = (Node)other;
        if(shapeType == otherNode.shapeType)
            return true;
        else
            return false;
    }
}
