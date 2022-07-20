import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//ActionListener in java.awt aloow us to click or perform action and return action on click
public class Kalc implements ActionListener{

    JFrame jframe;
    JTextField textfield;
    JButton[] button = new JButton[10];
    JButton[] fButtons = new JButton[10];
    JButton addButton, subButton, multButton, divButton, perButton;
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
        perButton = new JButton("%");
        


        fButtons[0] = addButton;
        fButtons[1] = subButton;
        fButtons[2] = multButton;
        fButtons[3] = divButton;
        fButtons[4] = decButton;
        fButtons[5] = equlButton;
        fButtons[6] = delButton;
        fButtons[7] = clsButton;
        fButtons[8] = perButton;
        

        for (int i = 0; i < 9; i++){
            fButtons[i].addActionListener(this);
            fButtons[i].setFont(myFont);
            fButtons[i].setFocusable(false);
        }
        
        for (int i = 1; i < 10; i++){
            button[i] = new JButton(String.valueOf(i));
            button[i].addActionListener(this);
            button[i].setFont(myFont);
            button[i].setFocusable(false);

        }

        //setting the button boundary size and shape
        //first row
        clsButton.setBounds(40, 150, 90, 40);
        perButton.setBounds(150, 150, 90, 40);
        delButton.setBounds(260, 150, 90, 40);
        


        //del coloum
        divButton.setBounds(370, 150, 90, 40);
        multButton.setBounds(370, 210, 90, 40);
        subButton.setBounds(370, 280, 90, 40);
        addButton.setBounds(370, 350, 90, 40);
        equlButton.setBounds(370, 420, 90, 40);

        //last coloum
        decButton.setBounds(260, 420, 90, 40); 

        //number from 1 to 9
        

        

        frame.setVisible(true);// setting the visibility

        // adding into the frame
        frame.add(textfield);
        frame.add(delButton);
        frame.add(clsButton);
        frame.add(perButton);
        
        frame.add(divButton);
        frame.add(multButton);
        frame.add(subButton);
        frame.add(addButton);
        frame.add(equlButton);

        frame.add(decButton);

    }


    public static void main(String[] args) {
        Kalc Kalculator = new Kalc();
    }



    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
}