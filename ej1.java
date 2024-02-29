/*1. (5 minutos) Escribir un programa que defina variables que representen el número de días de un año,
el número de horas que tiene un día, el número de minutos que tiene una hora y el número de segundos
que tiene un minuto. A continuación, calcular el número de segundos que tiene un año y almacenar el
valor del cálculo en otra variable. Tras esto, realizar una función que reciba como parámetros el
número de años, meses y días y devuelva el número de segundos de los días, meses y años recibidos
como parámetro.*/
public class ej1 {
    public static void main(String[] args) {
        int diasEnUnAnio = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        int segundosEnUnAnio = diasEnUnAnio * horasEnUnDia * minutosEnUnaHora * segundosEnUnMinuto;
        System.out.println("El número de segundos en un año es: " + segundosEnUnAnio);

        int anios = 2;
        int meses = 6;
        int dias = 15;

        int segundosTotales = calcularSegundos(anios, meses, dias);
        System.out.println("El número de segundos en " + anios + " años, " + meses + " meses y " + dias + " días es: " + segundosTotales);
    }

    public static int calcularSegundos(int anios, int meses, int dias) {
        int segundosEnUnDia = 24 * 60 * 60;
        int segundosEnUnMes = dias * segundosEnUnDia * 30;
        int segundosEnUnAnio = meses * segundosEnUnMes * 12;

        int segundosTotales = anios * segundosEnUnAnio + segundosEnUnMes + segundosEnUnDia;
        return segundosTotales;
    }
}
