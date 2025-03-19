public class Main {
    
    Circulo circulo1 = new Circulo(3, "verde");
    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(3, "verde");
        Cuadrado cuadrado1 = new cuadrado(3, 3, "rojo");
        
        double ladoA = cuadrado1.getLadoA();
        double ladoB = cuadrado1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println("Area cuadrado: " + area1);
        
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * 3.14;
        System.out.println("Diferencia áreas: " + diferencia);
        
        System.out.println("Cuadrado: " + cuadrado1);
        System.out.println("Circulo: " + circulo1);
        System.out.println("Diferencia: " + diferencia);
    }
    
    
}
