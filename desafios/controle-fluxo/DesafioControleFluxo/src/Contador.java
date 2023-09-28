import java.util.Scanner;
public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = scan.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = scan.nextInt();


        try{
            contar(parametro1,parametro2);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    
    public static void contar(int numero1,int numero2) throws ParametrosInvalidosException{
        int contagem = numero2-numero1;
        if(contagem < 0){
            throw new ParametrosInvalidosException();
        }  
        else{
            for(int i =0; i< contagem;i++){
            System.out.println("Imprimindo o número "+ (1+i));
            }
        }



    }
}
