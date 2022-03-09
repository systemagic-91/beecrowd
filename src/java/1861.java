import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Hall dos Assassinos
 */

class Hall{

    public static void removeDuplicatas(Lista matou, Lista assassinos){

        for (No i = matou.inicio.prox; i != null; i = i.prox) {
            if(estaNoVetor(assassinos, i.nome)==false){
                assassinos.inserir(i.nome);
            }
        }        
    }

    public static void contaAssassinatos(Lista matou, Lista assassinos){

        for (No i = assassinos.inicio.prox; i != null; i = i.prox) {

            for (No j = matou.inicio.prox; j != null; j = j.prox) {

                if(i.nome.compareTo(j.nome) == 0){
                    i.matou();
                }
            }            
        }
    }

    public static void removeMortos(Lista morreu, Lista assassinos){

        for (No i = assassinos.inicio.prox ; i != null ; i = i.prox){    

            for (No j = morreu.inicio.prox; j != null; j = j.prox) {

                if(i.nome.compareTo(j.nome) == 0){
                    i.nome = "morreu";
                }
            }
        }
    }

    public static boolean estaNoVetor(Lista assassinos, String assassino){
        
        for (No i = assassinos.inicio.prox ; i != null ; i=i.prox){
            
            if (i.nome != null){
                if(i.nome.compareTo(assassino) == 0){
                    return true;
                }
            }
        }

        return false;
    }



    public static void resultado(Lista matou, Lista morreu, Lista assassinos){

        System.out.println("HALL OF MURDERERS");

        removeDuplicatas(matou, assassinos);
        contaAssassinatos(matou, assassinos);
        removeMortos(morreu, assassinos);

        for (No i = assassinos.inicio.prox ; i != null; i = i.prox) {

            if(i.nome.compareTo("morreu") != 0){
                System.out.print(i.nome + " ");            
                System.out.println(i.matouQuantos);            
            }
        }
    }

    public static void main(String [] args) throws IOException{            
        
        BufferedReader bff = new BufferedReader(new InputStreamReader(System.in));        
        String linha;

        Lista matou = new Lista();
        Lista morreu = new Lista();
        Lista assassinos = new Lista();        
        
        try {
            
            linha = bff.readLine();
            
            while(linha != null) {            
                
                int espaço = linha.indexOf(" ");
                matou.inserir(linha.substring(0, espaço));
                morreu.inserir(linha.substring(espaço+1, linha.length()));
                
                linha = bff.readLine();
            }   
            
        } catch (Exception e) {
            e.printStackTrace();   
        }        

        resultado(matou, morreu, assassinos);     
    }
}

class No {

    public String nome;
    public int matouQuantos;
    public No prox;

    public No (){
        this.nome = null;
        this.prox = null;
        this.matouQuantos = 0;
    }

    public No (String nome){
        this.nome = nome;
        this.prox = null;
    }

    public void matou(){
        this.matouQuantos++;
    }
}

class Lista {

    public No inicio;
    public No ultimo;

    public Lista (){

        this.inicio = new No();        
        this.ultimo = this.inicio;
    }

    public void inserir(String nome){
                
        ultimo.prox = new No(nome);
        ultimo = ultimo.prox;
    }

    public void mostrar(){
        
        for (No i=inicio.prox ; i != null ; i = i.prox){
            System.out.println(i.nome);
        }
    }
}