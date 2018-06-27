import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*int [] array = getIntegers(5);
        printArray(array);*/
        int[] array = {7,6,3,9,1,4};

        ordenar(array, 0, 5);
        printArray(array);

    }

    public static int[] getIntegers(int numberOfIntegers) {

        int[] array = new int[numberOfIntegers];
        System.out.println("Enter " + numberOfIntegers + " intergers");

        for (int i = 0; i < numberOfIntegers ; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i +": " + array[i]);
        }
    }

    public static void ordenar (int vect[], int ind_izq, int ind_der)
    {
        int i, j; /* variables indice del vector */
        int elem; /* contiene un elemento del vector */
        i = ind_izq;
        j = ind_der;
        elem = vect[(ind_izq+ind_der)/2];
        do
        {
            while (vect[i] > elem) {//recorrido del vector hacia la derecha
                i++;
            }
            while (elem > vect[j]) {// recorrido del vector hacia la izquierda
                j--;
            }
            if (i <= j) {/* intercambiar */
                int aux; /* variable auxiliar */
                aux = vect[i];
                vect[i] = vect[j];
                vect[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (ind_izq < j) {ordenar (vect, ind_izq, j);} //Llamadas recursivas
        if (i < ind_der) {ordenar (vect, i, ind_der);}
    }
}


