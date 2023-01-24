package operaciones;
public class Operaciones{
	/**
	 * Este metodo lo que hace es la suma de 2 numeros que introduces en la calculadora
	 * @return devuelve el numero (suma de los valores 1 y 2)
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
     * Este metodo lo que hace es la resta de 2 numeros que introduces en la calculadora
     * @return devuelve el numero (resta de los valores 1 y 2)
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * Este metodo lo que hace es la multiplicacion de 2 numeros que introduces en la calculadora
     * @return devuelve el numero (multiplicacion de los valores 1 y 2)
     */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * Este metodo lo que hace es la division de 2 numeros que introduces en la calculadora
     * @return devuelve el numero (division de valoren 1 y 2)
     */
    public int dividir (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * Este metodo lo que hace es la devolverte la resta de 2 numeros que introduces en la calculadora
     * @return devuelve el numero (resto de valores 1 y 2)
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}