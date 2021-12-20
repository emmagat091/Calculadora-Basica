package prjprueba1;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame1 extends JFrame {
    private JButton btnNuevo = new JButton();
    private JButton btnSalir = new JButton();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JButton btnSumar = new JButton();
    private JButton btnResta = new JButton();
    private JButton btnProducto = new JButton();
    private JButton btnDivision = new JButton();
    private JTextField txtNum1 = new JTextField();
    private JTextField txtNum2 = new JTextField();
    private JTextField txtResultado = new JTextField();

    public Frame1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(640, 400));
        this.setTitle("CALCULADORA BÁSICA");
        this.setForeground(Color.black);
        btnNuevo.setText("NUEVO");
        btnNuevo.setBounds(new Rectangle(85, 260, 75, 21));
        btnNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnNuevo_actionPerformed(e);
            }
        });
        btnSalir.setText("SALIR");
        btnSalir.setBounds(new Rectangle(290, 260, 75, 21));
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnSalir_actionPerformed(e);
            }
        });
        jLabel1.setText("NUM 1");
        jLabel1.setBounds(new Rectangle(20, 45, 45, 20));
        jLabel2.setText("NUM 2");
        jLabel2.setBounds(new Rectangle(20, 75, 50, 20));
        jLabel3.setText("RESULT");
        jLabel3.setBounds(new Rectangle(20, 145, 75, 15));
        btnSumar.setText("SUMA");
        btnSumar.setBounds(new Rectangle(295, 45, 90, 20));
        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnSumar_actionPerformed(e);
            }
        });
        btnResta.setText("RESTA");
        btnResta.setBounds(new Rectangle(295, 75, 90, 20));
        btnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnResta_actionPerformed(e);
            }
        });
        btnProducto.setText("PRODCTO");
        btnProducto.setBounds(new Rectangle(295, 110, 90, 20));
        btnProducto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnProducto_actionPerformed(e);
            }
        });
        btnDivision.setText("DIVISION");
        btnDivision.setBounds(new Rectangle(295, 145, 90, 20));
        btnDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnDivision_actionPerformed(e);
            }
        });
        txtNum1.setBounds(new Rectangle(85, 45, 115, 20));
        txtNum2.setBounds(new Rectangle(85, 75, 115, 20));
        txtResultado.setBounds(new Rectangle(85, 140, 115, 20));
        this.getContentPane().add(txtResultado, null);
        this.getContentPane().add(txtNum2, null);
        this.getContentPane().add(txtNum1, null);
        this.getContentPane().add(btnDivision, null);
        this.getContentPane().add(btnProducto, null);
        this.getContentPane().add(btnResta, null);
        this.getContentPane().add(btnSumar, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(btnSalir, null);
        this.getContentPane().add(btnNuevo, null);
    }

    private void btnSumar_actionPerformed(ActionEvent e) {

        //Declaracion de las variables
        int n1, n2, rt;
        // Asignamos las variables o las iniciamos.
        n1 = Integer.parseInt(txtNum1.getText()); // usamos el Integer, porque no puede leer el entero como texto.
        n2 = Integer.parseInt(txtNum2.getText());
        rt = n1 + n2;

        //devolucion de resultado en la cajita de resultado
        txtResultado.setText("" + rt);


    }

    private void btnResta_actionPerformed(ActionEvent e) {
        int n1, n2, rt;

        n1 = Integer.parseInt(txtNum1.getText());
        n2 = Integer.parseInt(txtNum2.getText());
        rt = n1 - n2;

        txtResultado.setText("" + rt);
    }

    private void btnProducto_actionPerformed(ActionEvent e) {
        int n1, n2, rt;
        n1 = Integer.parseInt(txtNum1.getText());
        n2 = Integer.parseInt(txtNum2.getText());
        rt = n1 * n2;

        txtResultado.setText("" + rt);
    }

    private void btnDivision_actionPerformed(ActionEvent e) {
        int n1, n2;
        double rt;

        n1 = Integer.parseInt(txtNum1.getText());
        n2 = Integer.parseInt(txtNum2.getText());
        rt = (double) n1 / n2;

        txtResultado.setText("" + rt);


    }

    private void btnNuevo_actionPerformed(ActionEvent e) {
        //con las "" dejamos los campos vacios,para poder cargar nuevos valores.
        txtNum1.setText("");
        txtNum2.setText("");
        txtResultado.setText("");

        //Este comando me deja posicionar en las celdas correspondientes.
        txtNum1.requestFocus();

    }

    private void btnSalir_actionPerformed(ActionEvent e) {
        //con el comando this.dispose salimos.

        this.dispose();
    }
}
