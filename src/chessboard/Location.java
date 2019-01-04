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
    
    public Location(int row, int col)
    {
        m_row = row;
        m_col = col;
    }
    
    public Location(Location source)
    {
        m_row = source.m_row;
        m_col = source.m_col;
    }
    
    public int getCol()
    {
        return m_col;
    }
    
    public int getRow()
    {
        return m_row;
    }
}
