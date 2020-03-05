package paranagua.ifpr.eic;

public class Exercicio01 {

    public static void main(String[] args) {


        int inicio=1;
        int fim=2500;
        int divisores=0;

        for(int i=inicio;i<=fim;i++){
            if(i%11 == 5){
                System.out.println(i+"%11=5");
            }

            if(i%2==0){
                System.out.println(i+" é par!!");
            }else{
                System.out.println(i+" é impar!!");
            }

            divisores=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    divisores++;
                }
            }
            if(divisores==2){
                System.out.println(i+" é primo!!");
            }

        }

    }


}
