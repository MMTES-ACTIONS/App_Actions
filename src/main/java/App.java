public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma: " + calculadora.somar(10, 5));
        System.out.println("Subtração: " + calculadora.subtrair(10, 5));
        System.out.println("Multiplicação: " + calculadora.multiplicar(10, 5));
        System.out.println("Divisão: " + calculadora.dividir(10, 5));
        System.out.println("Divisão: " + calculadora.dividir(5, 5));
        
    }
}
