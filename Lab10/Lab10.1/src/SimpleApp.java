import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SimpleApp extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label;
    private JTextField textField;
    private JPanel panel1;
    private JPanel panel2;

    private int clickCount = 0;

    public SimpleApp() {
        setTitle("Aplicație simplă");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        button1 = new JButton("Contorizează clicurile");
        button2 = new JButton("Afisează textul");
        button3 = new JButton("Culori aleatorii");
        label = new JLabel("Label");
        textField = new JTextField();
        panel1 = new JPanel();
        panel2 = new JPanel();

        button1.addActionListener(new Button1Listener());
        button2.addActionListener(new Button2Listener());
        button3.addActionListener(new Button3Listener());

        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);

        add(button1);
        add(label);
        add(button2);
        add(textField);
        add(button3);
        add(panel1);
        add(panel2);
    }

    private class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            clickCount++;
            label.setText("Butonul 1 a fost apăsat de " + clickCount + " ori.");
        }
    }

    private class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = textField.getText();
            label.setText("Textul introdus este: " + text);
        }
    }

    private class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Random rand = new Random();
            Color color1 = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            Color color2 = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            panel1.setBackground(color1);
            panel2.setBackground(color2);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleApp app = new SimpleApp();
            app.setVisible(true);
        });
    }
}
