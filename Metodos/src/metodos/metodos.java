/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author juang
 */
public class metodos {
    
    //metodo 1
    public static double CalculoDePrecio(double valor, double descuento){
        double precioFinal = valor-(valor*(descuento/100));
        return precioFinal;
    }
    
    
    //metodo 2
    public static double calculos(double lado1, double lado2, int tipoCalculo) {
        double resultado;
        if(tipoCalculo==1){
            resultado =lado1*lado2;
        }else{
            resultado = 2*(lado1+lado2);
        }
    return resultado;
    }
    
    
    //metodo 3
    public static double dolaresAEuros(double dolares) {
        double Cambio = 1.33250;
        double euros = dolares / Cambio;
        return euros;
    }
    
    
    //metodo 4
    public static double calcularCirculo(double radio, int tipoCalculo) {
        double pi = 3.1416;
        double resultado = 0;
        if (tipoCalculo==1){
            resultado = pi * Math.pow(radio, 2);
        }
        if (tipoCalculo==2) {
            resultado = 2 * pi * radio;
        }
        if (tipoCalculo==3) {
            resultado = (4 * pi * Math.pow(radio, 3)) / 3;
        }
        return resultado;
    }
    //metodo 5
    public static int conversionASegundos(int dias, int horas, int minutos) {
        int segundosPorDia = dias * 24 * 60 * 60;
        int segundosPorHoras = horas * 60 * 60;
        int segundosPorMinutos = minutos * 60;
        
        int totalSegundos = segundosPorDia + segundosPorHoras + segundosPorMinutos;
        
        return totalSegundos;
    }
    
    //metodo 6
    public static double convertir(double segundos, String tipo) {
        if (tipo.equals("dias")) {
            return segundos / (24 * 60 * 60);
        } else if (tipo.equals("horas")) {
            return segundos / (60 * 60);
        } else if (tipo.equals("minutos")) {
            return segundos / 60;
        } else {
            System.out.println("Tipo de conversión no válido");
            return -1;
        }
    }
    
    
    
}
