/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laura
 */


import javax.swing.*;
import java.awt.*;

public class MemoryGameBoard extends JFrame {
 
    JLabel statusbar;
    
    private ButtonListener buttonListener; //((napinpainallusten kontrolloija))
    private MemoryGamePanel gui;
    
    public static final int NUMBER_OF_CARDS = 16;
    
    public MemoryGameBoard () {
    
        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        add(board);
        board.start();
        
        
    }
    
    
}    
    