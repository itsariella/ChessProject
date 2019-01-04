/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard;

import chessboard.Pieces.Piece;

/**
 *
 * @author Ariella
 */
public class ChessBoard {
    
    final int ROWS = 8;
    final int COLS = 8;
    
    final private Piece[][] gamePieces = new Piece[ROWS][COLS];
    final private Location[][] locations = new Location[ROWS][COLS];
    
    public ChessBoard()
    {
        
    }
    
    /*public Piece PieceLocation(int row, int col)
    {
    
    }*/
    
    public void addPiece(Piece piece)
    {
        
    }
    
    public void removePiece(int row, int col)
    {
    }
    
    public Location getLocation(int row, int col)
    {
        return locations[row][col];
    }
    
    public Piece getPiece(Location location)
    {
        int row = location.getRow();
        int col = location.getCol();
        
        return gamePieces[row][col];
    }
    
    
}
