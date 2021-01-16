package Snake;

import javax.swing.JFrame;

public class SnakeFrame extends JFrame{

    SnakeFrame(){
//model
        this.add(new SnakePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}