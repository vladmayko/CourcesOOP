package com.gmail.hometask;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(0, 0), new Point(0, 5), new Point(5, 5), new Point(5, 0));
        System.out.println(square);

        Circle circle = new Circle(new Point(0, 0), new Point(0, 4));
        System.out.println(circle);

        Triangle triangle = new Triangle(new Point(0, 0), new Point(2, 4), new Point(5, 1));
        System.out.println(triangle + System.lineSeparator());

        Board board = new Board();

        System.out.println(board);
        System.out.println("Area of all shapes on board = " + board.areaOfShapesOnBoard());

        board.addShapeToBoard(circle);
        System.out.println(board);
        System.out.println("Area of all shapes on board = " + board.areaOfShapesOnBoard());

        board.addShapeToBoard(triangle);
        System.out.println(board);
        System.out.println("Area of all shapes on board = " + board.areaOfShapesOnBoard());

        board.addShapeToBoard(square);
        System.out.println(board);
        System.out.println("Area of all shapes on board = " + board.areaOfShapesOnBoard());

        board.addShapeToBoard(circle);
        System.out.println(board);
        System.out.println("Area of all shapes on board = " + board.areaOfShapesOnBoard());


        board.delShapeFromPartOfBoard(3);
        System.out.println(board);
        System.out.println("Area of all shapes on board = ");
        System.out.println(board.infoAboutShapesOnBoard());

        board.addShapeToBoard(triangle);
        System.out.println(board);
        System.out.println("Area of all shapes on board = " + board.areaOfShapesOnBoard());

       System.out.println(board.infoAboutShapesOnBoard());
    }
}
