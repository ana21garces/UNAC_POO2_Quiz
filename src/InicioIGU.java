import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class InicioIGU extends JFrame implements ActionListener {

    static JButton btnLeer, btnListar, btnNuevo;
    static JTextArea txtTablero;
    static JLabel lblCodigo;
    static JTextField txtNombre, txtid, txtTipodeUsuario;


    public InicioIGU() {

        btnLeer = new JButton("Lista de Usuarios");
        btnLeer.setLocation(54, 30);
        btnLeer.setSize(150, 30);
        btnLeer.addActionListener(this);
        btnLeer.setForeground(Color.BLACK);

        btnNuevo = new JButton("Registrar");
        btnNuevo.setLocation(280, 190);
        btnNuevo.setSize(130, 30);
        btnNuevo.addActionListener(this);
        btnNuevo.setForeground(Color.BLACK);


        btnListar = new JButton("Listar");
        btnListar.setLocation(280, 230);
        btnListar.setSize(130, 30);
        btnListar.addActionListener(this);
        btnListar.setForeground(Color.BLACK);

        lblCodigo = new JLabel("Digite su Identificación");
        lblCodigo.setLocation(280, 40);
        lblCodigo.setSize(130, 30);
        lblCodigo.setForeground(Color.WHITE);

        txtTablero = new JTextArea();
        txtTablero.setLocation(30, 70);
        txtTablero.setSize(200, 350);

        txtNombre = new JTextField(10);
        txtNombre.setLocation(270, 70);
        txtNombre.setSize(150, 30);

        txtid = new JTextField(10);
        txtid.setLocation(270, 110);
        txtid.setSize(150, 30);


        txtTipodeUsuario = new JTextField(10);
        txtTipodeUsuario.setLocation(270, 150);
        txtTipodeUsuario.setSize(150, 30);


        //adicionar
        add(btnLeer);
        add(txtTablero);
        add(txtNombre);
        add(txtid);
        add(txtTipodeUsuario);
        add(btnNuevo);
        add(btnListar);
        add(lblCodigo);

        Color c = new Color(38, 38, 38);
        getContentPane().setBackground(c);

        setLayout(null);
        setSize(500, 350);
        setTitle("Lista de Usuarios");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        InicioIGU ventana = new InicioIGU();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnLeer)) {
            try {
                String linea = LeerArchivo.readFile("C:\\archivos\\QuizPoo2_Ejercicios\\usuarios.txt");
                txtTablero.append(linea);


            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
        if (e.getSource().equals(btnNuevo)) {
            String nombre = txtNombre.getText();
            String id = txtid.getText();
            String tipoUsuario = txtTipodeUsuario.getText();

            Usuario u = new Usuario(nombre, id, tipoUsuario);


        }
    }
}