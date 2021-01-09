/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;
 import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.awt.Button;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author Marina
 */
public class Zadanie_2 extends JFrame{
      Zadanie_2(String s) {
        super(s);
        setLayout(null);
        setSize(200,150);
        setVisible(true);  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(200, 200);
    final TextField tf1 = new TextField(15);
    tf1.setBounds(47, 1, 100, 20);
    add(tf1);
        final TextField tf2 = new TextField(15);
         tf2.setBounds(47, 25, 100, 20);
         add(tf2);
    final TextField tf3 = new TextField(15);
    tf3.setBounds(47, 50, 100, 20);
    add(tf3);
    Button b1 = new Button("Расчет");
    b1.setBounds(47, 80, 100, 20);
    add(b1);
    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        try{
        int value1 = Integer.parseInt(tf1.getText());
        System.out.println(value1);
        int value2 = Integer.parseInt(tf2.getText());
        System.out.println(value2);
        tf3.setText((String.valueOf(value1+value2)));
        }catch(NumberFormatException e){
        tf3.setText("Введите числа");
        }
    }
    });

} public static void main(String[] args) {
 new Zadanie_2("Сумматор");
 }}

   
  