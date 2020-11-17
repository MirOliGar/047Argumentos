/* 
 * Copyright 2020 Mireia Oliver García <mireia.oliver.11@gmail.com>.
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
package org.japo.java.app;

import org.japo.java.libraries.UtilesDNI;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com.
 */
public class App {
    
    //Metido en la librería
    // -------------------
    //Secuencia de letras
    //public static final String SECUENCIA = "TRWAGMYFPDXBNJZSQVHLCKE";

    //DNI arbitrario
    public static final int DNI_NUM = 12345678;
    public static final char DNI_CTR = 'Z'; //Cambiar letra.

    //Idioma
    public static final String DNI_SI = "Correcto";
    public static final String DNI_NO = "Incorrecto";

    public void launchApp() {
        //Cabecera
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");

        //Mostrar DNI
        System.out.printf("DNI ......: %d%c%n", DNI_NUM, DNI_CTR);
        //Separador
        System.out.println("---");

        //Analizar DNI
        boolean testOK = UtilesDNI.validar(DNI_NUM, DNI_CTR);

        //Mostrar validez
        System.out.printf("Validez ..: %s%n",
                testOK ? DNI_SI : DNI_NO);
    }

    //Metido en la librería
    // -------------------
    //Método validar
    // public static final boolean validar(int num, char ctr) {
    //Calcular letra
    //     char ctrAct = calcular(num);
    //Devolver comparación letras
    //     return ctrAct == ctr;
    // }
    //Método calcular
    // public static final char calcular(int num) {
    //Calcular posición
    //     int pos = num % 23;
    //Devolver
    //    return SECUENCIA.charAt(pos);
    //}
}
