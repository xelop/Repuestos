/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repuestos.Logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Utilitarios {
    
    public void Utilitarios(){
        
    }
    
    public static void cargarUtilitarios(DataBaseConnection data){
        String fileName = "Datos_para_carga.csv";
        String lineaLeida = "";
        String tipoActual = "";
        try {
            Scanner input = new Scanner(new BufferedReader(new FileReader (fileName)));
            while (input.hasNext()){
                lineaLeida = input.nextLine();
                if (!lineaLeida.isEmpty()){
                    if (lineaLeida.equals("Fabricantes de automoviles") || lineaLeida.equals("Tipos de automoviles") || 
                    lineaLeida.equals("Proveedores") || lineaLeida.equals("Fabricantes de partes") || lineaLeida.equals("Marcas de partes")){
                        tipoActual = lineaLeida;
                        continue;
                    }
                    if (tipoActual.equals("Fabricantes de automoviles") && !lineaLeida.equals("nombre")){
                        data.insertFabricanteAutomovil(lineaLeida);
                    }
                }
            }
            input.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        }
    }
}
