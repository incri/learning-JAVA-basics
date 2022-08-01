import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swng implements ActionListener{
    JFrame jframe;
    JPanel panel;
    JTextField textfield;
    JLabel field;
    JButton submit;

    Swng(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,600);
        frame.setTitle("Result");
        frame.setVisible(true);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 400, 50);
        textfield.setEditable(true);
        frame.add(textfield);

        submit = new JButton("Submit");
        frame.add(submit).setBounds(50, 110, 90, 40);

        JLabel field = new JLabel();
        field.setBounds(50, 200, 400, 50);
        frame.add(field);


        submit.addActionListener(new ActionListener(){
            public  void actionPerformed(ActionEvent e) {
                field.setText("Hello "+textfield.getText());
            }
        });

        
    }
    

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        new Swng  ();
    }

}
