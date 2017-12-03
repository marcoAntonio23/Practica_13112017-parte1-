
package ec.edu.ister.modelo;

public class TipoMetodos {
    public static void metodoStatic1() {
        System.out.println("este es un metodo estatico");
    }
     public static void metodoStatic2(int p) {
        System.out.println("La potecia del numero es:"+p);
    }
     public static int metodoStatic3(int p) {        
        return p;
    }
     public void Suma(int x,int y) {
         int z=x+y;
         System.out.println("la suma es"+z);
    }
}
