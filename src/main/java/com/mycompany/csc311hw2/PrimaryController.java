package com.mycompany.csc311hw2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PrimaryController {

    private int playerTurn;
    private Node[][] theBoard = new Node[3][3];
    //instantiation of all rectangles
    private Rectangle TLRect = new Rectangle(), TMRect = new Rectangle(), TRRect = new Rectangle(), MLRect = new Rectangle(), MMRect = new Rectangle()
            , MRRect = new Rectangle(), LLRect = new Rectangle(), LMRect = new Rectangle(), LRRect = new Rectangle();
//    //instantiation of all cirlces
    private Circle TLCircle = new Circle(), TMCircle = new Circle(), TRCircle = new Circle(), MLCircle = new Circle(), MMCircle = new Circle()
            , MRCircle = new Circle(), LLCircle = new Circle(), LMCircle = new Circle(), LRCircle = new Circle();

    @FXML
    private void initialize() {
        playerTurn = 0;
        for(int i = 0 ; i < 3 ;i ++){
           theBoard[i][0] = new Node(0, 0);
           for(int j = 0 ; j < 3 ; j++){
               theBoard[i][j] = new Node(0, 0);
           }
        }
    }

    @FXML
    private void hitTL() {
        if (playerTurn < 9) {
            if (playerTurn % 2 == 0 || playerTurn == 0) {
                theBoard[0][0] = new Node(1, 1);
                TLRect.setOpacity(1.0);
                playerTurn++;

            } else {
                theBoard[0][0] = new Node(2, 2);
                playerTurn++;
            }
        }
        else
            System.out.println("End of Game");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    //NOTE: USE RECTANGLE HELPER METHOD TO CHECK WHICH CELL WAS CLICKED ON
    @FXML
    private void close() {
        System.exit(0);
    }
}
