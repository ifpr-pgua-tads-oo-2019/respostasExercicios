package paranagua.ifpr.eic;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        int qtdeNumeros,valor;
        int[] vet;
        Scanner scan = new Scanner(System.in);
        boolean ordenado=true;

        System.out.printf("Digite uma quantidade de números:");
        qtdeNumeros = scan.nextInt();

        vet = new int[qtdeNumeros];

        for(int i=0;i<qtdeNumeros;i++){
            System.out.printf("Digite um número:");
            valor = scan.nextInt();
            vet[i]=valor;
        }

        for(int i=0;i<qtdeNumeros-1 && ordenado;i++){
            ordenado = (vet[i]<vet[i+1]) && ordenado;
        }
        System.out.println(ordenado);
        if(!ordenado){
            for(int i=0;i<qtdeNumeros;i++){
                for(int j=i;j<qtdeNumeros;j++){
                    if(vet[i]>vet[j]){
                        valor=vet[i];
                        vet[i]=vet[j];
                        vet[j]=valor;
                    }
                }
            }
        }

        for(int i=0;i<qtdeNumeros;i++){
            System.out.println(vet[i]);
        }




    }
}
