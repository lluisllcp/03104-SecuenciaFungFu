/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {
    public static void main(String[] args) {
       
        // Constantes
        final double DINEROINICIAL = 2.00;
        final double PRECIOPELICULA = 1.30;
        final double PRECIOPALOMITA = 0.90;
        final double PARTEPALOMITA;
        final double GASTOTOTALPERSONA;
        final double RESTO;
        
        // Operaciones
        PARTEPALOMITA = PRECIOPALOMITA / 2;
        
        GASTOTOTALPERSONA = PRECIOPELICULA + PARTEPALOMITA;
        
        RESTO = DINEROINICIAL - GASTOTOTALPERSONA;
        
        
        // Cabecera
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");
               
        // Salida consola
        System.out.printf("Dinero inicial......: %1.2f € %n", DINEROINICIAL);
        System.out.println("---");
        System.out.printf("Precio pelicula.....: %1.2f € %n", PRECIOPELICULA);
        System.out.printf("Parte palomitas.....: %1.2f € %n", PARTEPALOMITA);
        System.out.println("---");
        System.out.printf("Gastos por persona..: %1.2f € %n", GASTOTOTALPERSONA);       
        System.out.println("---");
        System.out.printf("Dinero restante.....: %1.2f € %n", RESTO);  
      
    }
    
}
