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
    private int shapeType;
    
    public Node(int shapeType){
        this.shapeType = shapeType;
    }
    
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
