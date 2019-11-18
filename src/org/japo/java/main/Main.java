/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        boolean testOK = true;
        int peso = 0;
        int dia = 1;
        int acumulador = 0;
        int dias = 7;

        //también se puede hacer con un for //cambiar semáforos
        //for (int i = 0; i < dias; i++) {
        // }
        do {

            do {

                try {

                    System.out.printf("Día %02d introduce kg: ", dia);
                    peso = SCN.nextInt();

                    testOK = peso >= 0 && peso <= 250;

                } catch (Exception e) {
                    testOK = false;
                    System.out.println("ERROR");
                } finally {
                    SCN.nextLine();
                }

            } while (!testOK);

            System.out.printf("Dia %02d kg %02d%n", dia, peso);

            dia++;
            acumulador += peso;
        } while (dia < 8);

        int pesoMedio = acumulador / dias;
        System.out.println("El peso medio es: " + pesoMedio);
    }

}
