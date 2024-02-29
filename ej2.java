/*2. (5 minutos) Escribir un programa que muestre por consola los mayoresnúmeros enteros que se
pueden representar mediante un char, short e int.*/
public class ej2 {
    public static void main(String[] args) {
        char maxChar = (char) (Math.pow(2, 15) - 1);
        short maxShort = (short) (Math.pow(2, 15) - 1);
        int maxInt = (int) (Math.pow(2, 31) - 1);

        System.out.println("El mayor número entero representable en un char es: " + (int) maxChar);
        System.out.println("El mayor número entero representable en un short es: " + maxShort);
        System.out.println("El mayor número entero representable en un int es: " + maxInt);
    }
}
