package xuxapatinhos;

import java.util.Scanner;

public class Interface {
    
    public int leiaValor(){
        System.out.println(" == Música da Xuxa == ");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 1 a 10: ");
        int n = input.nextInt();
        return n;
    }

    public void mostreIda(int n) {
        for(int i=n; n>0; n--){
            System.out.println(n + " patinhos foram passear. Além das montanhas para brincar.");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá. Mas só " + (n-1) +" patinhos voltaram de lá!\n");
        }
    }

    public void decidirContinuacao(){
        Scanner continua = new Scanner (System.in);
        System.out.println("Você quer continuar a música? Digite [S/N] ");
        String cont = continua.nextLine();
        
        if(cont.equals("s")){
            System.out.println("Continuando ..");
        }else{
            System.out.println("Saindo!");
            System.exit(0);
        }
    }
    
    public void mostreVolta(int n){
           System.out.println("A mamãe patinho foi procurar além das montanhas na beira do mar.");
           System.out.println("A mamãe gritou Quá, quá, quá, quá. E os " + n +" patinhos voltaram de lá! \n");
        
    }
}