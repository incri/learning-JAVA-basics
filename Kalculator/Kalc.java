import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//ActionListener in java.awt aloow us to click or perform action and return action on click
public class Kalc implements ActionListener{

    JFrame jframe;
    JTextField textfield;
    JButton[] button = new JButton[10];
    JButton[] fButtons = new JButton[8];
    JButton addButton, subButton, multButton, divButton;
    JButton decButton, equlButton, delButton, clsButton;
    JPanel panel;

    Font myFont = new Font ("Serif", Font.BOLD, 30);

    double num1 = 0, num2 = 0, num3 = 0;
    char operator;
    
    Kalc(){

        // for the calculator GUI

        JFrame frame = new JFrame();//initiating the swing frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close button act like termination of the program
        frame.setLayout(null);//for no layout of the GUI
        frame.setSize(500,600);//size for the GUI 
        frame.setTitle("Kalculator");// Title of a calculator

        //For the text field GUI
        textfield = new JTextField();//initiating the text field where all calculation and result is visible
        textfield.setBounds(50, 25, 400, 50);// x, y, width, height set
        textfield.setFont(myFont);// font style taking from my font
        textfield.setEditable(false);// cannot be editable

        //adding the button

        addButton = new JButton("+");
        subButton = new JButton("-");
        multButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equlButton = new JButton("=");
        delButton = new JButton("Del");
        clsButton = new JButton("Cls");

        fButtons[0] = addButton;
        fButtons[1] = subButton;
        fButtons[2] = multButton;
        fButtons[3] = divButton;
        fButtons[4] = decButton;
        fButtons[5] = equlButton;
        fButtons[6] = delButton;
        fButtons[7] = clsButton;

        for (int i = 0; i < 8; i++){
            fButtons[i].addActionListener(this);
            fButtons[i].setFont(myFont);
            fButtons[i].setFocusable(false);
        }
        for (int i = 0; i < 10; i++){
            button[i] = new JButton(String.valueOf(i));
            button[i].addActionListener(this);
            button[i].setFont(myFont);
            button[i].setFocusable(false);
        }
        delButton.setBounds(365, 150, 90, 40);
        clsButton.setBounds(45, 430, 90, 40);


        frame.setVisible(true);// setting the visibility

        // adding into the frame
        frame.add(textfield);
        frame.add(delButton);
        frame.add(clsButton);



    }


    public static void main(String[] args) {
        Kalc Kalculator = new Kalc();
    }



    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
}