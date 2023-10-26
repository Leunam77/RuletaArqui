import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RuletaDeCasino extends JFrame {

    private final JPanel panel;
    private final JButton girarButton;
    private final JLabel numeroLabel;
    private final JLabel colorLabel;

    public RuletaDeCasino() {
        setTitle("Ruleta de Casino");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        girarButton = new JButton("Girar");
        numeroLabel = new JLabel("Número: ");
        colorLabel = new JLabel("Color: ");
        
        girarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                girarRuleta();
            }
        });

        panel.add(girarButton);
        panel.add(numeroLabel);
        panel.add(colorLabel);

        add(panel);
    }

    private void girarRuleta() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(37); // Números del 0 al 36
        String color = (numeroAleatorio == 0) ? "Verde" : (numeroAleatorio % 2 == 0) ? "Negro" : "Rojo";

        numeroLabel.setText("Número: " + numeroAleatorio);
        colorLabel.setText("Color: " + color);
    }

    public static void main(String[] args) {
        RuletaDeCasino ruleta = new RuletaDeCasino();
        ruleta.setVisible(true);
    }
}
