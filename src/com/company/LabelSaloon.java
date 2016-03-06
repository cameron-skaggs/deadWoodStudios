package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by skaggsc2 on 3/4/16.
 */
public class LabelSaloon extends JPanel {

    public LabelSaloon(){
        super(new GridLayout(1,1));
        JLabel label;
        try {
            // JFrame frame = new JFrame();

            BufferedImage myPicture = ImageIO.read(new File("/home/skaggsc2/Documents/CS345/hw2/Gameboards/gameBoard2-0.jpg"));
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
        JFrame frame = new JFrame("LabelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Add content to the window.
        frame.add(new LabelStreet());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

}