package com.company;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Created by skaggsc2 on 3/4/16.
 */
public class Label extends JPanel {
    static JFrame frame = new JFrame("LabelDemo");

    public Label(){
        super(new GridLayout(1,1));
        JLabel label;
        try {
           // JFrame frame = new JFrame();

            BufferedImage myPicture = ImageIO.read(new File("/home/skaggsc2/Documents/CS345/hw2/Gameboards/gameBoard.jpg"));
            ImageIcon pic = new ImageIcon(myPicture);
            label = new JLabel(pic, JLabel.CENTER);
            add(label);
        }
        catch (IOException ex){
            System.out.println("No Image");
        }


    }
    public static void createAndShowGUI() {
        //Create and set up the window.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new Label());

        //Display the window.
        frame.pack();
        frame.setVisible(true);

    }
    public static void  closeWindow(){
        JFrame frame = new JFrame("LabelDemo");
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
}
