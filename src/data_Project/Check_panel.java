
package data_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Check_panel extends JFrame implements ActionListener{
    int id,date,year,amount;
    String month,bookingdate,name;
    
    Connection con;
    PreparedStatement st;
    ResultSet SO;
    
    JPanel p=new JPanel(null);
    JLabel l1=new JLabel("Enter Booking Id: ");
    JLabel bname=new JLabel("Booked By: ");
    JLabel bookedon=new JLabel("Booked On: ");
    JLabel partydate=new JLabel("Booked For: ");
    JLabel pamount=new JLabel("Total Amount Paid: ");
    JLabel l2=new JLabel("");
    JTextField fid=new JTextField();
    JTextField bname1=new JTextField("name");
    JTextField bookedon1=new JTextField("Book on date");
    JTextField partydate1=new JTextField("Party date");
    JTextField pamount1=new JTextField("Paid Amount");
    JButton checkButton=new JButton("CHECK");
    JSeparator sep=new JSeparator(JSeparator.HORIZONTAL);
    
    public Check_panel(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded!!");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/party_planner","root","12345");
            System.out.println("Connection Establish!!");
        }catch(ClassNotFoundException o){
            o.printStackTrace();
        }   
        catch(SQLException sq){
            sq.printStackTrace();
        }
        
        add(p);
        p.add(sep);
        sep.setBounds(6,60,480,10);
        p.add(l1);
        l1.setBounds(20,20,200,20);
        p.add(bname);
        bname.setBounds(20,70,200,20);
        p.add(bookedon);
        bookedon.setBounds(20,100,200,20);
        p.add(partydate);
        partydate.setBounds(20,130,200,20);
        p.add(pamount);
        pamount.setBounds(20,160,230,20);
        p.add(fid);
        fid.setBounds(150,20,200,20);
        p.add(bname1);
        bname1.setBounds(150,70,200,20);
        p.add(bookedon1);
        bookedon1.setBounds(150,100,200,20);
        p.add(partydate1);
        partydate1.setBounds(150,130,200,20);
        p.add(pamount1);
        pamount1.setBounds(150,160,200,20);
        p.add(checkButton);
        checkButton.setBounds(380,20,100,20);
        checkButton.setBorder(null);
        checkButton.setForeground(Color.blue);
        p.add(l2);
        l2.setBounds(10,220,500,30);
        l2.setFont(new Font("Arial",Font.BOLD,30));
        
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("CHECK");
        checkButton.addActionListener(this);
    }
    public static void main(String[] args) {
        new Check_panel();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String m=e.getActionCommand();
        
        switch(m){
        case "CHECK":
        id=Integer.valueOf(fid.getText());
        try{
                        bname1.setText(null);
                        bookedon1.setText(null);
                        partydate1.setText(null);
                        pamount1.setText(null+"/-");
                st=con.prepareStatement("Select ID,p_date,p_month,p_year,amount,booking_date,name from booking1 where id=?");
                    st.setInt(1, id);
                    SO=st.executeQuery();  
                    if(SO.next()){
                        id=Integer.valueOf(SO.getString(1));
                        date=Integer.valueOf(SO.getString(2));
                        month=SO.getString(3);
                        year=Integer.valueOf(SO.getString(4));
                        amount=Integer.valueOf(SO.getString(5));
                        bookingdate=SO.getString(6);
                        name=SO.getString(7);
                        l2.setText("THE ID "+id+" IS BOOKED!!!!");
                        bname1.setText(name);
                        bookedon1.setText(bookingdate);
                        partydate1.setText(+date+"/"+month+"/"+year);
                        pamount1.setText(amount+"/-");
                    }else if(id<1){
                        l2.setText("INVALID ID ENTERED");
                    }else{
                        l2.setText("ID Not Exist!!"); 
                    }
                }catch(SQLException o){
                    o.printStackTrace();
                }                
            System.out.println(id);
        break;
        default:
        break;
    }
    }

}
