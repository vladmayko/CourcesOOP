package com.gmail.hometask;

import java.util.Arrays;

public class Board {
    private Shape[] board = new Shape[4];

    public Board() {
    }

    public Board(Shape[] board) {
        this.board = board;
    }

    public Shape[] getShapes() {
        return board;
    }

    public void setShapes(Shape[] board) {
        this.board = board;
    }

    public double areaOfShapesOnBoard() {
        double globalArea = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                globalArea += board[i].getArea();
            }
        }
        return Math.round(globalArea * 100) / 100.0d;
    }

    public void addShapeToBoard(Shape shape) {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == null) {
                board[i] = shape;
                return;
            }
        }
    }

    public void delShapeFromPartOfBoard(int part){
        if(board[part - 1] != null){
            board[part - 1] = null;
        }
    }

    public String infoAboutShapesOnBoard(){
        StringBuffer info = new StringBuffer("");
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if(board[i] != null){
                count++;
                info.append(", on part number '" + (i + 1) + "' of the board there is shape - " + board[i].toString());
            }
        }
        return "At now on the board " + count + " shapes" + info.toString();
    }

    @Override
    public String toString() {
        return "Board{" +
                "shapes=" + Arrays.toString(board) +
                '}';
    }
}

