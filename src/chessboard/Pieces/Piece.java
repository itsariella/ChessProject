/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard.Pieces;

/**
 *
 * @author Ariella
 */
public abstract class Piece {
    
  public enum Color {WHITE, BLACK};
  public enum Type {PAWN, ROOK, KNIGHT, BISHOP,QUEEN,KING}
  
  public Piece(Color color, Type type){
      
  }
  
  public abstract void movePiece(int xCoord, int yCoord);;
  
}
