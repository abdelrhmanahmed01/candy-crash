package trial2;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Spot extends JButton {
JButton SpotButton;
Candy c;
Icon icon ;

public Spot(int candy_id){
     if(candy_id==1){
        c=new Candy1();
        icon = new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c111.png");
        SpotButton=new JButton(icon);
    }
     if(candy_id==2){
        c=new Candy2();
        icon = new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c222.png");
        SpotButton=new JButton(icon);
    }
       if(candy_id==3){
        c=new Candy3();
        icon = new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c333.png");
        SpotButton=new JButton(icon);
    }
       if(candy_id==4){
        c=new Candy4();
        icon = new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c444.png");
        SpotButton=new JButton(icon);
    }
       if(candy_id==5){
        c=new Candy5();
        icon = new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c555.png");
        SpotButton=new JButton(icon);
    }
       if(candy_id==6){
        c=new Candy6();
        icon = new ImageIcon("C:\\Users\\abdelrhman\\Desktop\\CANDY java\\candies\\c666.png");
        SpotButton=new JButton(icon);
    }
}
}

