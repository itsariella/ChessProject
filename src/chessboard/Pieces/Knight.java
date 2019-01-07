/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard.Pieces;

import chessboard.Location;

/**
 *
 * @author Ariella
 */
public class Knight extends Piece{
    
    private final Color pieceColor;

   
    public enum Color {WHITE, BLACK};
    
    public Knight(Color color,Type type)
    {
        super(type);
        pieceColor = color;
    }
    
    @Override
   public void movePiece(Location source, Location destination)
    {
        if(pieceColor == Color.WHITE)
        {
            System.out.println("Color white knight");
        }
        else if(pieceColor == Color.BLACK)
        {
            System.out.println("Color black knight");
        }
       
       
    }
   
    @Override
   public void checkPath(Location source, Location destination)
   {
       
   }

}

