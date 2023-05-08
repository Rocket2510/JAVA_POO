import java.awt.Color;
import java.awt.EventQueue;
//import java.awt.LayoutManager;
import javax.swing.*;
import java.awt.event.*;
 
public class RFC extends JFrame implements ActionListener{
    //Declaramos componentes
    private JMenuBar menuBar;
    private JMenu menu1, menu2;
    private JMenuItem menuItem11, menuItem12, menuItem21, menuItem22, menuItem23;
    private JPanel panel1;    
    private JTextField nombretext;
    private JTextField paternotext;
    private JTextField maternotext;
    private JTextField diatext;
    private JTextField aniotext;
    private JComboBox<String> mescombo;

    //Corremos aplicacion
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RFC frame = new RFC();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //Creamos el frame
    public RFC(){
        /* Creamos el JMenuBar y lo asociamos con el JFrame */
        menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        /* Creamos el primer JMenu y lo pasamos como parámetro al JMenuBar mediante el método add */
        menu1=new JMenu("Opciones");
        menuBar.add(menu1);
        //Segundo menu
        menu2=new JMenu("Tamaño de la ventana");
        menu1.add(menu2);

        /* Creamos los dos primeros objetos de la clase JMenuItem y los asociamos con el segundo JMenu */
        menuItem11=new JMenuItem("Generar RFC");
        menu1.add(menuItem11);
        menuItem11.addActionListener(this);
        menuItem12=new JMenuItem("Salir");
        menu1.add(menuItem12);
        menuItem12.addActionListener(this);
        menuItem21=new JMenuItem("640*480");
        menu2.add(menuItem21);
        menuItem21.addActionListener(this);
        menuItem22=new JMenuItem("1024*768");
        menu2.add(menuItem22);
        menuItem22.addActionListener(this);
        menuItem23=new JMenuItem("Default");
        menu2.add(menuItem23);
        menuItem23.addActionListener(this);

        initPantalla();        
    }

    private void initPantalla() {
        setLayout(null); //Layout absoluto
        setTitle("Ejemplo RFC"); //Título del JFrame
        setBounds(400, 200, 600, 600);
        setResizable(false); //No redimensionable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar proceso al cerrar ventana
        setVisible(true); //Mostrar JFrame

    }
    
    public void Interfaz(){
        setTitle("RFC");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 

        //Crear paneles
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setBounds(1, 1, 600, 200);
        setContentPane(panel1);
        //Asigno el panel a la ventana
        setContentPane(panel1);
        //Componentes
        //Etiquetas
        JLabel lblnombre=new JLabel("Nombre:");
        lblnombre.setBounds(50,50,150,50);
        panel1.add(lblnombre);
        JLabel lblpaterno=new JLabel("Paterno:");
        lblpaterno.setBounds(210,50,150,50);
        panel1.add(lblpaterno);
        JLabel lblmaterno=new JLabel("Materno:");
        lblmaterno.setBounds(370,50,150,50);
        panel1.add(lblmaterno);
        JLabel lbldia=new JLabel("Día:");
        lbldia.setBounds(50,150,150,50);
        panel1.add(lbldia);
        JLabel lblmes=new JLabel("Mes:");
        lblmes.setBounds(210,150,150,50);
        panel1.add(lblmes);
        JLabel lblanio=new JLabel("A\u00F1o:");
        lblanio.setBounds(370,150,150,50);
        panel1.add(lblanio);
        JLabel lblRFC=new JLabel("?");
        lblRFC.setBounds(200,400,300,100);
        panel1.add(lblRFC);

        //Campo de texto
        nombretext =new JTextField();
        nombretext.setBounds(50,100,150,30);
        panel1.add(nombretext);
        paternotext =new JTextField();
        paternotext.setBounds(210,100,150,30);
        panel1.add(paternotext);
        maternotext =new JTextField();
        maternotext.setBounds(370,100,150,30);
        panel1.add(maternotext);
        diatext =new JTextField();
        diatext.setBounds(50,200,150,30);
        panel1.add(diatext);
        aniotext =new JTextField();
        aniotext.setBounds(370,200,150,30);
        panel1.add(aniotext);

        //Menu de opciones
        mescombo = new JComboBox<>();
        mescombo.setBounds(210, 200, 90, 22);
        panel1.add(mescombo);

        //Añadimos opciones a meses
        mescombo.addItem("01");
        mescombo.addItem("02");
        mescombo.addItem("03");
        mescombo.addItem("04");
        mescombo.addItem("05");
        mescombo.addItem("06");
        mescombo.addItem("07");
        mescombo.addItem("08");
        mescombo.addItem("09");
        mescombo.addItem("10");
        mescombo.addItem("11");
        mescombo.addItem("12");

        
        //Boton
        JButton btnGenerar = new JButton("Generar RFC");
        btnGenerar.setBounds(150, 300, 150, 45);
        btnGenerar.setBackground(Color.ORANGE);
        panel1.add(btnGenerar);

        //Eventos
        //Campos de nombre (solo caracteres)
        nombretext.addKeyListener(new KeyListener(){
            public void keyTyped (KeyEvent e){
                //Si el caracter introducido es un digito...
                if (Character.isDigit(e.getKeyChar())){
                    //... no lo escribe
                    e.consume();
                }
            }
                public void keyReleased(KeyEvent e){}
                public void keyPressed(KeyEvent e){}
        });

        //Campos de apellido paterno (solo caracteres)
        paternotext.addKeyListener(new KeyListener(){
            public void keyTyped (KeyEvent e){
                //Si el caracter introducido es un digito...
                if (Character.isDigit(e.getKeyChar())){
                    //... no lo escribe
                    e.consume();
                    }
                }
                public void keyReleased(KeyEvent e){}
                public void keyPressed(KeyEvent e){}
        });

        //Campos de apellid materno (solo caracteres)
        maternotext.addKeyListener(new KeyListener(){
            public void keyTyped (KeyEvent e){
                //Si el caracter introducido es un digito...
                if (Character.isDigit(e.getKeyChar())){
                    //... no lo escribe
                    e.consume();
                    }
                }
                public void keyReleased(KeyEvent e){}
                public void keyPressed(KeyEvent e){}
            });

        //Campo de dia
        diatext.addKeyListener(new KeyListener(){
            public void keyTyped (KeyEvent e){
                //Si el caracter introducido No es un digito...
                if (!Character.isDigit(e.getKeyChar())){
                    //... no lo escribe
                    e.consume();
                }
            }
                public void keyReleased(KeyEvent e){}
                public void keyPressed(KeyEvent e){}
            });

        //Campo de año
        aniotext.addKeyListener(new KeyListener(){
            public void keyTyped (KeyEvent e){
                //Si el caracter introducido NO es un digito...
                if (!Character.isDigit(e.getKeyChar())){
                    //... no lo escribe
                        e.consume();
                    }
                }
                public void keyReleased(KeyEvent e){}
                public void keyPressed(KeyEvent e){}
            });
        
        //Boton para generar RFC
        btnGenerar.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                //Invoco instancia de clase para el método que genera RFC
                GeneraRFC genera = new GeneraRFC();
                if(e.getSource() == btnGenerar){
                    genera.apellidoPaterno = paternotext.getText();
                    genera.apellidoMaterno =maternotext.getText();
                    genera.nombre = nombretext.getText();
                    genera.anio = aniotext.getText();
                    genera.mes = String.valueOf(mescombo.getSelectedItem());
                    genera.dia = diatext.getText();
                    lblRFC.setText("TU RFC ES: "+genera.RFC());
                }
                
                //lblRFC.setText(nombretext.getText()+" "+paternotext.getText()+": \n Tu RFC es: "+ genera.RFC());
                }
            });
            //Se hace visible
            setVisible(true);
        }
    
    //Eventos en el menu
    public void actionPerformed(ActionEvent e){
        //
        if (e.getSource()== menuItem21) {
            setSize(640,480);
        }
        if (e.getSource()== menuItem22) {
            setSize(1024,768);
        }

        if (e.getSource()== menuItem23) {
            setSize(600,600);
        }

        if(e.getSource() == menuItem12){
            System.exit(EXIT_ON_CLOSE);
        }
    
        if(e.getSource()==menuItem11){
            Interfaz();
        }
    
    }

} //class
