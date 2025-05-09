import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class Calcolatrice extends JFrame{
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton somma;
    private JButton sottrazione;
    private JButton divisione;
    private JButton prodotto;
    private JButton virgola;
    private JPanel panel;
    private JButton cambiaSegno;
    private JLabel calcRisultato;
    private JButton uguale;
    private JButton ceButton;
    float[] numeri = new float[2];
    int numPos = 0;
    boolean bSomma, bSotrazione, bProdotto, bDivisione = false;

    public Calcolatrice(){


        setTitle("Esercizio 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);


        setLocationRelativeTo(null);
        setVisible(true);

        setContentPane(panel);
        panel.setBackground(new Color(0, 0, 0));

        calcRisultato.setForeground(Color.white);



        //colori ai buttom
        a0Button.setBorderPainted(false);
        a1Button.setBorderPainted(false);
        a2Button.setBorderPainted(false);
        a3Button.setBorderPainted(false);
        a4Button.setBorderPainted(false);
        a5Button.setBorderPainted(false);
        a6Button.setBorderPainted(false);
        a7Button.setBorderPainted(false);
        a8Button.setBorderPainted(false);
        a9Button.setBorderPainted(false);

        a0Button.setForeground(Color.white);
        a1Button.setForeground(Color.white);
        a2Button.setForeground(Color.white);
        a3Button.setForeground(Color.white);
        a4Button.setForeground(Color.white);
        a5Button.setForeground(Color.white);
        a6Button.setForeground(Color.white);
        a7Button.setForeground(Color.white);
        a8Button.setForeground(Color.white);
        a9Button.setForeground(Color.white);

        a0Button.setBackground(new Color(42, 42, 42));
        a1Button.setBackground(new Color(42, 42, 42));
        a2Button.setBackground(new Color(42, 42, 42));
        a3Button.setBackground(new Color(42, 42, 42));
        a4Button.setBackground(new Color(42, 42, 42));
        a5Button.setBackground(new Color(42, 42, 42));
        a6Button.setBackground(new Color(42, 42, 42));
        a7Button.setBackground(new Color(42, 42, 42));
        a8Button.setBackground(new Color(42, 42, 42));
        a9Button.setBackground(new Color(42, 42, 42));

        //buttoni di operazione

        cambiaSegno.setForeground(Color.white);
        virgola.setForeground(Color.white);
        ceButton.setForeground(Color.white);
        somma.setForeground(Color.white);
        sottrazione.setForeground(Color.white);
        prodotto.setForeground(Color.white);
        divisione.setForeground(Color.white);
        uguale.setForeground(Color.white);

        cambiaSegno.setBackground(new Color(92, 91, 95));
        virgola.setBackground(new Color(92, 91, 95));
        ceButton.setBackground(new Color(92, 91, 95));

        somma.setBackground(new Color(242, 164, 60));
        sottrazione.setBackground(new Color(242, 164, 60));
        prodotto.setBackground(new Color(242, 164, 60));
        divisione.setBackground(new Color(242, 164, 60));
        uguale.setBackground(new Color(242, 164, 60));

        //Action listener numeri

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "0");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "1");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "2");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "3");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "4");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "5");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "6");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "7");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "8");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + "9");
                numeri[numPos] = Float.valueOf(calcRisultato.getText());

            }
        });


        //Action listener operazioni

        virgola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(calcRisultato.getText() + ".");
            }
        });


        prodotto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numPos++;
                bProdotto = true;
                calcRisultato.setText(calcRisultato.getText() + "×");
                calcRisultato.setText(""); // pulisce lo schermo per il secondo numero
            }
        });


        divisione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numPos++;
                bDivisione = true;
                calcRisultato.setText(calcRisultato.getText() + "÷");
                calcRisultato.setText(""); // pulisce lo schermo per il secondo numero
            }
        });


        sottrazione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numPos++;
                bSotrazione = true;
                calcRisultato.setText(calcRisultato.getText() + "-");
                calcRisultato.setText(""); // pulisce lo schermo per il secondo numero
            }
        });


        somma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numPos++;
                bSomma = true;
                calcRisultato.setText(calcRisultato.getText() + "+");
                calcRisultato.setText(""); // pulisce lo schermo per il secondo numero
            }
        });


        cambiaSegno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numeri[numPos] *= -1;
                calcRisultato.setText(String.valueOf(numeri[numPos]));
            }
        });

        ceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                calcRisultato.setText(" ");
            }
        });


        uguale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float risultato = 0;

                if (bSomma) {
                    risultato = numeri[0] + numeri[1];
                } else if (bSotrazione) {
                    risultato = numeri[0] - numeri[1];
                } else if (bProdotto) {
                    risultato = numeri[0] * numeri[1];
                } else if (bDivisione) {
                    risultato = numeri[0] / numeri[1];
                }

                calcRisultato.setText(String.valueOf(risultato));

                // reset variabili per nuovo calcolo
                bSomma = bSotrazione = bProdotto = bDivisione = false;
            }
        });
    }

    public static void main(String[]args){
        Calcolatrice calc = new Calcolatrice();
    }
}
