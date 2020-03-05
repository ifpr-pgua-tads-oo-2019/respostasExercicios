package paranagua.ifpr.eic;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        int[] vet = new int[100];
        int qtde,valor;
        int maior,menor,soma;
        double media;

        Scanner scan = new Scanner(System.in);

        qtde=0;
        valor=0;

        while(qtde<100 && valor!=-1) {
            System.out.println("Digite um número (-1 para sair):");
            valor = scan.nextInt();
            if(valor != -1){
                vet[qtde]=valor;
                qtde++;
            }
        }

        maior=vet[0];
        menor=vet[0];

        soma=vet[0];
        for(int i=1;i<qtde;i++){
            soma += vet[i];

            if(vet[i]>maior){
                maior=vet[i];
            }

            if(vet[i]<menor){
                menor=vet[i];
            }
        }

        System.out.println("Maior número digitado:"+maior);
        System.out.println("Menor número digitado:"+menor);
        System.out.println("Soma dos números digitados:"+soma);
        media = (double)soma/(double)qtde;
        System.out.println("Média dos números:"+media);

        System.out.println("Números subtraídos do maior");
        for(int i=0;i<qtde;i++){
            System.out.println(vet[i]+" - "+maior+"="+(vet[i]-maior));
        }

        System.out.println("Números adicionados do menor");
        for(int i=0;i<qtde;i++){
            System.out.println(vet[i]+" + "+menor+"="+(vet[i]+menor));
        }

        System.out.println("Números subtraídos da média");
        for(int i=0;i<qtde;i++){
            System.out.println(vet[i]+" - "+media+"="+(vet[i]-media));
        }

    }

}
