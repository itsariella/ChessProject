package chessboard.GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariella
 */

import chessboard.PieceImages.Rook;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.TransferHandler;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class UITest extends JFrame{
    
    private final int ROWS = 8;
    private final int COLS = 8;
    private final JButton[][] chessTiles = new JButton[ROWS][COLS];
    //private int rook = 0, knight = 1, bishop = 3, queen = 4, king = 5;
    
    //constructor
    public UITest(){
        initUI();
    }
    
    //create new chessboard GUI
    private void initUI() 
    {
       
        setLayout(new GridLayout(ROWS,COLS));
        setBackground(Color.WHITE);  
      
        //Make Black and White Tiles
        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLS; j++)
            {
                JButton b1 = new JButton();
                add(b1);
                
                if(i % 2 == 0 && j % 2 == 0)
                {
                    b1.setBackground(Color.BLACK);
                }
                else if(i % 2 == 1 && j % 2 == 1)
                {
                    b1.setBackground(Color.BLACK);
                }
                else
                {
                    b1.setBackground(Color.WHITE);
                }
                chessTiles[i][j] = b1; // add buttons with color to the array
            }
        }
        //pack(); sets size according to the size of its components
        
        //set minimum size of chess board
        setMinimumSize(new Dimension(800,800));
        
        setTitle("New Game");
        setCursor(new Cursor(Cursor.HAND_CURSOR));//set cursor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close program when window is closed
        setLocationRelativeTo(null); //center GUI on the screen

        resetBoard();
          
    }
    
    private void resetBoard() 
    {
        Rook test;
        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLS; j++)
            {
                chessTiles[1][j].setLabel("Pawn");
                chessTiles[6][j].setLabel("Pawn");
            }
        }
        
        chessTiles[0][0].setLabel("Rook");
        chessTiles[7][0].setLabel("Rook");
        
        chessTiles[0][1].setLabel("Knight");
        chessTiles[7][1].setLabel("Knight");
        
        chessTiles[0][2].setLabel("Bishop");
        chessTiles[7][2].setLabel("Bishop");
        
        chessTiles[0][3].setLabel("Queen");
        chessTiles[7][3].setLabel("Queen");
        
        chessTiles[0][4].setLabel("King");
        chessTiles[7][4].setLabel("King");
        
        chessTiles[0][5].setLabel("Bishop");
        chessTiles[7][5].setLabel("Bishop");
        
        chessTiles[0][6].setLabel("Knight");
        chessTiles[7][6].setLabel("Knight");
        
        chessTiles[0][7].setLabel("Rook");
        chessTiles[7][7].setLabel("Rook");
    }
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            UITest ex = new UITest();
            ex.setVisible(true);
        });
    }
}
