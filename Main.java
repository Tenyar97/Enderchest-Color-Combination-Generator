package Enderchest_Generator;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.TextArea;

public class Main extends JFrame 
//Test auto-update.
{
	private static final long serialVersionUID = 7460018711337125841L;
	
	static String color1;
	static String color2;
	static String color3;
	static boolean again = true;
	static String Output;
	static Component Button;
	static String BG;
	private JTextField textField;
	
	//Color booleans
	static boolean stat = false;
	static boolean Blue = false;
	static boolean Green = false;
	static boolean Brown = false;
	static boolean Black = false;
	static boolean Cyan = false;
	static boolean White = false;
	
	
	ImageIcon Panel = new ImageIcon(Main.class.getResource("/Enderchest_Generator/Backgrounds/" + "Under_panel" + ".png"));
	

	public Main()  
	{
		
		//Pick a random picture from a folder to serve as a background
		
		Random rand = new Random();
		
		String[] backgroundchoices = { "One", "Two", "Three", "Four", "Five"};
		
		BG = backgroundchoices[rand.nextInt(backgroundchoices.length)];
		
		ImageIcon Background = new ImageIcon(Main.class.getResource("/Enderchest_Generator/Backgrounds/" + BG + ".png"));
		
		//Main Setup 
		
		setResizable(true);
		setSize(461, 371);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/Enderchest_Generator/Backgrounds/Ender_Tank.png")));
		setTitle("Enderchest Color Combination Generator");
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		
		//User Input setup, changes positions depending on the background loaded
		
		textField = new JTextField();
		textField.setBounds(200 - 50, 5 * 73 - 113, 142, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(true);
		
		
		
		//Generate button setup, changes positions depending on the background loaded
		
		final Button generate_Button = new Button("Generate");
		Button = generate_Button;
		Button.setBounds(200 - 50, 5 * 73 - 90, 142, 22);
		getContentPane().add(generate_Button);
		Button.setVisible(true);
		
		final Button button_Blue = new Button("Blue");
		button_Blue.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				Object Source = e.getSource();
				
				if(Source == button_Blue)
				{
					Blue = true;
				}
				
			}
		});
		button_Blue.setBounds(0, 252, 70, 22);
		getContentPane().add(button_Blue);
		
		final Button button_Green = new Button("Green");
		button_Green.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				Object Source = e.getSource();
				
				if(Source == button_Green)
				{
					Green = true;
				}
				
			}
		});
		button_Green.setBounds(0, 275, 70, 22);
		getContentPane().add(button_Green);
		
		final Button button_Brown = new Button("Brown");
		button_Brown.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				Object Source = e.getSource();
				
				if(Source == button_Brown)
				{
					Brown = true;
				}
				
			}
		});
		button_Brown.setBounds(0, 300, 70, 22);
		getContentPane().add(button_Brown);
		
		final Button button_Black = new Button("Black");
		button_Black.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				Object Source = e.getSource();
				
				if(Source == button_Black)
				{
					Black = true;
				}
				
			}
		});
		button_Black.setBounds(74, 252, 70, 22);
		getContentPane().add(button_Black);
		
		final Button button_Cyan = new Button("Cyan");
		button_Cyan.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				Object Source = e.getSource();
				
				if(Source == button_Cyan)
				{
					Cyan = true;
				}
				
			}
		});
		button_Cyan.setBounds(74, 275, 70, 22);
		getContentPane().add(button_Cyan);
		
		final Button button_White = new Button("White");
		button_White.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				Object Source = e.getSource();
				
				if(Source == button_White)
				{
					White = true;
				}
				
			}
		});
		button_White.setBounds(74, 300, 70, 22);
		getContentPane().add(button_White);
		
		final Button button_Clear = new Button("Clear");
		button_Clear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				
				Object Source = e.getSource();
				
				if(Source == button_Clear)
				{
					Blue = false;
					Black = false;
					Brown = false;
					Green = false;
					Cyan = false;
					White = false;
				}
				
			}
		});
		button_Clear.setBounds(353, 256, 82, 57);
		getContentPane().add(button_Clear);
		
		
		
		//background setup
		
		
		JLabel background=new JLabel(Background);
		background.setBounds(0, 0, Background.getIconWidth(), Background.getIconHeight() - 50);
		background.setVerticalAlignment(SwingConstants.BOTTOM);
		getContentPane().add(background);
		background.setLayout(new FlowLayout());
		
		JLabel background1=new JLabel(Panel);
		background1.setBounds(0, 224, 446, 250);
		background1.setVerticalAlignment(SwingConstants.BOTTOM);
		getContentPane().add(background1);
		background1.setLayout(new FlowLayout());
		
		
		//Gives functionality to the button
		
			generate_Button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				BufferedWriter writer = null;//System.out.println(generate_Button.getAlignmentX());
			    
		        Object Source = e.getSource();
		        if(Source == generate_Button)
		               
		        try {
		           
		           
		               
		                String Username = System.getProperty("user.name");
		               
		               
		                File logFile = new File("C://Users//" + Username + "//Desktop//Enderchest Color Combinations.txt");
		               
		               
		               
		           
		           
		            String newline = System.getProperty("line.separator");
		            System.out.println(logFile.getCanonicalPath());
		 
		            writer = new BufferedWriter(new FileWriter(logFile, true));
		               
		        writer.write(textField.getText() + " " + "-----" + " " + color1 + " " + color2 + " " + color3 + newline);
		        
		        Output = textField.getText() + " " + "-----" + " " + color1 + " " + color2 + " " + color3;
		        
		        System.out.println("Outputted: '" + Output + "' to: '" + logFile + "'.");
		           
	               
		        
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
	 
	while (again)
	{
		
	List<String> names = new ArrayList<String>();
	List<String> names2 = new ArrayList<String>();
	List<String> names3 = new ArrayList<String>();

	if(Blue == true)
	{
		names.add("Blue");
		names2.add("Blue");
		names3.add("Blue");
	}
	else
	{
		names.add("null");
		names2.add("null");
		names3.add("null");
	}
	
	if(Black == true)
	{
		names.add("Black");
		names2.add("Black");
		names3.add("Black");
	}
	else
	{
		names.add("null");
		names2.add("null");
		names3.add("null");
	}
	
	if(Brown == true)
	{
		names.add("Brown");
		names2.add("Brown");
		names3.add("Brown");
	}
	else
	{
		names.add("null");
		names2.add("null");
		names3.add("null");
	}
	
	if(Cyan == true)
	{
		names.add("Cyan");
		names2.add("Cyan");
		names3.add("Cyan");
	}
	else
	{
		names.add("null");
		names2.add("null");
		names3.add("null");
	}
	
	if(Green == true)
	{
		names.add("Green");
		names2.add("Green");
		names3.add("Green");
	}
	else
	{
		names.add("null");
		names2.add("null");
		names3.add("null");
	}
	
	System.out.println(names);
	
	
	
	if(names.size() == 0)
	{
		names.add("null");
	}
	
	if(names2.size() == 0)
	{
		names2.add("null");
	}
	
	if(names3.size() == 0)
	{
		names3.add("null");
	}
	
	
	
	int i = (int) Math.floor(names.size() * Math.random());
	int rand_names2 = (int) Math.floor(names2.size() * Math.random());
	int rand_names3 = (int) Math.floor(names3.size() * Math.random());
	
	
	
	
	
	
	color1 = names.get(i).toString().replaceAll("^\\[|\\]$", "");
	color2 = names2.get(rand_names2).toString().replaceAll("^\\[|\\]$", "");
	color3 = names3.get(rand_names3).toString().replaceAll("^\\[|\\]$", "");
	
	
	}
	}
	}