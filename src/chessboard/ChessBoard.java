/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard;

import chessboard.Pieces.Bishop;
import chessboard.Pieces.King;
import chessboard.Pieces.Knight;
import chessboard.Pieces.Pawn;
import chessboard.Pieces.Piece;
import static chessboard.Pieces.Piece.Type.BISHOP;
import static chessboard.Pieces.Piece.Type.KING;
import static chessboard.Pieces.Piece.Type.KNIGHT;
import static chessboard.Pieces.Piece.Type.PAWN;
import static chessboard.Pieces.Piece.Type.QUEEN;
import static chessboard.Pieces.Piece.Type.ROOK;
import chessboard.Pieces.Queen;
import chessboard.Pieces.Rook;

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
        
        gamePieces[0][0] = new Rook(chessboard.Pieces.Rook.Color.BLACK, ROOK);
        gamePieces[7][0] = new Rook(chessboard.Pieces.Rook.Color.WHITE, ROOK);
        
        gamePieces[0][1] = new Knight(chessboard.Pieces.Knight.Color.BLACK, KNIGHT);
        gamePieces[7][1] = new Knight(chessboard.Pieces.Knight.Color.WHITE, KNIGHT);
        
        gamePieces[0][2] = new Bishop(chessboard.Pieces.Bishop.Color.BLACK,BISHOP);
        gamePieces[7][2] = new Bishop(chessboard.Pieces.Bishop.Color.WHITE,BISHOP);
        
        gamePieces[0][3] = new Queen(chessboard.Pieces.Queen.Color.BLACK, QUEEN);
        gamePieces[7][3] = new Queen(chessboard.Pieces.Queen.Color.WHITE, QUEEN);

        gamePieces[0][4] = new King(chessboard.Pieces.King.Color.BLACK, KING);
        gamePieces[7][4] = new King(chessboard.Pieces.King.Color.WHITE, KING);

        gamePieces[0][5] = new Bishop(chessboard.Pieces.Bishop.Color.BLACK, BISHOP);
        gamePieces[7][5] = new Bishop(chessboard.Pieces.Bishop.Color.WHITE, BISHOP);
        
        gamePieces[0][6] = new Knight(chessboard.Pieces.Knight.Color.BLACK, KNIGHT);
        gamePieces[7][6] = new Knight(chessboard.Pieces.Knight.Color.WHITE, KNIGHT);
        
        gamePieces[0][7] = new Rook(chessboard.Pieces.Rook.Color.BLACK, ROOK);
        gamePieces[7][7] = new Rook(chessboard.Pieces.Rook.Color.WHITE, ROOK);
        
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
