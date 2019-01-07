/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard;

import chessboard.Pieces.Pawn;
import chessboard.Pieces.Piece;
import static chessboard.Pieces.Piece.Type.PAWN;

/**
 *
 * @author Ariella
 */
public class ChessBoard {
    
    final int ROWS = 8;
    final int COLS = 8;
    
    int count = 0;
    
    
    final private Piece[][] gamePieces = new Piece[ROWS][COLS];
    final private Location[][] locations = new Location[ROWS][COLS];
    
    public ChessBoard()
    {
        Player whitePlayer = new Player();
        Player blackPlayer = new Player();
                
        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLS; j++)
            {
                gamePieces[1][j] = new Pawn(chessboard.Pieces.Pawn.Color.BLACK, PAWN);
                gamePieces[6][j] = new Pawn(chessboard.Pieces.Pawn.Color.WHITE, PAWN);
                
                locations[0][j] = new Location(i,j, true);
                locations[1][j] = new Location(i,j, true);
                locations[2][j] = new Location(i,j, false);
                locations[3][j] = new Location(i,j, false);
                locations[4][j] = new Location(i,j, false);
                locations[5][j] = new Location(i,j, false);
                locations[6][j] = new Location(i,j, true);
                locations[7][j] = new Location(i,j, true);
                
                
            }
        }
        
        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLS; j++)
            {
                if(locations[i][j].getStatus() == true)
                {
                    System.out.print(" "+ i + " " + j + " occupied" );
                    count++;
                    
                    if (count % COLS == 0)
                    {
                        System.out.println(" ");
                    }
                }
                else
                {
                    System.out.print(" " + i + " " + j + " empty   ");
                    count++;
                    if (count % COLS == 0)
                    {
                        System.out.println(" ");
                    }
                }
                }
            }
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
    
    public void movePiece(Location source, Location destination)
    { 
       // Location of piece.location.getX
       // Location of piece.location.getY
       
    }
   
    
    
}
