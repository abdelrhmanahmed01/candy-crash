package trial2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Lose extends JFrame implements ActionListener{
    JLabel L1;
    Icon RetryIcon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\next.png");
    JButton Retry=new JButton(RetryIcon);
    Icon ExitIcon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\exit.png");
    JButton Exit=new JButton(ExitIcon);

   public Lose (){  
       setTitle("Lose");
       setSize(450,700);
       setLocation(400,50);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
       setLocationRelativeTo(null);
       setVisible(true); 
       setContentPane(new JLabel(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\losee.jpg")));
       setLayout(null);
       add(Retry);
       Retry.setBounds(50, 550, 150, 50);
       Retry.setLayout(null);
       add(Exit);
       Exit.setLayout(null);
       Exit.setBounds(250, 550, 150, 50);
       Retry.addActionListener(this);
       Exit.addActionListener(this);
       
   }
     
    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==Retry){
            new Home().setVisible(true);
            this.setVisible(false);
        }
         if(ae.getSource()==Exit){
            new Exit().setVisible(true);
            this.setVisible(false);
        }
    }
}
   

    
   
   
