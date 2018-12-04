package boletin12_1;


public class Prueba {
    
    
    String dni = "53188731N";
    
    public void pruebita(){
    char ultimo = dni.charAt(dni.length()-1);
    int ultimo2 = dni.codePointAt(dni.length()-1);
    System.out.println(ultimo);
    System.out.println(ultimo2);
    }
}
