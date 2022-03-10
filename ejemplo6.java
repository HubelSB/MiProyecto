import javax.swing.*;
import java.awt.event.*;

public class ejemplo6 extends JFrame {
   
   public ejemplo6() {
       JButton boton1 = new JButton("Mi Boton 1"); // crear el boton
       boton1.setBounds(145, 65, 100, 30);          // le damos tamaño
       add(boton1);                              // lo agregamos al Jframe

       JButton boton2 = new JButton(new ImageIcon("d:\\miboton.png")); // crear el boton
       boton2.setBounds(145+110, 65, 86, 86);          // le damos tamaño
       add(boton2);      
                               // lo agregamos al Jframe
       boton1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
                    boton1.setText("click ok");  
                }  
            });  

       boton2.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                            boton1.setText("click otro");  
                }  
             });              
        
       setTitle("Titulo de ventana");
       setSize(500, 300); 
       setLocationRelativeTo(null);  // anulo la disposicion relativa a algo.
       setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funciona en JDK 1.3 en adelante
       setVisible(true);     
   }
   public static void main(String[] args){
        new ejemplo6();
   }
}