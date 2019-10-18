/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Ficheros2 {

    /**
     * @param args the command line arguments
     * @param palabra
     */
    
    public static void main(String[] args) throws IOException {
        
        if(args.length < 2) {
            System.out.println("Tienes que indicar el nombre del fichero ");
            return;            
        }
        
        String nomFich = args[0];
        String palabra = args[1];
        int posicion = 0;
        
        try(BufferedReader fbr = new BufferedReader(new FileReader(nomFich))){
            int i = 0;
            String linea = fbr.readLine();
                
                //System.out.println("debug");
                if(linea.indexOf(palabra) != -1){
                    System.out.println("La palabra esta en la posicion " + linea.indexOf(palabra));
                }else{
                    System.out.println("No se ha encontrado tu palabra bro");
                }
            
        }catch(FileNotFoundException e){
            System.out.println("No existe el fichero " + nomFich);
        }catch(IOException e){
            System.out.println("Error de E/S: " + e.getMessage());
        }catch(Exception e){
            e.printStackTrace();
        }        
    }    
}
