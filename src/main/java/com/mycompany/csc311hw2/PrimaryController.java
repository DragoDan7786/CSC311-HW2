package com.mycompany.csc311hw2;

import java.io.IOException;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

/**
 *
 * @author suleman ali
 */
public class PrimaryController {

    /**
     * field playerTurn helps keep track of whose turn it is. Player one is
     * going to be even, and Player two is going to be odd
     */
    private int playerTurn;
    /**
     * theBoard is a two dimensional array that stores the state of the playing
     * board by using nodes to record each cell
     */
    private Node[][] theBoard = new Node[3][3];
    //instantiation of all rectangles
    @FXML
    private Rectangle TLRect = new Rectangle(), TMRect = new Rectangle(), TRRect = new Rectangle(), MLRect = new Rectangle(), MMRect = new Rectangle(), MRRect = new Rectangle(), LLRect = new Rectangle(), LMRect = new Rectangle(), LRRect = new Rectangle();
    //instantiation of all cirlces
    @FXML
    private Circle TLCircle = new Circle(), TMCircle = new Circle(), TRCircle = new Circle(), MLCircle = new Circle(), MMCircle = new Circle(), MRCircle = new Circle(), LLCircle = new Circle(), LMCircle = new Circle(), LRCircle = new Circle();
    //creating a node thats empty to check if a node is full
    private Node empty;
    //reason for these integers are to make further code more readable
    private int rect = 1;
    private int circle = 2;
    //checks if game is over
    private boolean finished;

    /**
     * initialize method - Creates board, instantiates theBoard array with empty
     * nodes, and defines empty
     */
    @FXML
    private void initialize() {
        playerTurn = 0;
        for (int i = 0; i < 3; i++) {
            theBoard[i][0] = new Node(0);
            for (int j = 0; j < 3; j++) {
                theBoard[i][j] = new Node(0);
            }
        }
        empty = new Node(0);
        finished = false;
    }

    /**
     * hitTL method - checks if game is over. If not, then checks is node for
     * cell is empty. If so, then allocates node in array to contain a shape,
     * and reveals shape on the board TL - Top Left
     */
    @FXML
    private void hitTL() {
        if (!finished) {
            if (playerTurn < 9 && theBoard[0][0].equals(empty)) {
                if (playerTurn % 2 == 0 || playerTurn == 0) {
                    theBoard[0][0] = new Node(rect);
                    TLRect.setOpacity(1.0);
                    playerTurn++;

                } else {
                    theBoard[0][0] = new Node(circle);
                    TLCircle.setVisible(true);
                    playerTurn++;
                }
                checkWinner();
            }
        }
    }

    /**
     * hitTM method - checks if game is over. If not, then checks is node for
     * cell is empty. If so, then allocates node in array to contain a shape,
     * and reveals shape on the board TM - Top Middle
     */
    @FXML
    private void hitTM() {
        if (!finished) {
            if (playerTurn < 9 && theBoard[0][1].equals(empty)) {
                if (playerTurn % 2 == 0 || playerTurn == 0) {
                    theBoard[0][1] = new Node(rect);
                    TMRect.setOpacity(1.0);
                    playerTurn++;

                } else {
                    theBoard[0][1] = new Node(circle);
                    TMCircle.setVisible(true);
                    playerTurn++;
                }
                checkWinner();
            }
        }
    }

    /**
     * hitTR method - checks if game is over. If not, then checks is node for
     * cell is empty. If so, then allocates node in array to contain a shape,
     * and reveals shape on the board TR - Top Right
     */
    @FXML
    private void hitTR() {
        if (!finished) {
            if (playerTurn < 9 && theBoard[0][2].equals(empty)) {
                if (playerTurn % 2 == 0 || playerTurn == 0) {
                    theBoard[0][2] = new Node(rect);
                    TRRect.setOpacity(1.0);
                    playerTurn++;

                } else {
                    theBoard[0][2] = new Node(circle);
                    TRCircle.setVisible(true);
                    playerTurn++;
                }
                checkWinner();
            }
        }
    }

    /**
     * hitML method - checks if game is over. If not, then checks is node for
     * cell is empty. If so, then allocates node in array to contain a shape,
     * and reveals shape on the board ML - Middle Left
     */
    @FXML
    private void hitML() {
        if (!finished) {
            if (playerTurn < 9 && theBoard[1][0].equals(empty)) {
                if (playerTurn % 2 == 0 || playerTurn == 0) {
                    theBoard[1][0] = new Node(rect);
                    MLRect.setOpacity(1.0);
                    playerTurn++;

                } else {
                    theBoard[1][0] = new Node(circle);
                    MLCircle.setVisible(true);
                    playerTurn++;
                }
                checkWinner();
            }
        }
    }

    /**
     * hitMM method - checks if game is over. If not, then checks is node for
     * cell is empty. If so, then allocates node in array to contain a shape,
     * and reveals shape on the board MM - Center of Board (Middle Middle)
     */
    @FXML
    private void hitMM() {
        if (!finished) {
            if (playerTurn < 9 && theBoard[1][1].equals(empty)) {
                if (playerTurn % 2 == 0 || playerTurn == 0) {
                    theBoard[1][1] = new Node(rect);
                    MMRect.setOpacity(1.0);
                    playerTurn++;

                } else {
                    theBoard[1][1] = new Node(circle);
                    MMCircle.setVisible(true);
                    playerTurn++;
                }
                checkWinner();
            }
        }
    }

    /**
     * hitMR method - checks if game is over. If not, then checks is node for
     * cell is empty. If so, then allocates node in array to contain a shape,
     * and reveals shape on the board MR - Middle Right
     */
    @FXML
    private void hitMR() {
        if (!finished) {
            if (playerTurn < 9 && theBoard[1][2].equals(empty)) {
                if (playerTurn % 2 == 0 || playerTurn == 0) {
                    theBoard[1][2] = new Node(rect);
                    MRRect.setOpacity(1.0);
                    playerTurn++;

                } else {
                    theBoard[1][2] = new Node(circle);
                    MRCircle.setVisible(true);
                    playerTurn++;
                }
                checkWinner();
            }
        }
    }

    /**
     * hitLL method - checks if game is over. If not, then checks is node for
     * cell is empty. If so, then allocates node in array to contain a shape,
     * and reveals shape on the board LL - Lower Left
     */
    @FXML
    private void hitLL() {
        if (!finished) {
            if (playerTurn < 9 && theBoard[2][0].equals(empty)) {
                if (playerTurn % 2 == 0 || playerTurn == 0) {
                    theBoard[2][0] = new Node(rect);
                    LLRect.setOpacity(1.0);
                    playerTurn++;

                } else {
                    theBoard[2][0] = new Node(circle);
                    LLCircle.setVisible(true);
                    playerTurn++;
                }
                checkWinner();
            }
        }
    }

    /**
     * hitLM method - checks if game is over. If not, then checks is node for
     * cell is empty. If so, then allocates node in array to contain a shape,
     * and reveals shape on the board LM - Lower Middle
     */
    @FXML
    private void hitLM() {
        if (!finished) {
            if (playerTurn < 9 && theBoard[2][1].equals(empty)) {
                if (playerTurn % 2 == 0 || playerTurn == 0) {
                    theBoard[2][1] = new Node(rect);
                    LMRect.setOpacity(1.0);
                    playerTurn++;

                } else {
                    theBoard[2][1] = new Node(circle);
                    LMCircle.setVisible(true);
                    playerTurn++;
                }
                checkWinner();
            }
        }
    }

    /**
     * hitLR method - checks if game is over. If not, then checks is node for
     * cell is empty. If so, then allocates node in array to contain a shape,
     * and reveals shape on the board LR - Lower Right
     */
    @FXML
    private void hitLR() {
        if (!finished) {
            if (playerTurn < 9 && theBoard[2][2].equals(empty)) {
                if (playerTurn % 2 == 0 || playerTurn == 0) {
                    theBoard[2][2] = new Node(rect);
                    LRRect.setOpacity(1.0);
                    playerTurn++;

                } else {
                    theBoard[2][2] = new Node(circle);
                    LRCircle.setVisible(true);
                    playerTurn++;
                }
                checkWinner();
            }
        }
    }

    /**
     * ends the game
     */
    @FXML
    private void close() {
        System.exit(0);
    }

    /**
     * newGame method - creates new array, sets all variables to prior values,
     * and resets all shapes on the board
     */
    @FXML
    private void newGame() {
        playerTurn = 0;
        for (int i = 0; i < 3; i++) {
            theBoard[i][0] = new Node(0);
            for (int j = 0; j < 3; j++) {
                theBoard[i][j] = new Node(0);
            }
        }
        empty = new Node(0);
        finished = false;
        //resets all rectangles
        TLRect.setOpacity(0);
        TMRect.setOpacity(0);
        TRRect.setOpacity(0);
        MLRect.setOpacity(0);
        MMRect.setOpacity(0);
        MRRect.setOpacity(0);
        LLRect.setOpacity(0);
        LMRect.setOpacity(0);
        LRRect.setOpacity(0);
        //resets all circles
        TLCircle.setVisible(false);
        TMCircle.setVisible(false);
        TRCircle.setVisible(false);
        MLCircle.setVisible(false);
        MMCircle.setVisible(false);
        MRCircle.setVisible(false);
        LLCircle.setVisible(false);
        LMCircle.setVisible(false);
        LRCircle.setVisible(false);
    }

    /**
     * rotateRectangle method - Takes three rectangle parameters and rotates
     * them all with a ParallelTransition instance
     *
     *
     * @param rectangle1
     * @param rectangle2
     * @param rectangle3
     */
    @FXML
    private void rotateRectangle(Rectangle rectangle1, Rectangle rectangle2, Rectangle rectangle3) {
        RotateTransition rotate1 = new RotateTransition(Duration.seconds(2), rectangle1);
        rotate1.setToAngle(180);
        rotate1.setAutoReverse(true);
        rotate1.setCycleCount(2);
        RotateTransition rotate2 = new RotateTransition(Duration.seconds(2), rectangle2);
        rotate2.setToAngle(180);
        rotate2.setAutoReverse(true);
        rotate2.setCycleCount(2);
        RotateTransition rotate3 = new RotateTransition(Duration.seconds(2), rectangle3);
        rotate3.setToAngle(180);
        rotate3.setAutoReverse(true);
        rotate3.setCycleCount(2);

        ParallelTransition rotateRectangles = new ParallelTransition(rotate1, rotate2, rotate3);
        rotateRectangles.play();
    }

    /**
     * fadeCircles method - Takes three circle parameters and makes them all
     * fade in and out with a ParallelTransition instance
     *
     * @param circle1
     * @param circle2
     * @param circle3
     */
    @FXML
    private void fadeCircles(Circle circle1, Circle circle2, Circle circle3) {
        FadeTransition fade1 = new FadeTransition(Duration.seconds(2), circle1);
        fade1.setFromValue(1.0);
        fade1.setToValue(0.0);
        fade1.setCycleCount(2);
        fade1.setAutoReverse(true);
        FadeTransition fade2 = new FadeTransition(Duration.seconds(2), circle2);
        fade2.setFromValue(1.0);
        fade2.setToValue(0.0);
        fade2.setCycleCount(2);
        fade2.setAutoReverse(true);
        FadeTransition fade3 = new FadeTransition(Duration.seconds(2), circle3);
        fade3.setFromValue(1.0);
        fade3.setToValue(0.0);
        fade3.setCycleCount(2);
        fade3.setAutoReverse(true);

        ParallelTransition fadeCircles = new ParallelTransition(fade1, fade2, fade3);
        fadeCircles.play();
    }

    /**
     * checkWinner method - checks all possible game endings and applies an
     * animation based on what ending the user reaches Will also set game to
     * finished to prevent moves made after a win
     */
    private void checkWinner() {
        //Checks if player one won a column based on array values
        if (theBoard[0][0].getShapeType() == rect && theBoard[1][0].getShapeType() == rect && theBoard[2][0].getShapeType() == rect) {

            rotateRectangle(TLRect, MLRect, LLRect);

            finished = true;
        } else if (theBoard[0][1].getShapeType() == rect && theBoard[1][1].getShapeType() == rect && theBoard[2][1].getShapeType() == rect) {

            rotateRectangle(TMRect, MMRect, LMRect);

            finished = true;
        } else if (theBoard[0][2].getShapeType() == rect && theBoard[1][2].getShapeType() == rect && theBoard[2][2].getShapeType() == rect) {

            rotateRectangle(TRRect, MRRect, LRRect);

            finished = true;
        } //checks if player one won a row based on array values
        else if (theBoard[0][0].getShapeType() == rect && theBoard[0][1].getShapeType() == rect && theBoard[0][2].getShapeType() == rect) {

            rotateRectangle(TLRect, TMRect, TRRect);

            finished = true;
        } else if (theBoard[1][0].getShapeType() == rect && theBoard[1][1].getShapeType() == rect && theBoard[1][2].getShapeType() == rect) {

            rotateRectangle(MLRect, MMRect, MRRect);

            finished = true;
        } else if (theBoard[2][0].getShapeType() == rect && theBoard[2][1].getShapeType() == rect && theBoard[2][2].getShapeType() == rect) {

            rotateRectangle(LLRect, LMRect, LRRect);

            finished = true;
        } //checks if player one won a diagonal
        else if (theBoard[0][0].getShapeType() == rect && theBoard[1][1].getShapeType() == rect && theBoard[2][2].getShapeType() == rect) {

            rotateRectangle(TLRect, MMRect, LRRect);

            finished = true;
        } else if (theBoard[0][2].getShapeType() == rect && theBoard[1][1].getShapeType() == rect && theBoard[2][0].getShapeType() == rect) {

            rotateRectangle(LLRect, MMRect, TRRect);

            finished = true;
        } //checks if player two won a column based on array values
        else if (theBoard[0][0].getShapeType() == circle && theBoard[1][0].getShapeType() == circle && theBoard[2][0].getShapeType() == circle) {

            fadeCircles(TLCircle, MLCircle, LLCircle);

            finished = true;
        } else if (theBoard[0][1].getShapeType() == circle && theBoard[1][1].getShapeType() == circle && theBoard[2][1].getShapeType() == circle) {

            fadeCircles(TMCircle, MMCircle, LMCircle);

            finished = true;
        } else if (theBoard[0][2].getShapeType() == circle && theBoard[1][2].getShapeType() == circle && theBoard[2][2].getShapeType() == circle) {

            fadeCircles(TRCircle, MRCircle, LRCircle);

            finished = true;
        } //checks if player two won a row based on array values
        else if (theBoard[0][0].getShapeType() == circle && theBoard[0][1].getShapeType() == circle && theBoard[0][2].getShapeType() == circle) {

            fadeCircles(TLCircle, TMCircle, TRCircle);

            finished = true;
        } else if (theBoard[1][0].getShapeType() == circle && theBoard[1][1].getShapeType() == circle && theBoard[1][2].getShapeType() == circle) {

            fadeCircles(MLCircle, MMCircle, MRCircle);

            finished = true;
        } else if (theBoard[2][0].getShapeType() == circle && theBoard[2][1].getShapeType() == circle && theBoard[2][2].getShapeType() == circle) {

            fadeCircles(LLCircle, LMCircle, LRCircle);

            finished = true;
        } //checks if player two won a diagonal
        else if (theBoard[0][0].getShapeType() == circle && theBoard[1][1].getShapeType() == circle && theBoard[2][2].getShapeType() == circle) {

            fadeCircles(TLCircle, MMCircle, LRCircle);

            finished = true;
        } else if (theBoard[0][2].getShapeType() == circle && theBoard[1][1].getShapeType() == circle && theBoard[2][0].getShapeType() == circle) {

            fadeCircles(LLCircle, MMCircle, TRCircle);

            finished = true;
        }

    }
}
