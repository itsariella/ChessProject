/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard;

/**
 *
 * @author Ariella
 */
public class Location {
    private int m_row;
    private int m_col;
    private boolean tileOccupied;
    
    public Location(int row, int col, boolean occupied)
    {
        m_row = row;
        m_col = col;
        tileOccupied = occupied;
    }
    
    public Location(Location source)
    {
        m_row = source.m_row;
        m_col = source.m_col;
        tileOccupied = source.tileOccupied;
    }
    
    public int getCol()
    {
        return m_col;
    }
    
    public int getRow()
    {
        return m_row;
    }
    
    public boolean getStatus()
    {
        return tileOccupied;
    }
    
    public boolean isOccupied(boolean TF)
    {
        tileOccupied = TF;
        return tileOccupied;
    }
}
