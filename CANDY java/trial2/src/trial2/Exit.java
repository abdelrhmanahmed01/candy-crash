
package trial2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exit extends JFrame implements ActionListener{
    JPanel p1=new JPanel();
    Icon exitIcon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\exit.png");
    JButton exitButton=new JButton(exitIcon);
     Icon backIcon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\back.png");
    JButton backButton=new JButton(backIcon);
    
   public Exit(){
        setTitle("Exit");
       setSize(450,600);
       setLocation(400,50);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
       setLocationRelativeTo(null);
       setVisible(true); 
       setContentPane(new JLabel(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\exit.jpg")));
       setLayout(null);
        this.add(p1);
        
        this.add(exitButton);
        exitButton.setLayout(null);
        exitButton.setBounds(37, 400, 150, 50);
        exitButton.setFont(exitButton.getFont().deriveFont(20.1f));
        this.add(backButton);
        backButton.setLayout(null);
        backButton.setBounds(255, 400, 150, 50);
        backButton.setFont(backButton.getFont().deriveFont(20.1f));
        exitButton.addActionListener(this);
        backButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==exitButton){
            this.setVisible(false);
        }
        if(ae.getSource()==backButton){
            new Home().setVisible(true);
            this.setVisible(false);
        }
    }
}
