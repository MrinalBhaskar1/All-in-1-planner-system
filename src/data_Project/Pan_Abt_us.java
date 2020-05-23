
package data_Project;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pan_Abt_us extends JFrame{
    ImageIcon img=new ImageIcon("C:\\Users\\HEMANT DHIMAN\\Documents\\NetBeansProjects\\Project_16_jul_17_5.00pm\\src\\banner.jpg");
    ImageIcon img2=new ImageIcon("C:\\Users\\HEMANT DHIMAN\\Documents\\NetBeansProjects\\Project_16_jul_17_5.00pm\\src\\java-logo-vector.png");
    JPanel p=new JPanel(null);
    JLabel imgl=new JLabel(img);
    JLabel ver=new JLabel("Vesion 2.0");
    JLabel madeby=new JLabel("Made By Hemant");
    JLabel date=new JLabel("Date: 16_jul_17");
    JLabel imgl2=new JLabel(img2);
    
    
    public Pan_Abt_us() {
        add(p);
        p.add(ver);
        ver.setBounds(20,30,100,20);
        p.add(madeby);
        madeby.setBounds(20,50,100,20);
        p.add(date);
        date.setBounds(20,70,100,20);
        p.add(imgl2);
        imgl2.setBounds(100,5,100,100);
        p.add(imgl);
        imgl.setBounds(0,0,495,295);
        
        setVisible(true);
        setTitle("About Us");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String[] args) {
        new Pan_Abt_us();
    }
    
}
