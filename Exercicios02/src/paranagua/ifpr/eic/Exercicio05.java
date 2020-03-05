package paranagua.ifpr.eic;

import java.util.Scanner;

public class Exercicio05 {

    public static void ordena(int[] vet){
        int valor=0;

        for(int i=0;i<vet.length;i++){
            for(int j=i;j<vet.length;j++){
                if(vet[i]>vet[j]){
                    valor=vet[i];
                    vet[i]=vet[j];
                    vet[j]=valor;
                }
            }
        }
    }


    public static void main(String[] args) {

        int qtdeNumeros,valor;
        int[] vet1,vet2,resultado;
        Scanner scan = new Scanner(System.in);
        boolean ordenado=true;

        System.out.printf("Digite uma quantidade de números:");
        qtdeNumeros = scan.nextInt();

        vet1 = new int[qtdeNumeros];

        for(int i=0;i<qtdeNumeros;i++){
            System.out.printf("Digite um número:");
            valor = scan.nextInt();
            vet1[i]=valor;

            if(i>1){
                ordenado =(vet1[i-1]<vet1[i]) && ordenado;
            }
        }

        if(!ordenado){
            ordena(vet1);
        }

        System.out.printf("Digite uma quantidade de números:");
        qtdeNumeros = scan.nextInt();

        vet2 = new int[qtdeNumeros];
        ordenado=true;
        for(int i=0;i<qtdeNumeros;i++){
            System.out.printf("Digite um número:");
            valor = scan.nextInt();
            vet2[i]=valor;

            if(i>1){
                ordenado =(vet2[i-1]<vet2[i]) && ordenado;
            }
        }

        if(!ordenado){
            ordena(vet2);
        }

        //o vetor tem um atributo que armazena a quantidade de elementos
        resultado = new int[vet1.length + vet2.length];
        for(int cr=0,c1=0,c2=0;cr<resultado.length;cr++){
            if(c2==vet2.length){
                resultado[cr]=vet1[c1];
                c1++;
            }else if(c1 == vet1.length){
                resultado[cr]=vet2[c2];
                c2++;
            }else{
                if(vet1[c1]>vet2[c2]){
                    resultado[cr]=vet2[c2];
                    c2++;
                }else{
                    resultado[cr]=vet1[c1];
                    c1++;
                }
            }


        }

        for(int i=0;i<resultado.length;i++){
            System.out.println(resultado[i]);
        }




    }



}
