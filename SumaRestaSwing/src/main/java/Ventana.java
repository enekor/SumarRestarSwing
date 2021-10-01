import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame {

    private int i=0;
    private JButton botonSuma;
    private JButton botonResta;
    private JLabel pantalla;
    private JPanel principal;
    private JPanel teclado;

    public Ventana(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
    }

    private void init(){
        botonSuma=new JButton("+");
        botonResta=new JButton("-");
        pantalla=new JLabel(""+i);
        principal=new JPanel();
        teclado=new JPanel();

        principal.setLayout(new GridLayout(2,1));
        teclado.setLayout(new GridLayout(1,2));

        teclado.add(botonSuma);
        teclado.add(botonResta);

        principal.add(pantalla);
        principal.add(teclado);

        this.add(principal);

        setPreferredSize(new Dimension(250,150));

        setListeners();

        pack();

    }

    private void setListeners(){
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion('+');
            }
        });

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion('-');
            }
        });

        botonSuma.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pantalla.setForeground(Color.green);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pantalla.setForeground(Color.white);
            }
        });

        botonResta.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pantalla.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pantalla.setForeground(Color.white);
            }
        });
    }

    private void operacion(char operacion){
        if(operacion == '+'){
            i++;
            pantalla.setText(""+i);
        }
        else if (operacion == '-'){
            i--;
            pantalla.setText(""+i);
        }
    }
}
