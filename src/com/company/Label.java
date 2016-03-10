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
    static JLabel labelTrailerA;
    static JLabel labelSaloonA;
    static JLabel labelMSA;
    static JLabel labelHotelA;
    static JLabel labelBankA;
    static JLabel labelChurch;
    static JLabel labelChurchA;
    static JLabel labelRanch;
    static JLabel labelRanchA;
    static JLabel labelSH;
    static JLabel labelSHA;
    static JLabel labelCO;
    static JLabel labelCOA;
    static JLabel labelGS;
    static JLabel labelGSA;
    static JLabel labelTS;
    static JLabel labelTSA;
    static JLabel labelJail;
    static JLabel labelJailA;
    static JLabel labelact;

    public Label(String diagram){
        super(new GridLayout(1,1));

        try {

            BufferedImage myPicture = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard.jpg"));
            ImageIcon pic = new ImageIcon(myPicture);
            label = new JLabel(pic, JLabel.CENTER);


            BufferedImage myPictureTrailer = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoardTrailer.jpg"));
            ImageIcon picTrailer = new ImageIcon(myPictureTrailer);
            labelTrailer = new JLabel(picTrailer, JLabel.CENTER);

            BufferedImage myPicture11 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard1-1.jpg"));
            ImageIcon pic11 = new ImageIcon(myPicture11);
            labelTrailerA = new JLabel(pic11, JLabel.CENTER);

            BufferedImage myPictureSaloon = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard3-0.jpg"));
            ImageIcon picSaloon = new ImageIcon(myPictureSaloon);
            labelSaloon = new JLabel(picSaloon, JLabel.CENTER);

            BufferedImage myPictureMS = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard2-0.jpg"));
            ImageIcon picMS = new ImageIcon(myPictureMS);
            labelMS = new JLabel(picMS, JLabel.CENTER);

            BufferedImage myPictureHotel = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard6-0.jpg"));
            ImageIcon picHotel = new ImageIcon(myPictureHotel);
            labelHotel = new JLabel(picHotel, JLabel.CENTER);

            BufferedImage myPictureBank = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard4-0.jpg"));
            ImageIcon picBank = new ImageIcon(myPictureBank);
            labelBank = new JLabel(picBank, JLabel.CENTER);


            BufferedImage myPicture31 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard3-1.jpg"));
            ImageIcon pic31 = new ImageIcon(myPicture31);
            labelSaloonA = new JLabel(pic31, JLabel.CENTER);

            BufferedImage myPicture21 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard2-1.jpg"));
            ImageIcon pic21 = new ImageIcon(myPicture21);
            labelMSA = new JLabel(pic21, JLabel.CENTER);

            BufferedImage myPicture61 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard6-1.jpg"));
            ImageIcon pic61 = new ImageIcon(myPicture61);
            labelHotelA = new JLabel(pic61, JLabel.CENTER);

            BufferedImage myPicture41 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard4-1.jpg"));
            ImageIcon pic41 = new ImageIcon(myPicture41);
            labelBankA = new JLabel(pic41, JLabel.CENTER);

            BufferedImage myPicture50 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard5-0.jpg"));
            ImageIcon pic50 = new ImageIcon(myPicture50);
            labelChurch = new JLabel(pic50, JLabel.CENTER);

            BufferedImage myPicture51 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard5-1.jpg"));
            ImageIcon pic51 = new ImageIcon(myPicture51);
            labelChurchA = new JLabel(pic51, JLabel.CENTER);

            BufferedImage myPicture70 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard7-0.jpg"));
            ImageIcon pic70 = new ImageIcon(myPicture70);
            labelRanch = new JLabel(pic70, JLabel.CENTER);

            BufferedImage myPicture71 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard7-1.jpg"));
            ImageIcon pic71 = new ImageIcon(myPicture71);
            labelRanchA = new JLabel(pic71, JLabel.CENTER);

            BufferedImage myPicture80 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard8-0.jpg"));
            ImageIcon pic80 = new ImageIcon(myPicture80);
            labelSH = new JLabel(pic80, JLabel.CENTER);

            BufferedImage myPicture81 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard8-1.jpg"));
            ImageIcon pic81 = new ImageIcon(myPicture81);
            labelSHA = new JLabel(pic81, JLabel.CENTER);

            BufferedImage myPicture90 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard9-0.jpg"));
            ImageIcon pic90 = new ImageIcon(myPicture90);
            labelCO = new JLabel(pic90, JLabel.CENTER);

            BufferedImage myPicture91 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard9-1.jpg"));
            ImageIcon pic91 = new ImageIcon(myPicture91);
            labelCOA = new JLabel(pic91, JLabel.CENTER);

            BufferedImage myPicture100 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard10-0.jpg"));
            ImageIcon pic100 = new ImageIcon(myPicture100);
            labelGS = new JLabel(pic100, JLabel.CENTER);

            BufferedImage myPicture101 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard10-1.jpg"));
            ImageIcon pic101 = new ImageIcon(myPicture101);
            labelGSA = new JLabel(pic101, JLabel.CENTER);

            BufferedImage myPicture110 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard11-0.jpg"));
            ImageIcon pic110 = new ImageIcon(myPicture110);
            labelTS = new JLabel(pic110, JLabel.CENTER);

            BufferedImage myPicture111 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard11-1.jpg"));
            ImageIcon pic111 = new ImageIcon(myPicture111);
            labelTSA = new JLabel(pic111, JLabel.CENTER);

            BufferedImage myPicture120 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard12-0.jpg"));
            ImageIcon pic120 = new ImageIcon(myPicture120);
            labelJail = new JLabel(pic120, JLabel.CENTER);

            BufferedImage myPicture121 = ImageIO.read(new URL("https://raw.githubusercontent.com/skaggs1995/deadWoodStudios/master/Gameboards/gameBoard12-1.jpg"));
            ImageIcon pic121 = new ImageIcon(myPicture121);
            labelJailA = new JLabel(pic121, JLabel.CENTER);

            BufferedImage myPictureact = ImageIO.read(new URL("http://www.kirklandtownlibrary.org/wp-content/uploads/2013/04/be-dramatic-and-keep-acting-1.png"));
            ImageIcon picact = new ImageIcon(myPictureact);
            labelact = new JLabel(picact, JLabel.CENTER);

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
        if(diagram.equals("MainStreet")){
            removeAll();
            add(labelMS);
        }
        if(diagram.equals("Bank")){
            removeAll();
            add(labelBank);
        }
        if(diagram.equals("Church")){
            removeAll();
            add(labelChurch);
        }
        if(diagram.equals("Ranch")){
            removeAll();
            add(labelRanch);
        }
        if(diagram.equals("Secret Hideout")){
            removeAll();
            add(labelSH);
        }
        if(diagram.equals("Casting Office")){
            removeAll();
            add(labelCO);
        }
        if(diagram.equals("General Store")){
            removeAll();
            add(labelGS);
        }
        if(diagram.equals("Train Station")){
            removeAll();
            add(labelTS);
        }
        if(diagram.equals("Jail")){
            removeAll();
            add(labelJail);
        }
        //I just Added an A to the end of everypicture with arrows
        if(diagram.equals("TrailerA")){
            removeAll();
            add(labelTrailerA);
        }
        if(diagram.equals("SaloonA")){
            removeAll();
            add(labelSaloonA);
        }
        if(diagram.equals("HotelA")){
            removeAll();
            add(labelHotelA);
        }
        if(diagram.equals("Main StreetA")){
            removeAll();
            add(labelMSA);
        }
        if(diagram.equals("BankA")){
            removeAll();
            add(labelBankA);
        }
        if(diagram.equals("ChurchA")){
            removeAll();
            add(labelChurchA);
        }
        if(diagram.equals("HotelA")){
            removeAll();
            add(labelHotelA);
        }
        if(diagram.equals("RanchA")){
            removeAll();
            add(labelRanchA);
        }
        if(diagram.equals("Secret HideoutA")){
            removeAll();
            add(labelSHA);
        }
        if(diagram.equals("Casting OfficeA")){
            removeAll();
            add(labelCOA);
        }
        if(diagram.equals("General StoreA")){
            removeAll();
            add(labelGSA);
        }
        if(diagram.equals("Train StationA")){
            removeAll();
            add(labelTSA);
        }
        if(diagram.equals("JailA")){
            removeAll();
            add(labelJailA);
        }
        if(diagram.equals("act")){
            removeAll();
            add(labelact);
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