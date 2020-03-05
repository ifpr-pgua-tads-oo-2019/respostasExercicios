package paranagua.ifpr.eic;

import java.util.Scanner;

public class Exercicio02 {


    public static void main(String[] args) {

        int l1,l2,l3;


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado 1:");
        l1 = scan.nextInt();

        System.out.printf("Digite o tamanho do lado 2:");
        l2 = scan.nextInt();

        System.out.printf("Digite o tamanho do lado 3:");
        l3 = scan.nextInt();


        if(l1==l2 && l2==l3){
            System.out.println("Isso é um triangulo equilátero!!");
        }else if(l1!=l2 && l2!=l3 && l1!=l3){
            System.out.println("Isso é um triangulo isóceles");
        }else{
            System.out.println("Isso é um triângulo escaleno");
        }




    }

}
