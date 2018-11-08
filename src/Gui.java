import javax.swing.*;
import java.awt.*;

public class Gui {

    void createFraim(){
        JFrame frame = new JFrame("Calculator");
        JTextArea text = new JTextArea();
        JPanel panel = new JPanel();

        Button button = new Button();
        JButton button1 = button.Button("1");
        JButton button2 = button.Button("2");
        JButton button3 = button.Button("3");
        JButton button4 = button.Button("4");
        JButton button5 = button.Button("5");
        JButton button6 = button.Button("6");
        JButton button7 = button.Button("7");
        JButton button8 = button.Button("8");
        JButton button9 = button.Button("9");
        JButton button0 = button.Button("0");
        JButton buttonC = button.Button("C");
        JButton buttonEqual = button.Button("=");
        JButton buttonPlus = button.Button("+");
        JButton buttonMinus = button.Button("-");
        JButton buttonMultiple = button.Button("*");
        JButton buttonDivision = button.Button("/");



        frame.setSize(270,350);
        frame.setVisible(true);
        frame.setBackground(Color.BLUE);
        frame.setForeground(Color.BLUE);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        panel.add(text);
        text.setBounds(10,10,230,50);
        panel.add(button1);
        button1.setLocation(10, 70);
        panel.add(button2);
        button2.setLocation(70,70);
        panel.add(button3);
        button3.setLocation(130,70);
        panel.add(buttonPlus);
        buttonPlus.setLocation(190,70);
        panel.add(button4);
        button4.setLocation(10,130);
        panel.add(button5);
        button5.setLocation(70,130);
        panel.add(button6);
        button6.setLocation(130,130);
        panel.add(buttonMinus);
        buttonMinus.setLocation(190,130);
        panel.add(button7);
        button7.setLocation(10,190);
        panel.add(button8);
        button8.setLocation(70,190);
        panel.add(button9);
        button9.setLocation(130,190);
        panel.add(buttonMultiple);
        buttonMultiple.setLocation(190,190);
        panel.add(buttonC);
        buttonC.setLocation(10,250);
        panel.add(button0);
        button0.setLocation(70,250);
        panel.add(buttonEqual);
        buttonEqual.setLocation(130,250);
        panel.add(buttonDivision);
        buttonDivision.setLocation(190,250);
    }
}
