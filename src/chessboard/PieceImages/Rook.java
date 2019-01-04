/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessboard.PieceImages;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Ariella
 */
public class Rook extends JPanel{
     // variables
    private Image m_rook;
    
    //constructor
    public Rook() 
    {
        initRook();
    }
    
    private void initRook() 
    {
        loadImage(); //call function to load image
        int w = m_rook.getWidth(this); // get width of img
        int h = m_rook.getHeight(this); // get height of img
        setPreferredSize(new Dimension(w,h));
    }
    
    private void loadImage() 
    {
        //load image from file
        ImageIcon ii = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/Rook.jpg"); 
        m_rook = ii.getImage(); //set value to member variable
        
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        g.drawImage(m_rook, 0, 0, null);
    }
    
}


