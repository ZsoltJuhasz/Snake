
package snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
    
     public GameFrame(){
         GamePanel panel = new GamePanel();
         this.add(panel);
         this.setTitle("Snake");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.pack(); 
         this.setVisible(true);
         this.setLocationRelativeTo(null);
     }
}
