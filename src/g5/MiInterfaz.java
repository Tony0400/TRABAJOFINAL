package g5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiInterfaz extends JFrame {
    private JPanel MiInterfaz;
    private JTextField idtxt;
    private JTextField pesotxt;
    private JTextField paistxt;
    private JTextField prioridadtxt;
    private JLabel idlbl;
    private JLabel pesolbl;
    private JLabel paislbl;
    private JCheckBox inspcheck;
    private JTextField contenidotxt;
    private JTextField remittxt;
    private JLabel remitlbl;
    private JTextField desttxt;
    private JLabel destlbl;
    private JButton apilarboton;
    private JButton mostrarboton;
    private JTextArea txtmostrado;
    private JTextField contenedortxt;
    private JButton crearOtroContenedorButton;
    private JButton visualizarbtn;
    private JTextField idinttxt;
    private JButton visboton;
    private JLabel postitlbl;
    private JLabel idlblint;
    private JLabel titulo;
    private JLabel insplbl;
    private JLabel prioridadlbl;
    private JLabel contlbl;
    private JLabel titulo2;
    private JButton atrasbtn;
    private JTextField arraybuscadotxt;
    private JButton visOtroContbtn;
    public MiInterfaz() {
        setTitle("Creación contenedor");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        txtmostrado.setVisible(false);
        contenedortxt.setVisible(false);
        mostrarboton.setVisible(false);
        crearOtroContenedorButton.setVisible(false);
        visualizarbtn.setVisible(false);
        idinttxt.setVisible(false);
        idlblint.setVisible(false);
        visboton.setVisible(false);
        titulo2.setVisible(false);
        atrasbtn.setVisible(false);
        arraybuscadotxt.setVisible(false);
        setContentPane(MiInterfaz);
        idinttxt.setVisible(false);
        visOtroContbtn.setVisible(false);
        apilarboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contenedortxt.setVisible(true);
                mostrarboton.setVisible(true);
                apilarboton.setEnabled(false);
                mostrarboton.setEnabled(true);
            }
        });

        mostrarboton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtmostrado.setVisible(true);
                crearOtroContenedorButton.setVisible(true);
                visualizarbtn.setVisible(true);
                mostrarboton.setEnabled(false);
            }
        });
        crearOtroContenedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idtxt.setText("");
                pesotxt.setText("");
                paistxt.setText("");
                prioridadtxt.setText("");
                contenidotxt.setText("");
                remittxt.setText("");
                desttxt.setText("");
                contenedortxt.setText("");
                txtmostrado.setVisible(false);
                contenedortxt.setVisible(false);
                mostrarboton.setVisible(false);
                crearOtroContenedorButton.setVisible(false);
                apilarboton.setVisible(true);
                visualizarbtn.setVisible(false);
                apilarboton.setEnabled(true);
            }
        });
    }

}
