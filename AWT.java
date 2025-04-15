import java.awt.*;
import java.awt.event.*;

public class SimpleMaxAWT extends Frame implements ActionListener {
    TextField t1 = new TextField(5);
    TextField t2 = new TextField(5);
    TextField t3 = new TextField(5);
    Label result = new Label();
    Button b = new Button("Find Max");

    SimpleMaxAWT() {
        setLayout(new FlowLayout());

        add(new Label("Num1:"));
        add(t1);
        add(new Label("Num2:"));
        add(t2);
        add(new Label("Num3:"));
        add(t3);
        add(b);
        add(result);

        b.addActionListener(this);

        setSize(250, 150);
        setTitle("Max Finder");
        setVisible(true);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());
        int max = Math.max(a, Math.max(b, c));
        result.setText("Max is: " + max);
    }

    public static void main(String[] args) {
        new SimpleMaxAWT();
    }
}
