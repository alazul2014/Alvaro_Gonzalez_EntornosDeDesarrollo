public class AGM_Circulo {

    

    class Circulo {

        @Override
        public String toString() {
            return "Circulo{" + "id=" + id + ", radio=" + radio + ", color=" + color + '}';
        }
        
        int id;
        double radio;
        String color;
        
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Circulo(int id, double radio, String color) {
            this.id = id;
            this.radio = radio;
            this.color = color;
        }
    
    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}