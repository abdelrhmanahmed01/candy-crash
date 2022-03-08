 package trial2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Grid extends JFrame implements ActionListener{
JPanel p1=new JPanel();
JPanel p2=new JPanel();
//spots array is consists of spots which are candies EXTENDS JButton
Spot [][]spots=new Spot[6][6];
/*ml1 is the object that used to intialize array of spots to mouse listener*/
ml ml1=new ml();
Candy c;
/*x,y are the array of spots cordinates*/
int x,y;
 JLabel L1=new JLabel("CANDY CRUSH");
 JLabel L3=new JLabel("MOVES : ");
 int moves=5;
 int score=0;
//name frame
JFrame enter_name=new JFrame();
   JTextField TF_Name=new JTextField();
   Icon submitIcon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\submit.png");
   JButton submitName=new JButton(submitIcon);
   Icon showplayersIcon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\showplayers.png");
   JButton showplayers=new JButton(showplayersIcon);
   Icon restrarticon =new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\restart.png");
   JButton restart=new JButton(restrarticon);
   //array of players
   String initialName;
   public final static Player []players=new Player[40];
   /*Player_i counter of adding players to the array*/
   static int Player_i=4;
     
public Grid(){
 //enter your name frame//
        enter_name.setTitle("enter your name");
        enter_name.setVisible(true);
        enter_name.setSize(450,600);
        enter_name.setLocation(0,0);
        enter_name.setLayout(null);
        enter_name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        enter_name.setResizable(false);
        enter_name.setContentPane(new JLabel(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\attach\\enetrName.png")));
        enter_name.add(TF_Name);
        TF_Name.setBounds(65,300, 300, 50);
        enter_name.add(submitName);
        submitName.setBounds(150, 370, 150, 50);
        submitName.addActionListener(this);
        enter_name.add(showplayers);
        showplayers.setBounds(100, 450, 242, 50);
        showplayers.addActionListener(this);
        restart.addActionListener(this);
    //game frame//
        setTitle("Game");
        this.setVisible(true);
        this.setSize(2000,1000);
        this.setLocation(0,0);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        L1.setBounds(100, 0, 1000,200);
        L1.setForeground(Color.white);
        add(L1);
        L1.setFont(L1.getFont().deriveFont(80.6f));

        L3.setBounds(100,150, 500,100);
        L3.setForeground(Color.white);
        add(L3);
        L3.setFont(L3.getFont().deriveFont(50.6f));

        p1.setBackground(Color.black);
        p1.setLayout(null);
        p1.setBounds(700, 100, 600, 600);
        p2.setBackground(Color.pink);
        p2.setLayout(null);
        p2.setBounds(0, 0, 2000, 1000);
        this.add(p2);
        p2.add(p1);
        add(restart);
        restart.setLayout(null);
        restart.setBounds(50, 600, 200, 100);
        
       
        
        //player loop initial players
         players[0]=new Player();
         players[0].name="ahmed"; players[0].score=250;
         players[1]=new Player();
         players[1].name="abdulrahman"; players[1].score=200;
          players[2]=new Player();
          players[2].name="mostafa"; players[2].score=150;
          players[3]=new Player();
          players[3].name="gamal"; players[3].score=200;

            
        AddSpotsArray();
        /*intialize array of spots to mouse listen*/
         for(int i=0;i<6;i++){
             for(int j=0;j<6;j++){
                spots[i][j].SpotButton.addMouseListener(ml1); 
             }
         }
         for(int i=0;i<6;i++){
             for(int j=0;j<6;j++){
                spots[i][j].SpotButton.addActionListener(this); 
             }
         }
                       
}
     public void addPlayer(){        
    players[Player_i]=new Player();
    players[Player_i].name=TF_Name.getText();;
    players[Player_i].score=score;
    Player_i++;
    }
     public void show_players(){
     for(int i=0;i<40;i++){
     try{
     System.out.println(players[i].name+"  "+players[i].score);
       }catch(NullPointerException npe){ }
     }
     }

public void AddSpotsArray(){
    /* intitaliz array of spots*/
    /*1st row*/
    spots[0][0]=new Spot(3);
    p1.add(spots[0][0].SpotButton);
    spots[0][0].SpotButton.setLayout(null);
    spots[0][0].SpotButton.setBounds(0, 0, 100, 100);
    
    spots[0][1]=new Spot(6);
    p1.add(spots[0][1].SpotButton);
    spots[0][1].SpotButton.setLayout(null);
    spots[0][1].SpotButton.setBounds(100, 0, 100, 100);
    
    spots[0][2]=new Spot(1);
     p1.add(spots[0][2].SpotButton);
    spots[0][2].SpotButton.setLayout(null);
    spots[0][2].SpotButton.setBounds(200, 0, 100, 100);
    
    spots[0][3]=new Spot(1);
    p1.add(spots[0][3].SpotButton);
    spots[0][3].SpotButton.setLayout(null);
    spots[0][3].SpotButton.setBounds(300, 0, 100, 100);
    
    spots[0][4]=new Spot(1);
    p1.add(spots[0][4].SpotButton);
    spots[0][4].SpotButton.setLayout(null);
    spots[0][4].SpotButton.setBounds(400, 0, 100, 100);
    
    spots[0][5]=new Spot(1);
    p1.add(spots[0][5].SpotButton);
    spots[0][5].SpotButton.setLayout(null);
    spots[0][5].SpotButton.setBounds(500, 0, 100, 100);
    
    /*2nd row*/
    spots[1][0]=new Spot(1);
    p1.add(spots[1][0].SpotButton);
    spots[1][0].SpotButton.setLayout(null);
    spots[1][0].SpotButton.setBounds(0, 100, 100, 100);
    
    spots[1][1]=new Spot(4);
    p1.add(spots[0][1].SpotButton);
    spots[1][1].SpotButton.setLayout(null);
    spots[1][1].SpotButton.setBounds(100, 100, 100, 100);
    p1.add(spots[1][1].SpotButton);
    
    spots[1][2]=new Spot(4);
    p1.add(spots[1][2].SpotButton);
    spots[1][2].SpotButton.setLayout(null);
    spots[1][2].SpotButton.setBounds(200, 100, 100, 100);
    
    spots[1][3]=new Spot(5); 
    p1.add(spots[1][3].SpotButton);
    spots[1][3].SpotButton.setLayout(null);
    spots[1][3].SpotButton.setBounds(300, 100, 100, 100);
    
    spots[1][4]=new Spot(2); 
    p1.add(spots[1][4].SpotButton);
    spots[1][4].SpotButton.setLayout(null);
    spots[1][4].SpotButton.setBounds(400, 100, 100, 100);
    
    spots[1][5]=new Spot(6); 
    p1.add(spots[1][5].SpotButton);
    spots[1][5].SpotButton.setLayout(null);
    spots[1][5].SpotButton.setBounds(500, 100, 100, 100);
    
    /*3rd row*/
    spots[2][0]=new Spot(3);
    p1.add(spots[2][0].SpotButton);
    spots[2][0].SpotButton.setLayout(null);
    spots[2][0].SpotButton.setBounds(0, 200, 100, 100);
    
    spots[2][1]=new Spot(3);
    p1.add(spots[2][1].SpotButton);
    spots[2][1].SpotButton.setLayout(null);
    spots[2][1].SpotButton.setBounds(100, 200, 100, 100);
    
    spots[2][2]=new Spot(2);
    p1.add(spots[2][2].SpotButton);
    spots[2][2].SpotButton.setLayout(null);
    spots[2][2].SpotButton.setBounds(200, 200, 100, 100);
    
    spots[2][3]=new Spot(4);
    p1.add(spots[2][3].SpotButton);
    spots[2][3].SpotButton.setLayout(null);
    spots[2][3].SpotButton.setBounds(300, 200, 100, 100);
    
    spots[2][4]=new Spot(6);
    p1.add(spots[2][4].SpotButton);
    spots[2][4].SpotButton.setLayout(null);
    spots[2][4].SpotButton.setBounds(400, 200, 100, 100);
    
    spots[2][5]=new Spot(3);
    p1.add(spots[2][5].SpotButton);
    spots[2][5].SpotButton.setLayout(null);
    spots[2][5].SpotButton.setBounds(500, 200, 100, 100);
    
    /*4th row*/
    spots[3][0]=new Spot(5);
    p1.add(spots[3][0].SpotButton);
    spots[3][0].SpotButton.setLayout(null);
    spots[3][0].SpotButton.setBounds(0, 300, 100, 100);
    
    spots[3][1]=new Spot(5);
    p1.add(spots[3][1].SpotButton);
    spots[3][1].SpotButton.setLayout(null);
    spots[3][1].SpotButton.setBounds(100, 300, 100, 100);
    
    spots[3][2]=new Spot(6);
    p1.add(spots[3][2].SpotButton);
    spots[3][2].SpotButton.setLayout(null);
    spots[3][2].SpotButton.setBounds(200, 300, 100, 100);
    
    spots[3][3]=new Spot(6);
    p1.add(spots[3][3].SpotButton);
    spots[3][3].SpotButton.setLayout(null);
    spots[3][3].SpotButton.setBounds(300, 300, 100, 100);
    
    spots[3][4]=new Spot(2);
    p1.add(spots[3][4].SpotButton);
    spots[3][4].SpotButton.setLayout(null);
    spots[3][4].SpotButton.setBounds(400, 300, 100, 100);
    
    spots[3][5]=new Spot(5);
    p1.add(spots[3][5].SpotButton);
    spots[3][5].SpotButton.setLayout(null);
    spots[3][5].SpotButton.setBounds(500, 300, 100, 100);
    
    /*5th row*/
    spots[4][0]=new Spot(3);
    p1.add(spots[4][0].SpotButton);
    spots[4][0].SpotButton.setLayout(null);
    spots[4][0].SpotButton.setBounds(0, 400, 100, 100);
    
    spots[4][1]=new Spot(6);
    p1.add(spots[4][1].SpotButton);
    spots[4][1].SpotButton.setLayout(null);
    spots[4][1].SpotButton.setBounds(100, 400, 100, 100);
    
    spots[4][2]=new Spot(2);
    p1.add(spots[4][2].SpotButton);
    spots[4][2].SpotButton.setLayout(null);
    spots[4][2].SpotButton.setBounds(200, 400, 100, 100);
    
    spots[4][3]=new Spot(5);
    p1.add(spots[4][3].SpotButton);
    spots[4][3].SpotButton.setLayout(null);
    spots[4][3].SpotButton.setBounds(300, 400, 100, 100);
    
    spots[4][4]=new Spot(6);
    p1.add(spots[4][4].SpotButton);
    spots[4][4].SpotButton.setLayout(null);
    spots[4][4].SpotButton.setBounds(400, 400, 100, 100);
    
    spots[4][5]=new Spot(2);
    p1.add(spots[4][5].SpotButton);
    spots[4][5].SpotButton.setLayout(null);
    spots[4][5].SpotButton.setBounds(500, 400, 100, 100);
    
    /*6th row*/
    spots[5][0]=new Spot(4);
    p1.add(spots[5][0].SpotButton);
    spots[5][0].SpotButton.setLayout(null);
    spots[5][0].SpotButton.setBounds(0, 500, 100, 100);
    
    spots[5][1]=new Spot(4);
    p1.add(spots[5][1].SpotButton);
    spots[5][1].SpotButton.setLayout(null);
    spots[5][1].SpotButton.setBounds(100, 500, 100, 100);
    
    spots[5][2]=new Spot(6);
    p1.add(spots[5][2].SpotButton);
    spots[5][2].SpotButton.setLayout(null);
    spots[5][2].SpotButton.setBounds(200, 500, 100, 100);
    
    spots[5][3]=new Spot(2);
    p1.add(spots[5][3].SpotButton);
    spots[5][3].SpotButton.setLayout(null);
    spots[5][3].SpotButton.setBounds(300, 500, 100, 100);
    
    spots[5][4]=new Spot(5);
    p1.add(spots[5][4].SpotButton);
    spots[5][4].SpotButton.setLayout(null);
    spots[5][4].SpotButton.setBounds(400, 500, 100, 100);
    
    spots[5][5]=new Spot(5);
    p1.add(spots[5][5].SpotButton);
    spots[5][5].SpotButton.setLayout(null);
    spots[5][5].SpotButton.setBounds(500, 500, 100, 100);
    
}
//swap hori
public void swap_hori1(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x-1][y].c.id;
    spots[x-1][y].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x-1][y].c.name;
    spots[x-1][y].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x-1][y].icon;
    spots[x-1][y].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x-1][y].SpotButton.setIcon(new ImageIcon(spots[x-1][y].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_hori2(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x+1][y].c.id;
    spots[x+1][y].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x+1][y].c.name;
    spots[x+1][y].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x+1][y].icon;
    spots[x+1][y].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x+1][y].SpotButton.setIcon(new ImageIcon(spots[x+1][y].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_hori3(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x-1][y].c.id;
    spots[x-1][y].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x-1][y].c.name;
    spots[x-1][y].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x-1][y].icon;
    spots[x-1][y].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x-1][y].SpotButton.setIcon(new ImageIcon(spots[x-1][y].icon.toString()));   

     score=score+6;
     moves--;
}
public void swap_hori4(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x+1][y].c.id;
    spots[x+1][y].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x+1][y].c.name;
    spots[x+1][y].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x+1][y].icon;
    spots[x+1][y].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x+1][y].SpotButton.setIcon(new ImageIcon(spots[x+1][y].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_hori5(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x+1][y].c.id;
    spots[x+1][y].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x+1][y].c.name;
    spots[x+1][y].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x+1][y].icon;
    spots[x+1][y].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x+1][y].SpotButton.setIcon(new ImageIcon(spots[x+1][y].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_hori6(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x-1][y].c.id;
    spots[x][y-1].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x-1][y].c.name;
    spots[x][y-1].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x][y-1].icon;
    spots[x][y-1].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x][y-1].SpotButton.setIcon(new ImageIcon(spots[x][y-1].icon.toString()));
     score=score+6;
     moves--;
}
public void swap_hori7(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x][y-1].c.id;
    spots[x][y-1].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x][y-1].c.name;
    spots[x][y-1].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x][y-1].icon;
    spots[x][y-1].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x][y-1].SpotButton.setIcon(new ImageIcon(spots[x][y-1].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_hori8(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x][y+1].c.id;
    spots[x][y+1].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x][y+1].c.name;
    spots[x][y+1].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x][y+1].icon;
    spots[x][y+1].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x][y+1].SpotButton.setIcon(new ImageIcon(spots[x][y+1].icon.toString()));   
     
     score=score+6;
     moves--;
}

//add add_removedSpots_hori (replace 3 candies with empty spots 
public void add_removedSpots_hori(int x,int y){
    if(y>=2&&spots[x][y].c.id==spots[x][y-1].c.id&&spots[x][y-1].c.id==spots[x][y-2].c.id){
         spots[x][y].c.id=6;
         spots[x][y].c.name="Teardrop";
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
         
         spots[x][y-1].c.id=5;
         spots[x][y-1].c.name="Lozenge";
         spots[x][y-1].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c555.png"));
         
         spots[x][y-2].c.id=3;
         spots[x][y-2].c.name="Sausage";
         spots[x][y-2].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png"));                
    }   
}
public void add_removedSpots_hori_super(int x,int y){
    if(y>=3&&spots[x][y].c.id==spots[x][y-1].c.id&&spots[x][y-1].c.id==spots[x][y-2].c.id&&spots[x][y-2].c.id==spots[x][y-3].c.id){
         score=score+10; 
        spots[x][y].c.id=0;
         spots[x][y].c.name=null;
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
         
         spots[x][y-1].c.id=0;
         spots[x][y-1].c.name=null;
         spots[x][y-1].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));
         
         spots[x][y-2].c.id=0;
         spots[x][y-2].c.name=null;
         spots[x][y-2].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png")); 
         
         spots[x][y-3].c.id=1111;
         spots[x][y-3].c.name=null;
         spots[x][y-3].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\Supercandy.png")); 
    }   
}
void SuperCandy_active_hori(int x,int y){
         score=score+10;
         if(y==2){
         spots[x][y].c.id=2;
         spots[x][y].c.name=null;
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c222.png"));
         
         spots[x][y+1].c.id=1;
         spots[x][y+1].c.name="Sausage";
         spots[x][y+1].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));
         
         spots[x][y+2].c.id=3;
         spots[x][y+2].c.name="Teardrop";
         spots[x][y+2].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png")); 
         
         spots[x][y+3].c.id=4;
         spots[x][y+3].c.name="GUM SQUARE";
         spots[x][y+3].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c444.png"));
          spots[x][y-1].c.id=6;
         spots[x][y-1].c.name="JUJUBE CLUSTER";
         spots[x][y-1].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
          spots[x][y-2].c.id=1;
         spots[x][y-2].c.name="Sausage";
         spots[x][y-2].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));      
         }
         if(y==1){
             spots[x][y].c.id=2;
         spots[x][y].c.name=null;
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c222.png"));
         
         spots[x][y+1].c.id=1;
         spots[x][y+1].c.name="Sausage";
         spots[x][y+1].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));
         
         spots[x][y+2].c.id=3;
         spots[x][y+2].c.name="Teardrop";
         spots[x][y+2].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png")); 
         
         spots[x][y+3].c.id=4;
         spots[x][y+3].c.name="GUM SQUARE";
         spots[x][y+3].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c444.png"));
          spots[x][y+4].c.id=6;
         spots[x][y+4].c.name="JUJUBE CLUSTER";
         spots[x][y+4].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
          spots[x][y-1].c.id=1;
         spots[x][y-1].c.name="Sausage";
         spots[x][y-1].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));   
         }
         if(y==0){
             spots[x][y].c.id=2;
         spots[x][y].c.name=null;
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c222.png"));
         
         spots[x][y+1].c.id=1;
         spots[x][y+1].c.name="Sausage";
         spots[x][y+1].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));
         
         spots[x][y+2].c.id=3;
         spots[x][y+2].c.name="Teardrop";
         spots[x][y+2].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png")); 
         
         spots[x][y+3].c.id=4;
         spots[x][y+3].c.name="GUM SQUARE";
         spots[x][y+3].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c444.png"));
          spots[x][y+4].c.id=6;
         spots[x][y+4].c.name="JUJUBE CLUSTER";
         spots[x][y+4].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
          spots[x][y+5].c.id=1;
         spots[x][y+5].c.name="Sausage";
         spots[x][y+5].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));  
         }
}
//vertically
public void add_removedSpots_ver(int x,int y){
    if(x>=2&&spots[x][y].c.id==spots[x-1][y].c.id&&spots[x-1][y].c.id==spots[x-2][y].c.id){
         spots[x][y].c.id=3;
         spots[x][y].c.name="Teardrop";
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
         
         spots[x-1][y].c.id=2;
         spots[x-1][y].c.name="Lozenge";
         spots[x-1][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c555.png"));
         
         spots[x-2][y].c.id=1;
         spots[x-2][y].c.name="Sausage";
         spots[x-2][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png"));                
    }   
}
public void add_removedSpots_ver_super(int x,int y){
    if(y>=3&&spots[x][y].c.id==spots[x][y-1].c.id&&spots[x][y-1].c.id==spots[x][y-2].c.id&&spots[x][y-2].c.id==spots[x][y-3].c.id){
         score=score+10; 
        spots[x][y].c.id=0;
         spots[x][y].c.name=null;
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
         
         spots[x-1][y].c.id=0;
         spots[x-1][y].c.name=null;
         spots[x-1][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));
         
         spots[x-2][y].c.id=0;
         spots[x-2][y].c.name=null;
         spots[x-2][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png")); 
         
         spots[x-3][y].c.id=2222;
         spots[x-3][y].c.name=null;
         spots[x-3][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\Supercandy.png")); 
    }   
}
void SuperCandy_active_ver(int x,int y){
         if(x==3){
         spots[x][y].c.id=2;
         spots[x][y].c.name=null;
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c222.png"));
         
         spots[x+1][y].c.id=1;
         spots[x+1][y].c.name="Sausage";
         spots[x+1][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));
         
         spots[x+2][y].c.id=3;
         spots[x+2][y].c.name="Teardrop";
         spots[x+2][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png")); 
         
         spots[x-1][y].c.id=4;
         spots[x-1][y].c.name="GUM SQUARE";
         spots[x-1][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c444.png"));
          spots[x-2][y].c.id=6;
         spots[x-2][y].c.name="JUJUBE CLUSTER";
         spots[x-2][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
          spots[x-3][y].c.id=1;
         spots[x-3][y].c.name="Sausage";
         spots[x-3][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));      
         }
         if(x==4){
             spots[x][y].c.id=2;
         spots[x][y].c.name=null;
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c222.png"));
         
         spots[x+1][y].c.id=1;
         spots[x+1][y].c.name="Sausage";
         spots[x+1][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));
         
         spots[x-1][y].c.id=3;
         spots[x-1][y].c.name="Teardrop";
         spots[x-1][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png")); 
         
         spots[x-2][y].c.id=4;
         spots[x-2][y].c.name="GUM SQUARE";
         spots[x-2][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c444.png"));
          spots[x-3][y+4].c.id=6;
         spots[x-3][y].c.name="JUJUBE CLUSTER";
         spots[x-3][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
          spots[x-4][y].c.id=1;
         spots[x-4][y].c.name="Sausage";
         spots[x-4][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));   
         }
         if(x==5){
             spots[x][y].c.id=2;
         spots[x][y].c.name=null;
         spots[x][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c222.png"));
         
         spots[x-1][y].c.id=1;
         spots[x-1][y].c.name="Sausage";
         spots[x-1][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));
         
         spots[x-2][y].c.id=3;
         spots[x-2][y].c.name="Teardrop";
         spots[x-2][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png")); 
         
         spots[x-3][y].c.id=4;
         spots[x-3][y].c.name="GUM SQUARE";
         spots[x-3][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c444.png"));
          spots[x-4][y].c.id=6;
         spots[x-4][y].c.name="JUJUBE CLUSTER";
         spots[x-4][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png"));
          spots[x-5][y].c.id=1;
         spots[x-5][y].c.name="Sausage";
         spots[x-5][y].SpotButton.setIcon(new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png"));  
         }
}
//swap vertically
public void swap_ver1(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x][y-1].c.id;
    spots[x][y-1].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x][y-1].c.name;
    spots[x][y-1].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x][y-1].icon;
    spots[x][y-1].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x][y-1].SpotButton.setIcon(new ImageIcon(spots[x][y-1].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_ver2(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x][y-1].c.id;
    spots[x][y-1].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x][y-1].c.name;
    spots[x][y-1].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x][y-1].icon;
    spots[x][y-1].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x][y-1].SpotButton.setIcon(new ImageIcon(spots[x][y-1].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_ver3(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x][y+1].c.id;
    spots[x][y+1].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x][y+1].c.name;
    spots[x][y+1].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x][y+1].icon;
    spots[x][y+1].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x][y+1].SpotButton.setIcon(new ImageIcon(spots[x][y+1].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_ver4(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x][y+1].c.id;
    spots[x][y+1].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x][y+1].c.name;
    spots[x][y+1].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x][y+1].icon;
    spots[x][y+1].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x][y+1].SpotButton.setIcon(new ImageIcon(spots[x][y+1].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_ver5(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x][y-1].c.id;
    spots[x][y-1].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x][y-1].c.name;
    spots[x][y-1].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x][y-1].icon;
    spots[x][y-1].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x][y-1].SpotButton.setIcon(new ImageIcon(spots[x][y-1].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_ver6(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x][y+1].c.id;
    spots[x][y+1].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x][y+1].c.name;
    spots[x][y+1].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x][y+1].icon;
    spots[x][y+1].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x][y+1].SpotButton.setIcon(new ImageIcon(spots[x][y+1].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_ver7(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x+1][y].c.id;
    spots[x+1][y].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x+1][y].c.name;
    spots[x+1][y].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x+1][y].icon;
    spots[x+1][y].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x+1][y].SpotButton.setIcon(new ImageIcon(spots[x+1][y].icon.toString()));   
     
     score=score+6;
     moves--;
}
public void swap_ver8(int x,int y){
    int temp_id;
    String temp_name;
    Icon temp_icon;
    //id swap
    temp_id=spots[x][y].c.id;
    spots[x][y].c.id=spots[x-1][y].c.id;
    spots[x-1][y].c.id=temp_id;
    //name swap
    temp_name=spots[x][y].c.name;
    spots[x][y].c.name=spots[x-1][y].c.name;
    spots[x-1][y].c.name=temp_name;
    //icon swap
    temp_icon=spots[x][y].icon;
    spots[x][y].icon=spots[x-1][y].icon;
    spots[x-1][y].icon=temp_icon;
    //set icon
     spots[x][y].SpotButton.setIcon(new ImageIcon(spots[x][y].icon.toString()));
     spots[x-1][y].SpotButton.setIcon(new ImageIcon(spots[x-1][y].icon.toString()));   
     
     score=score+6;
     moves--;
}
    @Override
    public void actionPerformed(ActionEvent ae) {
        //submit name
        if(ae.getSource()==submitName){
          enter_name.setVisible(false);
        }
        /*winning case*/
        //loops are to make the win frame display when player press any button in the x,y dimensons
            for(int i=0;i<6;i++){
                for(int j=0;j<6;j++){
                    if(ae.getSource()==spots[i][j].SpotButton){   
                        if(moves==0&&score>=50){   
                           //if player when then we will save his name and score
                           addPlayer();                          
                        new Win().setVisible(true);  
                        this.setVisible(false);  
                    }
                    }
                }
                    }
            /*losing case*/
            for(int i=0;i<6;i++){
                for(int j=0;j<6;j++){
                    if(ae.getSource()==spots[i][j].SpotButton){ 
                        if(moves==0&&score<50){
                        //if player lose we will save his name and score
                        addPlayer();
                        new Lose().setVisible(true); 
                        this.setVisible(false);
                        
                    }
                    }
                }
                    }
            //showing results
            if(ae.getSource()==showplayers){
                show_players();
            }
            if(ae.getSource()==restart){
                enter_name.setVisible(false);
                this.setVisible(false);
                new Grid().setVisible(true);
            }
            
    }


private  class ml implements MouseListener,MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent me) {
            
           for(int i=0;i<6;i++){
                for(int j=0;j<6;j++){
                     x=i;
                     y=j;                    
                    if(me.getSource()==spots[i][j].SpotButton){ 

                    if(spots[x][y].c.id==1111){
                    SuperCandy_active_hori(x, y);
                    } 
                    if(spots[x][y].c.id==2222){
                    SuperCandy_active_ver(x, y);
                    } 
                    
                    add_removedSpots_hori_super(x,y);
                    //add empty spots (if 3 candies are the same
                    add_removedSpots_ver_super(x,y);
                    add_removedSpots_hori(x, y);
                    //add empty spots (if 3 candies are the same
                    add_removedSpots_ver(x, y);                    
         
                    //horizontal conditions:
                    //hori 1
                    if(x>=1&&y>=2&&moves>0){
                    if(spots[x][y].c.id==spots[x-1][y-1].c.id&&spots[x-1][y-1].c.id==spots[x-1][y-2].c.id){
                    System.out.println("hori 1");
                    swap_hori1(x,y); 
                    }
                    }
                    //hori 2
                    if(x<4&&y>=2&&moves>0){
                    if(spots[x][y].c.id==spots[x+1][y-1].c.id&&spots[x+1][y-1].c.id==spots[x+1][y-2].c.id){
                    System.out.println("hori 2");
                    swap_hori2(x,y); 
                    ;
                    }
                    }
                    //hori 3
                    if(x>=1&&y<4&&moves>0){
                    if(spots[x][y].c.id==spots[x-1][y+1].c.id&&spots[x-1][y+1].c.id==spots[x-1][y+2].c.id){
                    System.out.println("hori 3");
                    swap_hori3(x,y); 
                    ;
                    }
                    }
                    //hori 4
                    if(x<5&&y<4&&moves>0){
                    if(spots[x][y].c.id==spots[x+1][y+1].c.id&&spots[x+1][y+1].c.id==spots[x+1][y+2].c.id){
                    System.out.println("hori 4");
                    swap_hori4(x,y); 
                    }
                    }
                    //hori 5
                    if(y>=1&&x<4&&y<5&&moves>0){
                    if(spots[x][y].c.id==spots[x+1][y-1].c.id&&spots[x+1][y-1].c.id==spots[x+1][y+1].c.id){
                    System.out.println("hori 5");
                    swap_hori5(x,y); 
                    }
                    }
                    //hori 6
                    if(x>=1&&y>=1&&y<5&&moves>0){
                    if(spots[x][y].c.id==spots[x-1][y-1].c.id&&spots[x-1][y-1].c.id==spots[x-1][y+1].c.id){
                    System.out.println("hori 6");
                    swap_hori6(x,y); 
                    }
                    
                    if(y>=3&&moves>0){
                    if(spots[x][y].c.id==spots[x][y-2].c.id&&spots[x][y-2].c.id==spots[x][y-3].c.id){
                    System.out.println("hori 7");
                    swap_hori7(x,y); 
                    
                    }
                    
                    if(y<3&&moves>0){
                    if(spots[x][y].c.id==spots[x][y+2].c.id&&spots[x][y+2].c.id==spots[x][y+3].c.id){
                    System.out.println("ver 8");
                    swap_hori8(x,y); 
                    }
                    }
                   
                    
                    //vertical conditions:
                    //ver 1
                    if(y>=1&&x<3&&y<5&&moves>0){
                    if(spots[x][y].c.id==spots[x+1][y-1].c.id&&spots[x+1][y-1].c.id==spots[x+1][y-2].c.id){
                    System.out.println("ver 1");
                     swap_ver1(x, y); ;
                    }
                    }
                    //ver 2
                    if(x>=2&&y>=1&&x<5&&y<5&&moves>0){
                    if(spots[x][y].c.id==spots[x-1][y-1].c.id&&spots[x-1][y-1].c.id==spots[x-2][y-1].c.id){
                    System.out.println("ver 2");
                     swap_ver2(x, y); ;
                    }
                    }
                    //ver 3
                    if(x<4&&y<5&&moves>0){
                    if(spots[x][y].c.id==spots[x+1][y+1].c.id&&spots[x+1][y+1].c.id==spots[x+2][y+1].c.id){
                    System.out.println("ver 3");
                     swap_ver3(x, y); ;
                    }
                    }
                    //ver 4
                    if(x>=2&&y<4&&x<6&&y<6&&moves>0){
                    if(spots[x][y].c.id==spots[x-1][y+1].c.id&&spots[x-1][y+1].c.id==spots[x-2][y+1].c.id){
                    System.out.println("ver 4");
                     swap_ver4(x, y); ;
                    }
                    }
                    //ver 5
                    if(x>=1&&y>=1&&x<5&&y<6&&moves>0){
                    if(spots[x][y].c.id==spots[x-1][y-1].c.id&&spots[x-1][y-1].c.id==spots[x+1][y-1].c.id){
                    System.out.println("ver 5");
                     swap_ver5(x, y); ;
                    }
                    }
                    //ver 6
                    if(x>=1&&x<5&&y<5&&moves>0){
                    if(spots[x][y].c.id==spots[x-1][y+1].c.id&&spots[x-1][y+1].c.id==spots[x+1][y+1].c.id){
                    System.out.println("ver 6");
                     swap_ver6(x, y); ;
                    }
                    }
                    //ver 7
                    if(x>=3&&x<3&&y<6&&moves>0){
                    if(spots[x][y].c.id==spots[x+2][y].c.id&&spots[x+2][y].c.id==spots[x+3][y].c.id){
                    System.out.println("ver 7");
                     swap_ver7(x, y); ;
                    }
                    }
                     //ver 8
                    if(x>=3&&x<6&&y<6&&moves>0){
                    if(spots[x][y].c.id==spots[x-2][y].c.id&&spots[x-2][y].c.id==spots[x-3][y].c.id){
                    System.out.println("ver 8");
                     swap_ver8(x, y); ;
                    }
                    }
                    
        }
        }
        }
        }
        }
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

        @Override
        public void mouseDragged(MouseEvent me) {
        }

        @Override
        public void mouseMoved(MouseEvent me) {
        }
    }

}
