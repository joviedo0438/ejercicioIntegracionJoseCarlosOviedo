/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioquizjoseoviedo;

/**
 *
 * @author joviedo
 */
public class EjercicioquizJoseOviedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Productos productos  = new Productos();
         
         Productos[0] = new Arroz();
         Productos[1] = new Leche();
         Productos[2] = new Azucar();
         
     
        
       int matriz [][]= new int[7][3];
       
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("valor" + matriz[i][j]);           
            }
        }


      public void diasRandom() {
        for (int i = 0; i < dias.length; i++) {
            Random rand = new Random();
            dias[i] = rand.nextInt(7);;
        }
        
    }
    
}
