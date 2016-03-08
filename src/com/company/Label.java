package com.company;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Created by skaggsc2 on 3/4/16.
 */
public class Label extends JPanel {
    static JFrame frame = new JFrame("Deadwood Studios");
    static JLabel label;
    static JLabel labelTrailer;
    static JLabel labelSaloon;
    static JLabel labelMS;
    static JLabel labelHotel;
    static JLabel labelBank;

    public Label(String diagram){
        super(new GridLayout(1,1));

        try {

            BufferedImage myPicture = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard.jpg"));
            ImageIcon pic = new ImageIcon(myPicture);
            label = new JLabel(pic, JLabel.CENTER);

            BufferedImage myPictureTrailer = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoardTrailer.jpg"));

            ImageIcon picTrailer = new ImageIcon(myPictureTrailer);
            labelTrailer = new JLabel(picTrailer, JLabel.CENTER);

            BufferedImage myPictureSaloon = ImageIO.read(new File("/home/skaggsc2/Documents/CS345/hw2/Gameboards/gameBoard3-0.jpg"));
            ImageIcon picSaloon = new ImageIcon(myPictureSaloon);
            labelSaloon = new JLabel(picSaloon, JLabel.CENTER);


            BufferedImage myPictureMS = ImageIO.read(new File("/home/skaggsc2/Documents/CS345/hw2/Gameboards/gameBoard2-0.jpg"));
            ImageIcon picMS = new ImageIcon(myPictureMS);
            labelMS = new JLabel(picMS, JLabel.CENTER);


            BufferedImage myPictureHotel = ImageIO.read(new File("/home/skaggsc2/Documents/CS345/hw2/Gameboards/gameBoard6-0.jpg"));
            ImageIcon picHotel = new ImageIcon(myPictureHotel);
            labelHotel = new JLabel(picHotel, JLabel.CENTER);

            BufferedImage myPictureBank = ImageIO.read(new File("/home/skaggsc2/Documents/CS345/hw2/Gameboards/gameBoard4-0.jpg"));
            ImageIcon picBank = new ImageIcon(myPictureBank);
            labelBank = new JLabel(picBank, JLabel.CENTER);


        }
        catch (IOException ex){
            System.out.println("No Image");
        }
        if(diagram.equals("Trailer")){
            removeAll();
            add(labelTrailer);
        }
        if(diagram.equals("start")){
            removeAll();
            add(label);
        }
        if(diagram.equals("Saloon")){
            removeAll();
            add(labelSaloon);
        }
        if(diagram.equals("Hotel")){
            removeAll();
            add(labelHotel);
        }
        if(diagram.equals("Main Street")){
            removeAll();
            add(labelMS);
        }
    }
    
    public static void createAndShowGUI(String diagram) {
        //Create and set up the window.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new Label(diagram));
        //JOptionPane.showMessageDialog(frame,"Welcome to DeadWood!");

        //Display the window.
        frame.pack();
        //frame.setSize(1000,1000);
        frame.setVisible(true);

    }

    public static void  closeWindow(){
        frame.dispose();
    }

}
