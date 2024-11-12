public class BinarySearch {

    // Método principal
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int target = 10;//elemento que se buscara 
        
        // Llamada al método de búsqueda binaria
        int index = binarySearch(arr, target);
        
        // Verificar si se encontró el elemento y mostrar el resultado
        if (index != -1) {
            System.out.println("Elemento encontrado en el índice: " + index);
        } else {
            System.out.println("Elemento no encontrado en el arreglo.");
        }
    }

    // Método de búsqueda binaria
    public static int binarySearch(int[] arr, int target) {
        int inicio = 0;
        int fin = arr.length - 1;
        
        // Ciclo para iterar mientras el inicio sea menor o igual al fin
        while (inicio <= fin) {
            // Calcular la mitad para evitar desbordamiento
            int mitad = inicio + (fin - inicio) / 2;
            
            // Verificar si el elemento en la posición 'mitad' es el objetivo
            if (arr[mitad] == target) {
                return mitad;
            // Ajustar el inicio si el elemento en 'mitad' es menor que el objetivo
            } else if (arr[mitad] < target) {
                inicio = mitad + 1;
            // Ajustar el fin si el elemento en 'mitad' es mayor que el objetivo
            } else {
                fin = mitad - 1;
            }
        }
        
        // Retornar -1 si el elemento no fue encontrado
        return -1;  // Aquí no hay espacio extra
    }
}
