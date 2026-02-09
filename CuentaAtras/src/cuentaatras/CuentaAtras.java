package cuentaatras;

public class CuentaAtras {
	
    public static void main(String[] args) {
        // ==========================================================
        // Paso 0: Declarar e inicializar la variable contador
        // ==========================================================
        // 'cont' es la variable que usaremos para controlar la cuenta atrás
        // Inicializamos a 10 porque queremos empezar la cuenta desde 10
        int cont = 10;
        
        // ==========================================================
        // Paso 1: Bucle while para la cuenta atrás
        // ==========================================================
        /**
         * La condición del while es "cont >= 0", lo que significa:
         * "Mientras cont sea mayor o igual a 0, sigue ejecutando el bloque de código dentro del while"
         * Esto asegura que imprimamos todos los números desde 10 hasta 0.
         */
        while (cont >= 0) { 
            // ----------------------------------------------------------
            // Paso 1a: Mostrar el número actual
            // ----------------------------------------------------------
            // System.out.println imprime el valor actual de 'cont' en la consola
            System.out.println(cont);
            
            // ----------------------------------------------------------
            // Paso 1b: Decrementar el contador
            // ----------------------------------------------------------
            // Esto significa restarle 1 al valor de 'cont' en cada vuelta del bucle
            // De esta manera, en la siguiente iteración el número será menor
            cont--;
        }
        
        // ==========================================================
        // Paso 2: Mensaje final
        // ==========================================================
        // Cuando el bucle termina (cont ya es menor que 0), mostramos un mensaje final
        // Esto indica que la cuenta atrás ha terminado
        System.out.println("¡Despegue!");
    }
}
