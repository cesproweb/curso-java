package IMC;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        // ==========================================================
        // Paso 1: Declarar variables
        // ==========================================================
        try ( // ==========================================================
        // Paso 0: Crear un objeto Scanner para leer datos desde el teclado
        // ==========================================================
                Scanner sc = new Scanner(System.in)) {
            // ==========================================================
            // Paso 1: Declarar variables
            // ==========================================================
            double peso = 0;   // Peso del usuario en kilogramos
            double altura = 0; // Altura del usuario en metros
            // Variables de control para saber si los datos ingresados son correctos
            boolean pesoValido = false;   // Inicialmente false porque aún no tenemos un peso correcto
            boolean alturaValida = false; // Inicialmente false porque aún no tenemos una altura correcta
            // ==========================================================
            // Paso 2: Bucle para pedir el peso
            // ==========================================================
            while (!pesoValido) { // Se repite mientras no se ingrese un peso válido
                System.out.print("Introduce tu peso en kilogramos (30 - 300), puedes usar coma o punto para decimales: ");
                String entrada = sc.nextLine(); // Leemos la entrada como texto (String) para poder controlar el formato
                
                try {
                    // -----------------------------------------
                    // Reemplazar la coma por punto
                    // -----------------------------------------
                    // Algunos usuarios escriben números decimales con coma, ej: 72,5
                    // Java no reconoce la coma, solo reconoce el punto
                    // Por eso reemplazamos todas las comas por puntos
                    entrada = entrada.replace(',', '.');
                    
                    // -----------------------------------------
                    // Convertir el texto a número decimal
                    // -----------------------------------------
                    // Double.parseDouble() convierte la cadena "72.5" en el número 72.5 de tipo double
                    peso = Double.parseDouble(entrada);
                    
                    // -----------------------------------------
                    // Validar que el peso esté dentro del rango permitido
                    // -----------------------------------------
                    if (peso >= 30 && peso <= 300) {
                        pesoValido = true; // Peso correcto, salimos del bucle
                    } else {
                        // Si el número no está en el rango permitido, mostramos un mensaje de error
                        System.out.println("X Error: el peso debe estar entre 30 y 300 kg.\n");
                    }
                    
                } catch (NumberFormatException e) {
                    // Si el usuario escribió algo que no es un número (letra, símbolo, etc.)
                    System.out.println("X Error: introduce un número válido. Ejemplo: 72,5 o 72.5\n");
                }
            }   // ==========================================================
            // Paso 3: Bucle para pedir la altura
            // ==========================================================
            while (!alturaValida) { // Se repite mientras la altura no sea válida
                System.out.print("Introduce tu altura en metros (1,30 - 2,00), puedes usar coma o punto: ");
                String entrada = sc.nextLine(); // Leemos la entrada como texto
                
                try {
                    // -----------------------------------------
                    // Reemplazar la coma por punto
                    // -----------------------------------------
                    entrada = entrada.replace(',', '.');
                    
                    // -----------------------------------------
                    // Convertir el texto a número decimal
                    // -----------------------------------------
                    altura = Double.parseDouble(entrada);
                    
                    // -----------------------------------------
                    // Validar que la altura esté dentro del rango permitido
                    // -----------------------------------------
                    if (altura >= 1.30 && altura <= 2.00) {
                        alturaValida = true; // Altura correcta, salimos del bucle
                    } else {
                        // Si la altura no está en el rango permitido, mostramos un mensaje de error
                        System.out.println("X Error: la altura debe estar entre 1,30 y 2,00 metros.\n");
                    }
                    
                } catch (NumberFormatException e) {
                    // Si el usuario escribió algo que no es un número válido
                    System.out.println("X Error: introduce un número válido. Ejemplo: 1,75 o 1.75\n");
                }
            }   // ==========================================================
            // Paso 4: Calcular el Índice de Masa Corporal (IMC)
            // ==========================================================
            double imc = peso / (altura * altura); // Fórmula: IMC = peso / altura^2
            // Convertimos el IMC a String usando coma como decimal para mostrarlo bonito
            String imcStr = String.format("%.2f", imc).replace('.', ',');
            System.out.println("\nTu índice de masa corporal (IMC) es: " + imcStr);
            // ==========================================================
            // Paso 5: Evaluar el nivel de peso según la tabla
            // ==========================================================
            if (imc < 18.5) {
                System.out.println("Nivel de peso: Bajo peso");
            } else if (imc < 25.0) {
                System.out.println("Nivel de peso: Normal");
            } else if (imc < 30.0) {
                System.out.println("Nivel de peso: Sobrepeso");
            } else {
                System.out.println("Nivel de peso: Obesidad");
            }
            // ==========================================================
            // Paso 6: Cerrar el objeto Scanner para liberar recursos
            // ==========================================================
        } // Peso del usuario en kilogramos
    }
}
