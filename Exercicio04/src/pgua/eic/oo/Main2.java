package pgua.eic.oo;

public class Main2 {


    public static void main(String[] args) {

        Carro c1 = new Carro();
        Carro c2 = new Carro();



        c1.modelo="Fusca";

        c2.modelo="Fusca";

        System.out.println(c1);
        System.out.println(c2);

        if(c1==c2){
            System.out.println("Objetos iguais");
        }else{
            System.out.println("Objetos diferentes");
        }


    }

}
