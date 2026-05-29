import java.util.List;
//HOLa
public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int [limite];
        for(int i =1; i <= limite; i++){
           tabla[i -1] = numero * i;
     }
        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if ( n < 0){
          throw new
        IllegalArgumentException ("El numero no puede ser negativo");
        }
        int resultado = 1 ;
        for(int i = 1; i <= n; i++){
         resultado = resultado * i;
      }
        return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1){
          return false;
      }
        for (int i = 2; i < numero; i++){
          if(numero % i==0){
            return false;
           }
      }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if(n < 0){
          throw new
        IllegalArgumentException("El numero no puede ser negativo");
       }
        int[] serie = new int [n];
        if(n > 0){
          serie[0] = 0;
        }
        if (n > 1){
           serie[1] = 1;
        }
        for(int i = 2; i < n; i++){
           serie [i] = serie [i-1] + serie [i - 2];
        }
        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++){
           suma = suma + arreglo[i];
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++){
           suma = suma + arreglo[i];
      }
        return (double) suma /arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++){
          if (arreglo[i] > mayor){
              mayor = arreglo[i];
           }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++){
          if (arreglo[i] < menor){
              menor = arreglo[i];
           }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == elemento){
              return true;
           }
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for(int i = 0; i < arreglo.length; i++){
          invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++){
          for (int j = i+1; j < arreglo.length; j++){
              if (arreglo[i] > arreglo [j]){
                 int temp = arreglo[i];
                 arreglo[i] = arreglo[j];
                 arreglo[j] = temp;
               }
           }
       }
        return arreglo;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        int[] temp = new int[arreglo.length];
        int contador = 0;
        for(int i = 0; i < arreglo.length; i++){
           boolean duplicado = false;
            for(int j = 0; j < contador; j++){
               if (arreglo[i] == temp[j]){
                  duplicado = true;
                  break;
               }
           }
           if(! duplicado){
              temp[contador] = arreglo[i];
              contador++;
           }
        }
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++){
            resultado[i] = temp[i];
         }    

        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] resultado = new int[arreglo1.length + arreglo2.length];
        for (int i = 0; i < arreglo1.length; i++) {
             resultado[i] = arreglo1[i];
           }
        for (int i = 0; i < arreglo2.length; i++) {
             resultado[arreglo1.length + i] = arreglo2[i];
           }
        return resultado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        int[] resultado = new int[n];
        posiciones = ((posiciones % n)+ n) % n;
        for (int i = 0; i < n; i++) {
            resultado[(i + posiciones) % n] = arreglo[i];
          }
        return resultado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--){
            invertida += cadena.charAt(i);
           }
        return invertida;
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replace(" ", "");
        int inicio = 0;
        int fin = cadena.length() -1;
        while (inicio < fin){
          if (cadena.charAt(inicio) != cadena.charAt(fin)){
             return false;
           }
          inicio ++;
          fin--;
          }
        return true;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        int contador = 0;
        boolean enPalabra = false;
        for(int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) != ' ') {
                if(!enPalabra){
                contador++;
                enPalabra = true;
               }
            }else{
               enPalabra = false;
               }
            }
        return contador;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        String resultado = "";
        for(int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c = (char) (c - 32);
             }
             resultado += c;
          }
        return resultado;
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        String resultado = "";
        for(int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char) (c + 32);
             }
             resultado += c;
          }
        return resultado;
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            boolean coincide = true;
            if (i + antiguaSubcadena.length() <= cadena.length()) {
                for (int j = 0; j < antiguaSubcadena.length(); j++) {
                    if (cadena.charAt(i + j) != antiguaSubcadena.charAt(j)) {
                        coincide = false;
                        break;
                    }
                }
                if (coincide) {
                    resultado += nuevaSubcadena;
                    i += antiguaSubcadena.length() - 1;
                    continue;
                }
            }
            resultado += cadena.charAt(i);
        }
        return resultado;
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        for(int i = 0; i <= cadena.length() - subcadena.length(); i++){
          boolean coincide = true;
          for(int j = 0; j < subcadena.length(); j++){
           if(cadena.charAt(i + j) != subcadena.charAt(j)){
             coincide = false;
             break;
            }
         }
         if (coincide){
          return i;
         }
       }
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        return correo.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        if (lista.isEmpty()){
            return 0.0;
        }
        int suma = 0;
        for (int numero : lista) {
            suma += numero;
        }
        return (double) suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        if (numero < 0){
            return "-" + Integer.toBinaryString(-numero);
        }
        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        if (numero < 0){
            return "-" + Integer.toHexString(-numero).toUpperCase();
        }
        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String eleccionComputadora = "Piedra";
        if (eleccionUsuario.equals(eleccionComputadora)) {
            return "Empate";
        }
        if ((eleccionUsuario.equals ("Piedra") &&
                (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto"))) ||

                (eleccionUsuario.equals("Papel") &&
                        (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock"))) ||

                (eleccionUsuario.equals("Tijera") &&
                        (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto"))) ||

                (eleccionUsuario.equals("Lagarto") &&
                        (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Spock"))) ||

                (eleccionUsuario.equals("Spock") &&
                        (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Tijera")))) {

            return "Ganaste";
        }
        return "Perdiste";

    }

    public String pptls2(String game[]) {
        String p1 = game[0];
        String p2 = game[1];

        if (p1.equals(p2)) {
            return "Empate";
        }
        if ((p1.equals("R") && (p2.equals("L") || p2.equals("S"))) ||
                (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) ||
                (p1.equals("S") && (p2.equals("P") || p2.equals("L"))) ||
                (p1.equals("L") && (p2.equals("P") || p2.equals("V"))) ||
                (p1.equals("V") && (p2.equals("R") || p2.equals("S")))) {
            return "Player 1";
        }
        return "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public String zoodiac(int day, int month) {
        if (month < 1 || month > 12 || day < 1)
            return "Invalid Date";

        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (day > diasMes[month - 1])
            return "Invalid Date";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19))
            return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20))
            return "Taurus";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20))
            return "Gemini";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22))
            return "Cancer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
            return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
            return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22))
            return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
            return "Scorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
            return "Sagittarius";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19))
            return "Capricorn";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18))
            return "Aquarius";

        return "Pisces";
    }
}

