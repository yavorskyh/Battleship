import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.lang.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Board extends JFrame{

  //private static JButton[] cells = new JButton[100]; 	//cells for grid in GUI
   JButton cells[][] = new JButton[10][10];

  public void createWindow()
  {

    // create frame for BattleshipPanel (sourced from notes' examples)
     JFrame frame = new JFrame( "Battleship" );
     frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

     //creates panel
     BattleshipPanel panel = new BattleshipPanel();

    panel.setBackground(new Color(131, 209, 232));

    // grid of 10 rows, 10 columns, buttons in each grid spot
    panel.setLayout(new GridLayout(10, 10));

    //create each button on the grid:
    for(int i = 0; i < 10; i++)
    {
      for(int j = 0; j < 10; j++)
      {
        cells[i][j] = new JButton();
        cells[i][j].addActionListener(new Pressed(i,j));
        panel.add(cells[i][j]);
      }
    }
     frame.add(panel); //add panel to frame
     frame.setSize(500, 500); //default frame size
     frame.setVisible(true);

}//end of create window

 public void nextWindow(){
  // create frame for BattleshipPanel (sourced from notes' examples)
   JFrame frame = new JFrame( "Battleship" );
   frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   //creates panel
   BattleshipPanel panel = new BattleshipPanel();

   panel.setBackground(Color.BLACK);
    JButton next = new JButton("Next Player, Are you ready?");
    next.setBackground(Color.WHITE);
    next.setOpaque(true);


   frame.add(panel); //add panel to frame
   frame.setSize(500, 500); //default frame size
   frame.setVisible(true);
}



public class Pressed implements ActionListener
{
    int row;
    int column;

    public Pressed(int r, int c)
    {
        row = r;
        column = c;
    }

    public void actionPerformed(ActionEvent evt)
    {
        cells[row][column].setBackground(Color.RED);
        cells[row][column].setOpaque(true);
    }
}//end of pressed

class BattleshipPanel extends JPanel
   {

     public void paintComponent(Graphics g)
     {
         super.paintComponent(g);  //call superclass' paintComponent
         Graphics2D g2d = ( Graphics2D ) g; // cast g to Graphics2D

     }

   }//end of panel

}//end of board
