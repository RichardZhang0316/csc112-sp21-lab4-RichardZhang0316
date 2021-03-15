import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

import java.util.ArrayList;


public class Main {

    private static ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

    public static void main(String[] args) {




        readInput();

        DisplayTaxResult();

        return;

    }

    // simple method to display output in a TextArea in a JPanel in a JFrame
    // (should not need to be modified)
    //
    // David John
    // March 2021

    public static void DisplayTaxResult(){

        final String DASH = "-";

        // create the JTextArea and fill it with content
        JTextArea theText = new JTextArea(inventory.size()+2,25); //create the text area
        theText.setFont(new Font("monospaced", Font.BOLD, 20));
        theText.setForeground(Color.GREEN);
        theText.setBackground(Color.LIGHT_GRAY);

        // add specific text about inventory to JTextArea
        theText.append(String.format("%-12s%-10s%10s%n","V. type","V. tag","Tax Due"));
        theText.append(String.format("%32s%n%n",DASH.repeat(32)));
        for(Vehicle myV : inventory)
        {
            theText.append(String.format("%-12s%-10s%,10.2f%n",
                    myV.getType(),myV.getTag(), myV.getTax()));
        }

        // create the JPanel and add the JTextArea to it
        JPanel mainPanel = new JPanel();
        mainPanel.add(theText); //add the text area to the panel

        // set up JFrame with a few members set and
        // add JPanel content to it
        final JFrame theFrame = new JFrame();
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setTitle("Vehicle Taxes Due\n");
        theFrame.setSize(500, 500);
        theFrame.setLocation(550, 400);
        theFrame.getContentPane().add(mainPanel);
        theFrame.pack();
        theFrame.setVisible(true);

    }

    // **************************

    // open  csv formatted file and read input;
    // all correct input data is placed into inventory;
    // reject any improperly formatted line with an
    // error message

    private static void readInput() {


    }
}
