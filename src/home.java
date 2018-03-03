import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import system.calculation;

public class home extends JFrame {

    public home() {

        setTitle("WELCOME TO BLUEOCEAN");
        setSize(900, 600);
        
        // Create JButton and JPanel
        JButton button = new JButton("ROOM PRICE");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("<html><h1>WELCOME TO BLUEOCEAN HOTEL</h1>"
        		+ "<br>"
        		+ "The Blueocean hotel is one of the internationally rated hotels and The hotel is located in Southeast Asia Malaysia."
        		+ "</html>");
        
        JPanel panel2 = new JPanel();
        JPanel jp = new JPanel();
        JLabel jl = new JLabel();
        
        jl.setIcon(new ImageIcon("C:\\Users\\IZZ\\eclipse-workspace\\HOTEL BLUEOCEAN\\hop.jpg"));
        jp.add(jl);
        add(jp);

        
        // Add button to JPanel
        panel.add(button);
        panel2.add(label);
        
        
        // And JPanel needs to be added to the JFrame itself!
        this.getContentPane().add(panel,BorderLayout.LINE_END);
        this.getContentPane().add(panel2,BorderLayout.PAGE_START);
        this.getContentPane().add(jp,BorderLayout.CENTER);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "                    [ROOM LIST] \n"
                		+ "SUITE DELUXE ROOM      RM300/per night \n"
                		+ "SUITE ROOM                      RM250/per night \n"
                		+ "FAMILY ROOM                   RM100/per night ");
                
            }
        });
        
        // Create JButton and JPanel
        JButton button2 = new JButton("BOOKING NOW");
       
        
        // Add button to JPanel
        panel.add(button2);
        // And JPanel needs to be added to the JFrame itself!
        this.getContentPane().add(panel,BorderLayout.PAGE_END);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        button2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	try{
            		int dayinput,selectinput;
            		calculation a = new calculation();
            		JOptionPane.showMessageDialog(null,"Hello, Welcome to Blue Ocean Hotel Booking System.");
            		String name=JOptionPane.showInputDialog(null,"Insert Your Name : ");
            		JOptionPane.showMessageDialog(null, "Your name is "+name);
            		JOptionPane.showMessageDialog(null,"Room Type : \n1. SUITE DELUXE : RM 300 per night\n2. SUITE : RM 250 per night\n3. Family Room : RM100 per night"
            										);
            		selectinput=Integer.parseInt(JOptionPane.showInputDialog(null,"Insert Your Room Selection (1~3) :"));
            		dayinput=Integer.parseInt(JOptionPane.showInputDialog(null,"How Many Day(s) for this booking (minimum a day) :"));
            		JOptionPane.showMessageDialog(null, "Receipt\nName : "+name+"\nRoom Selection : "+selectinput+"\nDays : "+dayinput+" days\nTotal Price : RM"+a.calculation(dayinput,selectinput));
            	}
            	
            	catch(NumberFormatException no)
            	{
            	JOptionPane.showMessageDialog(null, "HEY! Check back your number format ");
            	}
            	
            	finally
            	{
            		JOptionPane.showMessageDialog(null, "Your Booking is Successfull! , Happy Vacation from us BLUEOCEAN HOTEL");
            	}
                
            }
        });
    }
    
    
    
    

    public static void main(String[] args) {

        home a = new home();
    }
}
