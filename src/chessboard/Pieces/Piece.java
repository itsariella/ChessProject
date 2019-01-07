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
public abstract class Piece {
    
  //public enum Color {WHITE, BLACK};
  public enum Type {PAWN, ROOK, KNIGHT, BISHOP,QUEEN,KING}
  
  public Piece(Type type){
      
  }
  
  public abstract void movePiece(Location source, Location destination);
  
  public abstract void checkPath(Location source, Location destination);
  
}
