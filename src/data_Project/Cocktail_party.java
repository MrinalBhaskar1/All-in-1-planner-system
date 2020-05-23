package data_Project;

import com.id.ID;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Cocktail_party extends JFrame implements ActionListener,ChangeListener,FocusListener,TextListener
{
    Connection con;
    PreparedStatement st;
    int Totalbill=4000,bill,bill1,bill2;
    int id1=ID.getId();
    ImageIcon img=new ImageIcon("C:\\Users\\eAST\\Project_16_jul_17_5.00pm\\src\\temp.jpg");
    JPanel p=new JPanel(null);
    JMenuBar menu=new JMenuBar();
    JMenu file=new JMenu("File");
    JMenu help=new JMenu("Help");
    JMenuItem  back=new JMenuItem("Go_Back");
    JMenuItem  abt=new JMenuItem("About Us");
    JLabel l1=new JLabel(img);
    
    JLabel il0=new JLabel("COCKTAIL PARTY");
    JLabel il1=new JLabel("Booking ID: ");
    JLabel il2=new JLabel("First Name: ");
    JLabel il3=new JLabel("Last Name: ");
    JLabel il4=new JLabel("Email ID: ");
    JLabel il5=new JLabel("Contact No.: ");
    JLabel il6=new JLabel("Party Type: ");
    JLabel il7=new JLabel("Select City: ");
    JLabel il8=new JLabel("Select Place: ");
    JLabel il9=new JLabel("Food Type: ");
    JLabel il10=new JLabel("Terms & Condition: ");
    JLabel il11=new JLabel("NO Of Persons: ");
    JLabel datef=new JLabel("Select Date: ");
    JLabel il12=new JLabel("Total Amount:");
    
    JComboBox cb1=new JComboBox();
    JComboBox cb2=new JComboBox();
    JComboBox cb3=new JComboBox();
    JComboBox cb4=new JComboBox();
    JComboBox cbdate=new JComboBox();
    JComboBox cbmonth=new JComboBox();
    JComboBox cbyear=new JComboBox();
    
    JCheckBox cb=new JCheckBox("I Agree");
    
    JButton b1=new JButton("CONFIRM");
    JButton b2=new JButton("CANCEL");
    JButton b3=new JButton("BACK");
    JButton check=new JButton("CHECK BOOKED PARTY");
    JTextField if1=new JTextField(Integer.toString(id1));
    JTextField if2=new JTextField("");
    JTextField if3=new JTextField("");
    JTextField if4=new JTextField("");
    JTextField if5=new JTextField("");
    JTextField if6=new JTextField();
    JTextField if7=new JTextField("4000/-");
    String ptype,ftype="Select...",np;
    public Cocktail_party(){
        int id,date,year,amount;
              String month;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded!!");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mrinal","root","root");
            System.out.println("Connection Establish!!");
        }catch(ClassNotFoundException o)
        {
            o.printStackTrace();
        }   
        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
        
        setJMenuBar(menu);
        menu.add(file);
        file.add(back);
        back.setForeground(Color.red);
        menu.add(help);
        help.add(abt);
        add(p);
        /*labels*/
        p.add(il0);
        il0.setBounds(75,40,600,70);
        il0.setForeground(Color.RED);
        il0.setFont(new Font("Lucida Handwriting",Font.BOLD,50));
        p.add(il1);
        il1.setBounds(100,90,300,70);
        il1.setForeground(Color.RED);
        il1.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        p.add(il2);
        il2.setBounds(100,130,300,70);
        il2.setForeground(Color.RED);
        il2.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        p.add(il3);
        il3.setBounds(100,170,300,70);
        il3.setForeground(Color.RED);
        il3.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        p.add(il4);
        il4.setBounds(100,210,300,70);
        il4.setForeground(Color.RED);
        il4.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        p.add(il5);
        il5.setBounds(100,250,300,70);
        il5.setForeground(Color.RED);
        il5.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        p.add(il6);
        il6.setBounds(100,290,300,70);
        il6.setForeground(Color.RED);
        il6.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        p.add(il7);
        il7.setBounds(100,330,300,70);
        il7.setForeground(Color.RED);
        il7.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        p.add(il8);
        il8.setBounds(100,370,300,70);
        il8.setForeground(Color.RED);
        il8.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        p.add(il9);
        il9.setBounds(100,420,300,40);
        il9.setForeground(Color.RED);
        il9.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        p.add(il10);
        il10.setBounds(40,555,300,30);
        il10.setForeground(Color.RED);
        il10.setFont(new Font("Lucida Handwriting",Font.BOLD,14));
        p.add(il11);
        il11.setBounds(100,450,150,70);
        il11.setForeground(Color.RED);
        il11.setFont(new Font("Lucida Handwriting",Font.PLAIN,13));
        p.add(datef);
        datef.setBounds(100,490,150,70);
        datef.setForeground(Color.RED);
        datef.setFont(new Font("Lucida Handwriting",Font.PLAIN,13));
        p.add(il12);
        il12.setBounds(320,555,300,30);
        il12.setForeground(Color.darkGray);
        il12.setFont(new Font("Arial",Font.BOLD,20));

        /*txt field*/
        p.add(if1);
        if1.setBackground(Color.white);
        if1.setForeground(Color.gray);
        if1.setBounds(300,115,80,20);
        if1.setBorder(null);
        if1.setBackground(Color.WHITE);
//        if1.setEditable(false);
        p.add(if2);
        if2.setBackground(Color.white);
        if2.setForeground(Color.gray);
        if2.setBounds(300,155,200,20);
        p.add(if3);
        if3.setBackground(Color.white);
        if3.setForeground(Color.gray);
        if3.setBounds(300,195,200,20);
        p.add(if4);
        if4.setBackground(Color.white);
        if4.setForeground(Color.gray);
        if4.setBounds(300,235,200,20);
        p.add(if5);
        if5.setBackground(Color.white);
        if5.setForeground(Color.gray);
        if5.setBounds(300,275,200,20);
        p.add(if6);
        if6.setBackground(Color.white);
        if6.setForeground(Color.gray);
        if6.setBounds(300,475,200,20);
        p.add(if7);
        if7.setBackground(Color.white);
        if7.setForeground(Color.gray);
        if7.setBorder(null);
        if7.setEditable(false);
        if7.setBounds(460,558,100,20);
        if7.setFont(new Font("Arial",Font.BOLD,20));
        /*ComboBox*/
        p.add(cb1);
        cb1.setBackground(Color.white);
        cb1.setForeground(Color.gray);
        cb1.setBounds(300,315,200,20);
        cb1.setBorder(null);
        cb1.addItem("Select...");
        cb1.addItem("PLATINUM");
        cb1.addItem("GOLDEN");
        cb1.addItem("SILVER");
        p.add(cb2);
        cb2.setBackground(Color.white);
        cb2.setForeground(Color.gray);
        cb2.setBounds(300,355,200,20);
        cb2.setBorder(null);
        cb2.setEnabled(false);
        cb2.addItem("Select...");
        cb2.addItem("CHANDIGARH");
        p.add(cb3);
        cb3.setBackground(Color.white);
        cb3.setForeground(Color.gray);
        cb3.setBounds(300,395,200,20);
        cb3.setBorder(null);
        cb3.setEnabled(false);
        cb3.addItem("Select...");
        cb3.addItem("PLACE");
        p.add(cb4);
        cb4.setBackground(Color.white);
        cb4.setForeground(Color.gray);
        cb4.setBounds(300,435,200,20);
        cb4.setBorder(null);
        cb4.addItem("Select...");
        cb4.addItem("VEG");
        cb4.addItem("NON-VEG");
        p.add(cbdate);
        cbdate.setBackground(Color.white);
        cbdate.setForeground(Color.gray);
        cbdate.setBounds(300,515,60,20);
        cbdate.setBorder(null);
        cbdate.addItem("Date");
        cbdate.addItem("1");
        cbdate.addItem("2");
        cbdate.addItem("3");
        cbdate.addItem("4");
        cbdate.addItem("5");
        cbdate.addItem("6");
        cbdate.addItem("7");
        cbdate.addItem("8");
        cbdate.addItem("9");
        cbdate.addItem("10");
        cbdate.addItem("11");
        cbdate.addItem("12");
        cbdate.addItem("13");
        cbdate.addItem("14");
        cbdate.addItem("15");
        cbdate.addItem("16");
        cbdate.addItem("17");
        cbdate.addItem("18");
        cbdate.addItem("19");
        cbdate.addItem("20");
        cbdate.addItem("21");
        cbdate.addItem("22");
        cbdate.addItem("23");
        cbdate.addItem("24");
        cbdate.addItem("25");
        cbdate.addItem("26");
        cbdate.addItem("27");
        cbdate.addItem("28");
        cbdate.addItem("29");
        cbdate.addItem("30");
        cbdate.addItem("31");
        p.add(cbmonth);
        cbmonth.setBackground(Color.white);
        cbmonth.setForeground(Color.gray);
        cbmonth.setBounds(370,515,60,20);
        cbmonth.setBorder(null);
        cbmonth.addItem("Month");
        cbmonth.addItem("JAN");
        cbmonth.addItem("FEB");
        cbmonth.addItem("MAR");
        cbmonth.addItem("APR");
        cbmonth.addItem("MAY");
        cbmonth.addItem("JUN");
        cbmonth.addItem("JUL");
        cbmonth.addItem("AUG");
        cbmonth.addItem("SEP");
        cbmonth.addItem("OCT");
        cbmonth.addItem("NOV");
        cbmonth.addItem("DEC");
        p.add(cbyear);
        cbyear.setBackground(Color.white);
        cbyear.setForeground(Color.gray);
        cbyear.setBounds(440,515,60,20);
        cbyear.setBorder(null);
        cbyear.addItem("Year");
        cbyear.addItem("2017");
        cbyear.addItem("2018");
        cbyear.addItem("2019");
        cbyear.addItem("2020");

        p.add(cb);
        cb.setBackground(Color.white);
        cb.setForeground(Color.gray);
        cb.setBounds(235,557,80,20);
        cb.setBackground(Color.WHITE);
        /*Buttons*/
        p.add(b1);//confirm
        b1.setBounds(270,595,100,40);
        b1.setBorder(null);
        b1.setBackground(Color.lightGray);
        b1.setForeground(Color.white);
        b1.setEnabled(false);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        b1.setBackground(Color.GREEN);
//        b1.setForeground(Color.white);
        p.add(b2);//cancel
        b2.setBounds(470,595,100,40);
        b2.setBorder(null);
        b2.setBackground(Color.lightGray);
        b2.setForeground(Color.white);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        p.add(b3);//back
        b3.setBounds(70,595,100,40);
        b3.setBorder(null);
        b3.setBackground(Color.lightGray);
        b3.setForeground(Color.white);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));   
        p.add(check);
        check.setBounds(400,115,200,20);
        check.setBorder(null);
        check.setBackground(Color.lightGray);
        check.setForeground(Color.white);
        check.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));   
        p.add(l1);
        l1.setBounds(-12,-8,700,690);
        setSize(680,720);
        setTitle("Party Planner 2.0 Cocktail Booking");
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        cb4.addActionListener(this);
        cb.addActionListener(this);
        cb.addChangeListener(this);
        back.addActionListener(this);
        if6.addFocusListener(this);
//        if6.addTextListener(this);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm=JOptionPane.showConfirmDialog(Cocktail_party.this,"Are You Sure...?","CANCEL",JOptionPane.OK_CANCEL_OPTION);
                if(confirm==0){
                    setVisible(false);
                    new project();
                }else{
                    setVisible(true);
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm=JOptionPane.showConfirmDialog(Cocktail_party.this,"Are You Sure To Go Back..?","CANCEL",JOptionPane.OK_CANCEL_OPTION);
                if(confirm==0){
                    setVisible(false);
                    new After_login();
                }else{
                    setVisible(true);
                }
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(cbdate.getSelectedItem().equals("Date")||cbmonth.getSelectedItem().equals("Month")||cbyear.getSelectedItem().equals("Year")){
                  JOptionPane.showMessageDialog(Cocktail_party.this,"Please Select The Date Correctly","ERROR",JOptionPane.ERROR_MESSAGE);
                }else if(if2.getText().equals("")){
                    JOptionPane.showMessageDialog(Cocktail_party.this,"Please Fill First Name","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else if(!if2.getText().equals("")||!cbdate.getSelectedItem().equals("Date")||!cbmonth.getSelectedItem().equals("Month")||!cbyear.getSelectedItem().equals("Year")){
                
                int id,date,year,amount,i = 0;
                String month,name;
                try {
                   id=Integer.valueOf(if1.getText());
                   //id=ID.getId();
                    date=Integer.valueOf(String.valueOf(cbdate.getSelectedItem()));
                    month=String.valueOf(cbmonth.getSelectedItem());
                    year=Integer.valueOf(String.valueOf(cbyear.getSelectedItem()));
                    amount=Totalbill;
                    
                    Date da=new Date();
                    da=Calendar.getInstance().getTime();
                    String bookingdate=String.valueOf(da);
                    
                    name=if2.getText();
                st=con.prepareStatement("insert into booking1 values(?,?,?,?,?,?,?)");
                st.setInt(1,id);
                st.setInt(2,date);
                st.setString(3,month);
                st.setInt(4,year);
                st.setInt(5,amount);
                st.setString(6,bookingdate);
                st.setString(7,name);
                i=st.executeUpdate();
                }
                catch(SQLException ee){
                ee.printStackTrace();
                }
                if(i>0){    
                        System.out.println("success");
                     JOptionPane.showMessageDialog(Cocktail_party.this,"Your Party Planed Successful","SUCCESSFUL",JOptionPane.PLAIN_MESSAGE);
                 }else if(i==0){
                     System.out.println("unsuccess");
                     JOptionPane.showMessageDialog(Cocktail_party.this,"ID "+id1+" Already in use..!","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
                
                setVisible(false);
                new After_login();
                
                }
            }
        });
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Check_panel();
                
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
        new Cocktail_party();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource().equals(cb1))
      {
                ptype=String.valueOf(cb1.getSelectedItem());
                  if(null!=ptype)
                {
                    switch (ptype) 
                    {
                        case "PLATINUM":
                            bill=3000;
                            if7.setText(Integer.toString(bill+Totalbill+bill1)+"/-");
                            break;
                        case "GOLDEN":
                            bill=2000;
                            if7.setText(Integer.toString(bill+Totalbill+bill1)+"/-");
                            break;
                        case "SILVER":
                            bill=1000;
                            if7.setText(Integer.toString(bill+Totalbill+bill1)+"/-");
                            break;
                        default:
                            if7.setText("2000/-");
                            break;
                    }
                }  
        }
      if(e.getSource().equals(cb4))
      {
           ftype=String.valueOf(cb4.getSelectedItem());
           
           if(ftype.equals("VEG"))
           {
                bill1=1000;
                if7.setText(String.valueOf(bill+Totalbill+bill1)+"/-");
            }
           else if(ftype.equals("NON-VEG"))
           {
                bill1=1500;
                if7.setText(String.valueOf(bill+Totalbill+bill1)+"/-");
            }     
      }
        String temp=String.valueOf(cb1.getSelectedItem());
        if(temp.equals("Select...")){
            cb2.setEnabled(false);
            cb3.setEnabled(false);
        }
        else if(temp.equals("PLATINUM")||temp.equals("GOLDEN")||temp.equals("SILVER")){
            cb2.setEnabled(true);
        }
        String temp1=String.valueOf(cb2.getSelectedItem());
        
        if(temp1.equals("Select...")){
            cb3.setEnabled(false);
        }
        else{
            cb3.setEnabled(true);
        }
        String m=e.getActionCommand();
        if(m.equals("Go_Back")){
            int confirm=JOptionPane.showConfirmDialog(Cocktail_party.this,"Are You Sure To Go Back..?","CANCEL",JOptionPane.OK_CANCEL_OPTION);
                if(confirm==0){
                    setVisible(false);
                    new After_login();
                }else{
                    setVisible(true);
                }
        }
    }
    @Override
    public void stateChanged(ChangeEvent ce){
        if(cb.isSelected()){
            b1.setEnabled(true);
        }
        else{
            b1.setEnabled(false);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {    }

    @Override
    public void focusLost(FocusEvent e) {
     np=if6.getText().trim();
        
        if(np.equals(null) || np.equals(""))
        { 
        }
        else
        {
            if(ftype.equals("VEG"))
            {
                bill2=300*Integer.parseInt(np);
            }
            else if(ftype.equals("NON-VEG"))
            {
                bill2=500*Integer.parseInt(np);
            }
            Totalbill=Totalbill+bill+bill1+bill2;
                if7.setText(String.valueOf(Totalbill)+"/-");
        }
    }

    @Override
    public void textValueChanged(TextEvent e) {
     np=if6.getText().trim();
        if(np.equals(null) || np.equals(""))
        {
        }
        else
        {
            if(ftype.equals("VEG"))
            {
                bill2=300*Integer.parseInt(np);
            }
            else if(ftype.equals("NON-VEG"))
            {
                bill2=500*Integer.parseInt(np);
            }
            Totalbill=bill+bill1+bill2;
                if7.setText(String.valueOf(Totalbill)+"/-");
        }
    }

}
