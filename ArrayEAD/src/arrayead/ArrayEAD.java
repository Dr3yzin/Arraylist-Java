package arrayead;

import java.util.Scanner;

public class ArrayEAD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OpArray oa = new OpArray();
        
        int m, aux;
        String add, remove, search;
        
        do{
            System.out.println("Escolha uma opção");
            System.out.println("1 - Adicionar ao arraylist");
            System.out.println("2 - Remover do arraylist");
            System.out.println("3 - Procurar no arraylist");
            System.out.println("4 - Mostrar arraylist");
            System.out.println("5 - Sair");
            m = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            
            switch(m){
                case 1 -> {
                    System.out.println("Digite o que deseja inserir:");                    
                    add = sc.nextLine();
                    oa.recebeAdd(add);
                    oa.addArray();
                    System.out.println("");
                    
                    oa.receberProcura(add);
                    if(oa.verificar()){
                        System.out.println("Adicionado com sucesso");
                    }
                    else{
                        System.out.println("Erro ao adicionar");
                    }
                    System.out.println("");
                }
                    
                case 2 -> {
                    System.out.println("Digite o que deseja remover:");
                    remove = sc.nextLine();
                    System.out.println("");
                    
                    oa.recebeRemove(remove);
                    oa.removeArray();
                    
                    System.out.println("");
                }
                    
                case 3 -> {
                    System.out.println("Digite o que deseja procurar:");
                    search = sc.nextLine();
                    System.out.println("");
                    
                    oa.receberProcura(search);
                    if(oa.verificar()){
                        aux = oa.procurarNome();
                        System.out.println("'" + search + "' esta na posição " + aux + " do arraylist");
                    }
                    else{
                        System.out.println("Este item não esta listado no array");
                    }
                    System.out.println("");
                }
                    
                case 4 -> {
                    if(oa.vazia()){
                        System.out.println("O arraylist ainda esta vazio");
                        System.out.println("");
                    }
                    else{
                        oa.mostrar();
                        System.out.println("");
                    }
                }
                    
                case 5 -> {
                    System.out.println("encerrando");
                }
                default -> {
                    System.out.println("Opção invalida");
                    System.out.println("");
                }
                
                
            }
        }while(m != 5);
    }
    
}
