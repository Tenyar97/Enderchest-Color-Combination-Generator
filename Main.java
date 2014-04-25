package Generator_Rewrite;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame 
{
	static String color1;
	static String color2;
	static String color3;
	static boolean again = true;
	
	static String BG;
	private JTextField textField;
	
	

	public Main()  
	{
		
		//Pick a random picture from a folder to serve as a background
		
		Random rand = new Random();
		
		String[] backgroundchoices = { "One", "Two" };
		
		BG = backgroundchoices[rand.nextInt(backgroundchoices.length)];
		
		//Main Setup 
		
		setResizable(false);
		setSize(800, 600);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/Generator_Rewrite/Backgrounds/Ender_Tank.png")));
		setTitle("Enderchest Color Combination Generator");
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		
		//User Input setup, changes positions depending on the background loaded
		
		textField = new JTextField();
		
		if(BG == "One")
		{
			textField.setBounds(640, 234, 142, 22);
		}
		else
		{
			textField.setBounds(640, 234 * 2, 142, 22);
		}
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		//Generate button setup, changes positions depending on the background loaded
		
		final Button generate_Button = new Button("Generate");
		
		if(BG == "One")
		{
		generate_Button.setBounds(640, 262, 142, 25);
		}
		else
		{
			generate_Button.setBounds(640, 262 * 2, 142, 25);
		}
		getContentPane().add(generate_Button);
		
		
		//background setup
		
		JLabel background=new JLabel(new ImageIcon(Main.class.getResource("/Generator_Rewrite/Backgrounds/" + BG + ".png")));
		background.setBounds(0, 0, 794, 600);
		background.setVerticalAlignment(SwingConstants.TOP);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		
		
		//Gives functionality to the button
		
			generate_Button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				BufferedWriter writer = null;
			       
		        Object Source = e.getSource();
		        if(Source == generate_Button)
		               
		        try {
		           
		           
		               
		                String Username = System.getProperty("user.name");
		               
		               
		                File logFile = new File("C://Users//" + Username + "//Desktop//Enderchest Color Combinations test with background.txt");
		               
		               
		               
		           
		           
		            String newline = System.getProperty("line.separator");
		            System.out.println(logFile.getCanonicalPath());
		 
		            writer = new BufferedWriter(new FileWriter(logFile, true));
		               
		        writer.write(textField.getText() + " " + "-----" + " " + color1 + " " + color2 + " " + color3 + newline);
		       
		       
		    } catch (Exception ex) {
		        ex.printStackTrace();
		    } finally {
		        try {
		            writer.close();
		        } catch (Exception ex) {
		        }
		    }
		};{
		};
		});
		}

	public static void main(String[] args)
	{
		Main gui = new Main();
		gui.setTitle("Enderchest Color Combination Generator");
		gui.setVisible(true);
		colors();
	}      
	 
	 
	private static void colors()
	{
	       
	Random rand = new Random();
	 
	while (again)
	{
	String[] names = { "Green", "Blue", "Brown", "Black", "Cyan", "White" };
	String[] names2 = { "Green", "Blue", "Brown", "Black", "Cyan", "White" };
	String[] names3 = { "Green", "Blue", "Brown", "Black", "Cyan", "White" };
	
	color1 = names[rand.nextInt(names.length)];
	color2 = names2[rand.nextInt(names2.length)];
	color3 = names3[rand.nextInt(names3.length)];
	 
	System.out.println("Looping");
	}
	}
	}