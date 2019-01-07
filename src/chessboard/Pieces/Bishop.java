/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard.Pieces;

import chessboard.Location;
import chessboard.Pieces.Piece.Type;

/**
 *
 * @author Ariella
 */
public class Bishop extends Piece{

    private final Color pieceColor;

   
    public enum Color {WHITE, BLACK};
    
    public Bishop(Color color,Type type)
    {
        super(type);
        pieceColor = color;
    }
    
   public void movePiece(Location source, Location destination)
    {
        if(pieceColor == Color.WHITE)
        {
            System.out.println("Color white bishop");
        }
        else if(pieceColor == Color.BLACK)
        {
            System.out.println("Color black bishop");
        }
       
       
    }
   
   public void checkPath(Location source, Location destination)
   {
       
   }

}
    
