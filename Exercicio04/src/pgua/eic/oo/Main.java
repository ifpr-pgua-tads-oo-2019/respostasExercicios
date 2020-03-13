package pgua.eic.oo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //declarando um Vetor
        Carro[] carros;
        Carro selecionado;

        int op,op2;
        Scanner scan = new Scanner(System.in);
        double qtde;

        //alocando os espacos do vetor
        carros = new Carro[3];

        //instanciando cada carro em um espaco do vetor
        for (int i = 0; i < carros.length; i++) {
            carros[i] = new Carro();
        }

        //inicializar
        for (int i = 0; i < carros.length; i++) {
            switch (i) {
                case 0:
                    carros[i].marca = "Volks";
                    carros[i].modelo = "Fusca";
                    carros[i].ano = 1964;
                    carros[i].maxTanque = 40;
                    carros[i].cor = "Preto";
                    carros[i].potencia = 250.0;
                    break;
                case 1:
                    carros[i].marca = "Chevrolet";
                    carros[i].modelo = "Chevet";
                    carros[i].ano = 1956;
                    carros[i].maxTanque = 35;
                    carros[i].cor = "Azul";
                    carros[i].potencia = 300.0;
                    break;
                case 2:
                    carros[i].marca = "Ford";
                    carros[i].modelo = "F1000";
                    carros[i].ano = 1976;
                    carros[i].maxTanque = 60;
                    carros[i].cor = "Verde";
                    carros[i].potencia = 700.0;
                    break;
            }
        }


        do{
            System.out.println("Escolha um carro:");
            for(int i=0;i<carros.length;i++){
                System.out.println((i+1)+" - "+carros[i].modelo);
            }
            System.out.println("0 - Sair");

            op = scan.nextInt();
            if(op > 0 && op<=carros.length){
                selecionado = carros[op-1];

                do{
                    System.out.println("1 - Acelerar");
                    System.out.println("2 - Abastecer");
                    System.out.println("3 - Estado");
                    System.out.println("0 - Sair");
                    op2 = scan.nextInt();

                    switch (op2){
                        case 1:
                            selecionado.acelerar();
                            break;
                        case 2:
                            System.out.println("Digite a quantidade de combutível:");
                            qtde = scan.nextDouble();
                            selecionado.abastecer(qtde);
                            break;
                        case 3:
                            System.out.println(selecionado.toString());
                            break;
                    }
                }while(op2 != 0);

            }
        }while (op!=0);




        /*
        //declarando três carros
        Carro c1, c2, c3;

        //instanciando
        c1 = new Carro();

        //inicializando o carro
        c1.marca = "Volks";
        c1.modelo = "Fusca";
        c1.ano = 1964;
        c1.maxTanque = 40;
        c1.cor = "Preto";
        c1.potencia = 250.0;

        c1.abastecer(20);
        System.out.println(c1.toString());

        c1.acelerar();

        //mostrando o estado do carro
        System.out.println(c1.toString());

        //instanciando
        c2 = new Carro();

        //inicializando o carro
        c2.marca = "Chevrolet";
        c2.modelo = "Chevet";
        c2.ano = 1956;
        c2.maxTanque = 35;
        c2.cor = "Azul";
        c2.potencia = 300.0;

        //mostrando o estado do carro
        System.out.println(c2.toString());


        //instanciando
        c3 = new Carro();

        //inicializando o carro
        c3.marca = "Ford";
        c3.modelo = "F1000";
        c3.ano = 1976;
        c3.maxTanque = 60;
        c3.cor = "Verde";
        c3.potencia = 700.0;

        //mostrando o estado do carro
        System.out.println(c3.toString());

        */
    }
}
