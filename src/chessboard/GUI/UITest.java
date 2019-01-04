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

import chessboard.Location;
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
import java.awt.image.BufferedImage;
import javax.swing.Icon;


public class UITest extends JFrame{
    
    private final int ROWS = 8;
    private final int COLS = 8;
    private final JButton[][] chessTiles = new JButton[ROWS][COLS];
    private boolean tileSelected = false;
    private ImageIcon selectedTile;
    private ImageIcon destinationTile;
    
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
                //set a button for each tile
                JButton b1 = new JButton();
                add(b1);
                
                //set a location for each tile
                Location tileLocation = new Location(i,j);
                int xLocation = tileLocation.getCol();
                int yLocation = tileLocation.getRow();
                
                //add transparent img to each tile
                ImageIcon icon = new ImageIcon(new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
                b1.setIcon(icon);
                
                
                //set tile color
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
                
                b1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        System.out.println("x:" + xLocation + " y: " + yLocation);
                        tileSelected = !tileSelected;
                        System.out.println(tileSelected);
                        
                        if(tileSelected)
                        {
                            ImageIcon icon = new ImageIcon(new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
                            b1.setIcon(icon);
                             
                        }
                        if(!tileSelected)
                        {
                            
                        }
                    }
                
                });
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

        ImageIcon blackPawn = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/blackPawn.png");
        ImageIcon blackRook = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/blackRook.png");
        ImageIcon blackKnight = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/blackKnight.png");
        ImageIcon blackBishop = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/blackBishop.png");
        ImageIcon blackQueen = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/blackQueen.png");
        ImageIcon blackKing = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/blackKing.png");
        ImageIcon whitePawn = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/whitePawn.png");
        ImageIcon whiteRook = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/whiteRook.png");
        ImageIcon whiteKnight = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/whiteKnight.png");
        ImageIcon whiteBishop = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/whiteBishop.png");
        ImageIcon whiteQueen = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/whiteQueen.png");
        ImageIcon whiteKing = new ImageIcon("C://Users/Ariella/Documents/NetBeansProjects/ChessBoard/src/chessboard/PieceImages/whiteKing.png");
        
        

        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLS; j++)
            {
                chessTiles[1][j].setIcon(blackPawn);
                chessTiles[6][j].setIcon(whitePawn);
            }
        }


        chessTiles[0][0].setIcon(blackRook);
        //chessTiles[0][0].Type.ROOK;
        chessTiles[7][0].setIcon(whiteRook);
        
        chessTiles[0][1].setIcon(blackKnight);
        chessTiles[7][1].setIcon(whiteKnight);
        
        chessTiles[0][2].setIcon(blackBishop);
        chessTiles[7][2].setIcon(whiteBishop);
        
        chessTiles[0][3].setIcon(blackQueen);
        chessTiles[7][3].setIcon(whiteQueen);
        
        chessTiles[0][4].setIcon(blackKing);
        chessTiles[7][4].setIcon(whiteKing);
        
        chessTiles[0][5].setIcon(blackBishop);
        chessTiles[7][5].setIcon(whiteBishop);
        
        chessTiles[0][6].setIcon(blackKnight);
        chessTiles[7][6].setIcon(whiteKnight);
        
        chessTiles[0][7].setIcon(blackRook);
        chessTiles[7][7].setIcon(whiteRook);
    }
    
    
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            UITest ex = new UITest();
            ex.setVisible(true);
        });
    }
}
