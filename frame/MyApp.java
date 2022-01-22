import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class MyApp extends JFrame implements ActionListener{
  JPanel panel;
  JLabel numLabel1,numLabel2,addLabel;  
  JTextField textField1,textField2;
  JButton button;


  public MyApp(){
    panel = new JPanel();
    numLabel1 = new JLabel("Number 1:\n");
    numLabel2 = new JLabel("\nNumber 2:\n");
    addLabel = new JLabel();
    textField1 = new JTextField(20);
    textField2 = new JTextField(20);
    button = new JButton("Add");
    button.addActionListener(this);
    
    panel.add(numLabel1);
    panel.add(numLabel2);
    panel.add(textField1);
    panel.add(textField2);
    panel.add(addLabel);
    panel.add(button);
    panel.add(addLabel);

    add(panel);

    setSize(500,400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void 	actionPerformed(ActionEvent e){
    String result = " ";
    String num1 = textField1.getText();
    String num2 = textField2.getText();
    int number1 = Integer.parseInt(num1);
    int number2 = Integer.parseInt(num2);
    int total = number1 + number2;
    addLabel.setText(String.valueOf(total));
  }
}