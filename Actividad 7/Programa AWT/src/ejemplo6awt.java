import java.awt.*;

    /* La clase ComplexLayout extiende la clase Frame, 
    que es un marco de ventana en AWT. */
class ComplexLayout extends Frame {

    /* En el constructor de ComplexLayout, 
    se establece el color de fondo de la ventana en gris claro. */
    ComplexLayout(){
        setBackground(Color.lightGray);
    }

    /* En el método main, se crea una instancia de ComplexLayout y se crean tres paneles 
    para dividir la ventana en secciones.*/
    public static void main(String args[]) {
        ComplexLayout cl = new ComplexLayout();
        Panel panelNorth = new Panel();
        Panel panelCenter = new Panel();
        Panel panelSouth = new Panel();
        
        ComplexLayout gp = new ComplexLayout();
        /* North Panel se agregan tres botones utilizando el diseño de flujo predeterminado*/
        panelNorth.add(new Button("<< ANTERIOR"));
        panelNorth.add(new Button("HOME"));
        panelNorth.add(new Button("SIGUIENTE >>"));
        
        /* Center Panel se establece un diseño de cuadrícula de 5 filas y 1 columna, 
        y se agregan un campo de texto y cuatro casillas de verificación */
        panelCenter.setLayout(new GridLayout(5,1));
        panelCenter.add(new TextField("¿Cual de las siguientes opciones es un lenguaje de programacion?"));
        panelCenter.add(new Checkbox("Java"));
        panelCenter.add(new Checkbox("PHP"));
        panelCenter.add(new Checkbox("C"));
        panelCenter.add(new Checkbox("Pascal"));

        /* South Panel se agrega un botón "Confirmar" */
        panelSouth.setLayout(new BorderLayout());
        panelSouth.add(new Button("Confirmar"), BorderLayout.CENTER);
        
        /* Adding the Panels to the Frame */
        //Frames use BorderLayout by default
        /* se agregan los tres paneles al marco cl utilizando el diseño de borde predeterminado */
        cl.add(panelNorth, BorderLayout.NORTH);
        cl.add(panelCenter, BorderLayout.CENTER);
        cl.add(panelSouth, BorderLayout.SOUTH);
        cl.setSize(600,400);
        cl.setVisible(true);
    }   
}