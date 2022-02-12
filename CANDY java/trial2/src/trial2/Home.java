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
 
public class Home extends JFrame implements ActionListener{
    Icon playIcon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\playButton.png");
    Icon howtoplay =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\howtoplay.png");
   JButton PlayButton=new JButton(playIcon);
   Icon exitIcon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\exit.png");
   JButton ExitButton=new JButton(exitIcon);
   JFrame Howtoplay=new JFrame();
   JButton HowtoplayButton=new JButton(howtoplay);
   Icon back =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\back.png");
    JButton backbutton=new JButton(back);
   
   

   public Home (){  
   setTitle("Home");
    setSize(1000,700);
       setLocation(50, 50);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);                                            
    setContentPane(new JLabel(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\bg1.jpg")));
    setSize(1000,670);
    add(PlayButton);
    setLayout(null);
    PlayButton.setBounds(400,450, 150, 50);
    add(ExitButton);
    ExitButton.setBounds(400,520, 150, 50);
    add(HowtoplayButton);
    HowtoplayButton.setLayout(null);
    HowtoplayButton.setBounds(40, 30, 150, 50);
    HowtoplayButton.addActionListener(this);       
    PlayButton.addActionListener(this);
    ExitButton.addActionListener(this);
    backbutton.addActionListener(this);
    
     }
   public void show_frame(){
   Howtoplay.setTitle("Game");
    Howtoplay.setSize(500,520);
    Howtoplay.setLocation(400, 50);
    Howtoplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Howtoplay.setResizable(false);
    Howtoplay.setLocationRelativeTo(null);
    Howtoplay.setVisible(true);                                            
    Howtoplay.setContentPane(new JLabel(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\hint2.png")));
    Howtoplay.setLayout(null);
    Howtoplay.add(backbutton);
    backbutton.setLayout(null);
    backbutton.setBounds(200, 400, 150, 50);
    
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==PlayButton){
          this.setVisible(false);
          new Grid().setVisible(true);   
        }
        if(ae.getSource()==ExitButton){
            new Exit().setVisible(true);
            this.setVisible(false);
        }
        if(ae.getSource()==HowtoplayButton){
        show_frame();
    }
        if(ae.getSource()==backbutton){
        Howtoplay.setVisible(false);
    }
    }

    }
   
   

