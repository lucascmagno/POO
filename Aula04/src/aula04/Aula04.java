package aula04;
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        Caneta c2 = new Caneta("Esferografica","Preta",1.5f);
        /*c1.setModelo("BIC");
        c1.setPonta(0.5f);
        //c1.status();
        System.out.println("Tenho uma caneta "+c1.getModelo()+" de ponta "+c1.getPonta());
        */
        c1.status();
        System.out.println("\n");
        c2.status();
    }
    
}
