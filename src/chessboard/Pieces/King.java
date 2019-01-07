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
public class King extends Piece {
    
    private final Color pieceColor;

   
    public enum Color {WHITE, BLACK};
    
    public King(Color color,Type type)
    {
        super(type);
        pieceColor = color;
    }
    
    @Override
   public void movePiece(Location source, Location destination)
    {
        if(pieceColor == Color.WHITE)
        {
            System.out.println("Color white king");
        }
        else if(pieceColor == Color.BLACK)
        {
            System.out.println("Color black king");
        }
       
       
    }
   
    @Override
   public void checkPath(Location source, Location destination)
   {
       
   }

}

