package stringss;
import java.util.Scanner;
/**
 *
 * @author hca
 */
public class Stringss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ejercicios String");
        System.out.println("Selecciones el Número de Ejercicio ( 1 - 7)");
        int e = leer.nextInt();
        switch(e){
            case 1 :
                    System.out.println("Cadena:");
                    String sub = leer.nextLine();
                    System.out.println("SubCadena : ");
                    String s = leer.nextLine();
                    System.out.println(EncuentraPosición(sub,s));
             break;
             case 2 :
                    System.out.println("Cadena:");
                    String cad = leer.nextLine();
                    System.out.println("Char : ");
                    char sc = leer.next().charAt(0);
                   System.out.println(VecesChar(cad,sc));
             break;
             case 3 :
                    System.out.println("Cadena:");
                    String cade = leer.nextLine();
                    System.out.println(Mayus(cade));
             break;
             case 4:
                 System.out.println("Cadena:");
                  String cadena = leer.nextLine();
                 System.out.println(Encriptar(cadena));
                 System.out.println(Desencriptar(Encriptar(cadena)));
             break;
             case 5:
                 System.out.println("Cadena:");
                  String cadena2 = leer.nextLine();
                 System.out.println(Encriptar2(cadena2));
                 System.out.println(Desencriptar2(Encriptar2(cadena2)));
             break;
             case 6:
                 System.out.println("Numero a Invertir: ");
                  int n = leer.nextInt();
                  System.out.println(Invertir(n));
             break;
             case 7:
                 System.out.println("Palindromo");
                  int m = leer.nextInt();
                  System.out.println(Palindromo(m));
             break;
             
        }
    }
    public static int EncuentraPosición(String sb,String s){
        return sb.indexOf(s);
    }
    public static int VecesChar(String sb,char s){
       int c = 0;
       while(sb.indexOf(s) != -1){
           c++;
           sb = sb.replaceFirst(""+s, "");
    }
        
        return c;
    }
    public static int Mayus(String frase){
    int c = 0;
    for(int i = 0; i < frase.length(); i ++){
        char cha= frase.charAt(i);    
        int ascii = (int) cha;
           if((ascii  <= 90) && (ascii  >= 65) ){
               c++;
           }
    }
        return c;
    }
    public static String Desencriptar(String cadenaenc){
        String cadena = "";
        for(int i = 0 ; i < cadenaenc.length();i++){
            cadena = cadena + Desencripchar(cadenaenc.charAt(i));
        }
        return cadena;
    }
    
    public static String Encriptar(String cadena){
        String cadenaenc = "";
        for(int i = 0 ; i < cadena.length();i++){
            cadenaenc = cadenaenc + Encripchar(cadena.charAt(i));
        }
        return cadenaenc;
    }
    
    public static char Encripchar(char c){
        int ascii = (int) c;
        char ce = (char) (ascii +2 );
        return ce;
    }
    
    public static char Desencripchar(char c){
        int ascii = (int) c;
        char ce = (char) (ascii - 2 );
        return ce;
    }
    
    public static String Desencriptar2(String cadenaenc){
        String cadena = "";
        for(int i = 0 ; i < cadenaenc.length();i++){
            if(i % 2 == 0)
                cadena = cadena + DesencripcharPar(cadenaenc.charAt(i));
            else
                cadena = cadena + DesencripcharImpar(cadenaenc.charAt(i));
        }
        return cadena;
    }
    
    public static String Encriptar2(String cadena){
        String cadenaenc = "";
        for(int i = 0 ; i < cadena.length();i++){
            if(i % 2 == 0)
                cadenaenc = cadenaenc + EncripcharPar(cadena.charAt(i));
            else
                cadenaenc = cadenaenc + EncripcharImpar(cadena.charAt(i));
        }
        return cadenaenc;
    }
    
    public static char EncripcharPar(char c){
        int ascii = (int) c;
        char ce = (char) (ascii +2 );
        return ce;
    }
     public static char EncripcharImpar(char c){
        int ascii = (int) c;
        char ce = (char) (ascii + 3 );
        return ce;
    }
    
    public static char DesencripcharPar(char c){
        int ascii = (int) c;
        char ce = (char) (ascii - 2 );
        return ce;
    }
    public static char DesencripcharImpar(char c){
        int ascii = (int) c;
        char ce = (char) (ascii - 3 );
        return ce;
    }
    public static int Invertir(int a){
        String astr = Integer.toString(a);
        String n = "";
        for(int i = astr.length() - 1; i >= 0 ;i--){
           n = n + astr.charAt(i);
        }
        return Integer.parseInt(n);
    }
    public static String Palindromo(int n){
        int b = Invertir(n);
        if (b == n)
            return "Sí";
        else
             return "NO";
        
    }
    
}
