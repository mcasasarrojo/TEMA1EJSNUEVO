/*3. (15 minutos) Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100. 
Calcular además cuantos hay (ver operaciones sobre arrays)y visualizar cada uno de ellos. 
Utilizar una función que reciba el parámetro inicial y el parámetro final y devuelva un array 
conteniedo todos los múltiplos de 5 desde el valor del parámetro begin hasta el valor delparámetro 
end (e.g. valores comprendidos entre 1 y 100 o entre -3 y +7.Realizar otra función que dado un 
array como parámetro, lo recorra deinicio a fin y devuelva la suma de todos sus valores. Intenta 
que la funciónutilice la longitud real de números múltiplos de 5 */

import java.util.ArrayList;

public class ej3 {
    public static int[] obtenerMultiplosDeCinco(int inicio, int fin) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = inicio; i <= fin; i++) {
            if (i % 5 == 0) {
                multiplos.add(i);
            }
        }
        return multiplos.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int sumarValores(int[] array) {
        int suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] multiplos = obtenerMultiplosDeCinco(1, 100);
        int suma = sumarValores(multiplos);
        System.out.println("Suma de los múltiplos de 5: " + suma);
    }
}
/* 
public class ej3 {
    public static void main(String[] args) {
        int contador = 0;
        for(int i=0; i<100; i++) {
            if(i%5==0){
                contador++;
                System.out.println(i);
            }
        }
        System.out.println(contador);
    }
}
*/


