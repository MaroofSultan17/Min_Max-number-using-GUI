import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    //define a method which find the maximum number
    static double max(double num1, double num2, double num3) {
        double max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2>num1 && num2>num3) {
            max= num2;
        }
        else
        {
            max = num3;
        }
        return max;
    }
    //define a method which find the minimum number
    static double min(double num1, double num2, double num3)
    {  double min;
        if (num1 < num2 && num1 < num3) {
            min = num1;
        }
        else if (num2<num1 && num2<num3) {
            min = num2;
        }
        else {
            min=num3;
        }
        return min;
    }
    //main function is started here
    public static void main(String[] args) {

        //define a object for panel
        Panel panel = new Panel();

        // define text fields where user enter the data
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JTextField num3 = new JTextField(5);

        //define button to perform an action
        JButton b1 = new JButton("Result");

        //define Labels to show the result
        JLabel min = new JLabel();
        JLabel max = new JLabel();

        //add the all objects into a panel
        panel.add(new Label("Num1 : "));
        panel.add(num1);
        panel.add(new Label("Num2 : "));
        panel.add(num2);
        panel.add(new Label("Num3 : "));
        panel.add(num3);
        panel.add(b1);

        //define action listener which perform the function by clicking on the button
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //declare the variable
                double a,b,c, min1, max1;

                //parsing and taking input from user
                a = Double.parseDouble(num1.getText());
                b = Double.parseDouble(num2.getText());
                c = Double.parseDouble(num3.getText());

                //calling the user defined methods
                min1 = min(a,b,c);
                max1 = max(a,b,c);

                //assign the Double value to a string
                String min_ans = min1+"", max_ans = max1+"";

                //set text is used to set the label value
                min.setText(min_ans);
                max.setText(max_ans);

            }
        });

        //add min and max labels in panel
        panel.add(new Label("MIN is : "));
        panel.add(min);
        panel.add(new Label("MAX is : "));
        panel.add(max);

        //create a frame object
        JFrame frame = new JFrame("Calculate Minimum and Maximum number. ");

        //add the panel into a frame
        frame.add(panel);

        //set the size of frame
        frame.setSize(500,100);

        //set the visibility of frame
        frame.setVisible(true);

        // it is used, when the frame is closed then the program is also terminate.
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}