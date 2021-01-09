package lab_8;
import java.awt.Color;
 import java.awt.Graphics;
 import javax.swing.JFrame;
/**
 *
 * @author Marina
 */
public class Zadanie_1 extends JFrame{

    Zadanie_1(String s) {
        super(s);
 setLayout(null);
 setSize(500,500);
 setVisible(true);  
 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 this.setResizable(false);
 this.setLocation(200, 200);
    }
    @Override
    public void paint(Graphics gr){
 int y; int j=0; int k=0;
 gr.setColor(Color.WHITE);
 gr.fillRect(0, 0, 600, 300);
gr.setColor(Color.BLACK);
 gr.drawLine(350, 200, 350, 350); /*правая линия*/
 gr.drawLine(350, 200, 150, 200); /*верхняя линия*/
  gr.drawLine(150, 200, 150, 350);/*левая*/
 gr.drawLine(150, 350, 350, 350); /*нижняя линия*/
  gr.drawLine(200, 200, 250, 150);
   gr.drawLine(250, 150,300, 200);
   gr.drawLine(150, 200, 250, 100);
   gr.drawLine(250, 100,350, 200);
     gr.drawLine(250, 300, 250, 250);
   gr.drawLine(220, 275,280, 275);
   gr.drawLine(220, 300, 220, 250);
   gr.drawLine(280, 300, 280, 250);
   gr.drawLine(220, 300,280, 300);
   gr.drawLine(220, 250,280, 250);
 gr.dispose();
 }
 public static void main(String[] args) {
 new Zadanie_1("Домик");
 }
}
        

