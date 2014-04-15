package components;
 
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
 
 
public class Main extends Frame
{
       
       
TextField textfield1;
Button button;
String input;
 
 
static String color1;
static String color2;
static String color3;
static boolean again = true;
 
 
 
public Main()
{
       
setSize(620, 125);
setLayout(new FlowLayout());
textfield1 = new TextField(8);
button = new Button("Generate");
add(textfield1);
add(button);
addWindowListener( new WindowAdapter()
 
 
{
       
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
);
button.addActionListener(new ActionListener()
{
       
       
public void actionPerformed(ActionEvent e)
{
        BufferedWriter writer = null;
       
        Object Source = e.getSource();
        if(Source == button)
               
        try {
           
           
               
                String Username = System.getProperty("user.name");
               
               
                File logFile = new File("C://Users//" + Username + "//Desktop//Enderchest Color Combinations.txt");
               
               
               
           
           
            String newline = System.getProperty("line.separator");
            System.out.println(logFile.getCanonicalPath());
 
            writer = new BufferedWriter(new FileWriter(logFile, true));
               
        writer.write(textfield1.getText() + " " + "-----" + " " + color1 + " " + color2 + " " + color3 + newline);
       
       
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
gui.setResizable(true);
gui.setBackground(Color.BLACK);
colors();
}      
 
 
private static void colors()
{
       
Random rand = new Random();
 
 
while (again)
{
String[] names = { "Green", "Blue", "Brown", "Black" };
String[] names2 = { "Green", "Blue", "Brown", "Black" };
String[] names3 = { "Green", "Blue", "Brown", "Black" };
 
 
 
color1 = names[rand.nextInt(names.length)];
color2 = names2[rand.nextInt(names2.length)];
color3 = names3[rand.nextInt(names3.length)];
 
System.out.println("Looping");
}
}
}