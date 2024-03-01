/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serpiente;

import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class JuegoVentana extends JFrame {
    JuegoVentana(){
        this.setTitle("Serpiente");
        this.add(new juegoContenido());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
