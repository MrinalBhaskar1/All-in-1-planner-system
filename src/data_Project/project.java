package data_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class project extends JFrame implements KeyListener{
    int con;
    String user=null,pass=null;
    ImageIcon img=new ImageIcon("C:\\Users\\HEMANT DHIMAN\\Documents\\NetBeansProjects\\Project_16_jul_17_5.00pm\\src\\banner-03.jpg");
    JPanel p=new JPanel(null);
    JMenuBar menu=new JMenuBar();
    JMenu file=new JMenu("File");
    JMenu help=new JMenu("Help");
    JMenuItem exit=new JMenuItem("Exit");
    JMenuItem abt=new JMenuItem("About Us");
    JLabel imgl=new JLabel("",img,JLabel.CENTER);
    JLabel l1=new JLabel("Enter Username: ");
    JLabel l2=new JLabel("Enter Password: ");
    JPasswordField tp1=new JPasswordField();
    JTextField t2=new JTextField();
    JButton b1=new JButton("SIGN IN");
    public project(){
        add(p);
        p.add(imgl);
        imgl.setBounds(0,0,900,290);
        p.add(l1);
        l1.setBounds(10,320,100,20);
        p.add(l2);
        l2.setBounds(10,360,100,20);
        p.add(t2);
        t2.setBounds(120,320,150,20);
        p.add(tp1);
        tp1.setEchoChar('*');
        tp1.setBounds(120,360,150,20);
        p.add(b1);
        b1.setBackground(Color.ORANGE);
        b1.setFont(new Font("Arial",Font.PLAIN,15));
        b1.setBorder(null);
        b1.setFocusable(true);
        b1.setBounds(290,340,100,20);
        
        menu.add(file);
        file.add(exit);
        exit.setForeground(Color.red);
        menu.add(help);   
        help.add(abt);
        setJMenuBar(menu);
        setTitle("Party Planner 2.0");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,450);
        setLocationRelativeTo(null);
        setResizable(false);
        
        b1.addKeyListener(this);
        p.addKeyListener(this);
        addKeyListener(this);
        tp1.addKeyListener(this);
        t2.addKeyListener(this);
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con_exit();
            }
        });
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user=t2.getText();
                pass=tp1.getText();
                if(user.equals("")|| pass.equals("")){
                    JOptionPane.showMessageDialog(project.this,"Fields Can\'t Be Empty!!","Empty Fields",JOptionPane.WARNING_MESSAGE);
                    System.out.println("Incorrect login");
                }else if(user.equals("admin") && pass.equals("admin")){
                    new After_login();
                    setVisible(false);
                    System.out.println("login");
                }else{
                    JOptionPane.showMessageDialog(project.this,"INCORRECT USERNAME AND PASSWORD!!","ERROR SIGN IN",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        abt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new Pan_Abt_us();
            }
        });
    }
    public static void main(String[] args) {
        new project();
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e){
        
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
                user=t2.getText();
                pass=tp1.getText();
                if(user.equals("")|| pass.equals("")){
                    JOptionPane.showMessageDialog(project.this,"Fields Can\'t Be Empty!!","EMPTY FIELDS",JOptionPane.WARNING_MESSAGE);
                    System.out.println("Incorrect login");
                }else if(user.equals("admin") && pass.equals("admin")){
                    new After_login();
                    setVisible(false);
                    System.out.println("login");
                }else{
                    JOptionPane.showMessageDialog(project.this,"INCORRECT USERNAME AND PASSWORD!!","ERROR SIGN IN",JOptionPane.WARNING_MESSAGE);
                }
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {    }
    
     public void con_exit()
       {
        con=JOptionPane.showConfirmDialog(project.this,"Are You Sure?","Exit",JOptionPane.YES_NO_OPTION);
                if(con==0){
                    System.exit(0);
                System.out.println("exit");
                }if(con==1){
                    setVisible(true);
                }
    }

}