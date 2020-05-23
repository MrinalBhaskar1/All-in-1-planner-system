package data_Project;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class After_login extends JFrame{
   ImageIcon img=new ImageIcon("C:\\Users\\HEMANT DHIMAN\\Documents\\NetBeansProjects\\Project_16_jul_17_5.00pm\\src\\2.png");
    JPanel p=new JPanel(null);
    JMenuBar menu=new JMenuBar();
    JMenu file=new JMenu("File");
    JMenu help=new JMenu("Help");
    JMenuItem logout=new JMenuItem("SIGN_OUT");
    JMenuItem abt=new JMenuItem("About us");
    JLabel imgl=new JLabel("",img,JLabel.CENTER);
    JLabel l1=new JLabel("Party Menu");
    JLabel l2=new JLabel("Birthday party");
    JLabel l3=new JLabel("Surprise party");
    JLabel l4=new JLabel("Dinner party");
    JLabel l5=new JLabel("Cocktail party");
    
    JLabel pl=new JLabel("PARTY PACKAGES TYPE");
    JLabel pl1=new JLabel("PLATINUM");
    JLabel pl2=new JLabel("GOLDEN");
    JLabel pl3=new JLabel("SILVER");
    
    JButton b1=new JButton("DETAILS");
    JButton b2=new JButton("DETAILS");
    JButton b3=new JButton("DETAILS");

    public After_login(){
        
        setJMenuBar(menu);
        menu.add(file);
        menu.add(help);
        file.add(logout);
        logout.setForeground(Color.red);
        help.add(abt);
        
        p.setBackground(Color.CYAN);
        
        p.add(l1);
        l1.setBounds(100,120,300,100);
        l1.setForeground(Color.pink);
        l1.setFont(new Font("Chiller",Font.BOLD,50));
        
        p.add(l2);
        l2.setBounds(130,210,300,30);
        l2.setForeground(Color.pink);
        l2.setFont(new Font("Chiller",Font.BOLD,30));
        l2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {      
                System.out.println("NEW FRAME");
                new Birthday_panel();
                setVisible(false);
                System.out.println("mouseclicked");
            }
            @Override
            public void mousePressed(MouseEvent e) { 
                l2.setForeground(Color.BLUE);
            System.out.println("mousepressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {     
                l2.setForeground(Color.red);
            System.out.println("mousereleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) { 
                l2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                l2.setForeground(Color.red);
            System.out.println("mouseentered");
            }

            @Override
            public void mouseExited(MouseEvent e) { 
                l2.setForeground(Color.pink);
            System.out.println("mouseExit");
            }
        });
        
        p.add(l3);
        l3.setBounds(130,260,300,30);
        l3.setForeground(Color.pink);
        l3.setFont(new Font("Chiller",Font.BOLD,30));
        l3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {   
                System.out.println("NEW FRAME");
                new Surpris_panel();
                setVisible(false);
                System.out.println("mouseclicked");
            }
            @Override
            public void mousePressed(MouseEvent e) { 
                l3.setForeground(Color.BLUE);
            System.out.println("mousepressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {     
                l3.setForeground(Color.red);
            System.out.println("mousereleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) { 
                l3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                l3.setForeground(Color.red);
            System.out.println("mouseentered");
            }

            @Override
            public void mouseExited(MouseEvent e) { 
                l3.setForeground(Color.pink);
            System.out.println("mouseExit");
            }
        });
        
        p.add(l4);
        l4.setBounds(130,310,300,30);
        l4.setForeground(Color.pink);
        l4.setFont(new Font("Chiller",Font.BOLD,30));
        l4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {  
                System.out.println("NEW FRAME");
                new Dinner_party();
                setVisible(false);
                System.out.println("mouseclicked");
            }
            @Override
            public void mousePressed(MouseEvent e) { 
                l4.setForeground(Color.BLUE);
            System.out.println("mousepressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {     
                l4.setForeground(Color.red);
            System.out.println("mousereleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) { 
                l4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                l4.setForeground(Color.red);
            System.out.println("mouseentered");
            }

            @Override
            public void mouseExited(MouseEvent e) { 
                l4.setForeground(Color.pink);
            System.out.println("mouseExit");
            }
        });
        
        p.add(l5);
        l5.setBounds(130,360,300,30);
        l5.setForeground(Color.pink);
        l5.setFont(new Font("Chiller",Font.BOLD,30));
        l5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {   
                System.out.println("NEW FRAME");
                new Cocktail_party();
                setVisible(false);
                System.out.println("mouseclicked");
            }
            @Override
            public void mousePressed(MouseEvent e) { 
                l5.setForeground(Color.BLUE);
            System.out.println("mousepressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {     
                l5.setForeground(Color.red);
            System.out.println("mousereleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) { 
                l5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                l5.setForeground(Color.red);
            System.out.println("mouseentered");
            }

            @Override
            public void mouseExited(MouseEvent e) { 
                l5.setForeground(Color.pink);
            System.out.println("mouseExit");
            }
        });
        
        p.add(pl);
        pl.setBounds(405,120,290,30);
        pl.setForeground(Color.WHITE);
        pl.setFont(new Font("Curlz MT",Font.BOLD,25));
        
        p.add(pl1);
        pl1.setBounds(420,160,200,30);
        pl1.setForeground(Color.WHITE);
        pl1.setFont(new Font("Curlz MT",Font.BOLD,25));
        p.add(b1);
        b1.setBounds(570,163,90,25);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBorder(null);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        p.add(pl2);
        pl2.setBounds(420,200,200,30);
        pl2.setForeground(Color.WHITE);
        pl2.setFont(new Font("Curlz MT",Font.BOLD,25));
        p.add(b2);
        b2.setBounds(570,203,90,25);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBorder(null);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        p.add(pl3);
        pl3.setBounds(420,240,200,30);
        pl3.setForeground(Color.WHITE);
        pl3.setFont(new Font("Curlz MT",Font.BOLD,25));
        p.add(b3);
        b3.setBounds(570,243,90,25);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBorder(null);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        p.add(imgl);
        imgl.setBounds(0,0,400,600);
        add(p);
        setTitle("Party Planner 2.0 Login In");
        setSize(700,650);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new project();
                setVisible(false);
                JOptionPane.showMessageDialog(After_login.this,"SIGN OUT SUCCESSFUL","SIGN OUT",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        abt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Pan_Abt_us();
            }
        });
    }
    
    public static void main(String[] args) {
        new After_login();
    }
}