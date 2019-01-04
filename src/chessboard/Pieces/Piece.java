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
    
  public enum m_Color {WHITE, BLACK};
  
  public Piece(m_Color color){
      
  }
  
  public abstract String getPosition();
    
}
