package arrayead;

import java.util.ArrayList;

public class OpArray {
    private ArrayList al = new ArrayList();
    private String add, remove, search;
    private int aux;
    
    public void recebeAdd(String a){
        this.add = a;
    }
    public void addArray(){
        al.add(add);
    }
    
    public void recebeRemove(String b){
        this.remove = b;
    }
    public void removeArray(){
        if(al.contains(remove) == true){
            al.remove(remove);
            System.out.println("Removido com sucesso");
        }
        else{
            System.out.println("O que você deseja remover não existe");
        }
    }
    
    public void receberProcura(String c){
        this.search = c;
    }
    public boolean verificar(){
        return al.contains(search);
    }
    public int procurarNome(){
        for(int i = 0; i < al.size(); i++){
            if(search.equals(al.get(i))){
                aux = i + 1;
            }
        }
        return aux;
    }
    
    public void mostrar(){
        for(int i = 0; i < al.size(); i++){
            System.out.println(i + 1 + " - " + al.get(i));
        }
    }
    
    public boolean vazia(){
        return al.isEmpty();
    }
    
}
