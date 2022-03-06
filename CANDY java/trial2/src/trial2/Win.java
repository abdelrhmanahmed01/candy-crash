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
 
public class Win extends JFrame implements ActionListener{
   JLabel L1;
   Icon nextIcon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\next.png");
   JButton nextButton=new JButton(nextIcon);
   JLabel l2=new JLabel("you've earned more than 50 points");

   public Win (){
   setTitle("Game");
    setSize(450,700);
    setLocation(400, 50);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);                                            
    setContentPane(new JLabel(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\win.jpg")));
    setLayout(null);
    
    add(nextButton);
    setLayout(null);
    nextButton.setBounds(130,540, 150, 50);
    nextButton.addActionListener(this);
    add(l2);
    l2.setLayout(null);
    l2.setBounds(100,590, 250, 50);
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==nextButton){
            new Home().setVisible(true);
            this.setVisible(false);
        }

    }
   
   }

