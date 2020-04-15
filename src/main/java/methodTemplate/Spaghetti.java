package methodTemplate;

public class Spaghetti extends Spoletto{
    
    @Override
    public void escolherMassa(){
        System.out.println("Pegar massa spaghetti");
    }

    public void escolherMolho(){
        System.out.println("Molho branco");
    }

    public void primeiroAdicional(){
        System.out.println("Bacon");
    }

    public void segundoAdicional(){
        System.out.println("Queijo Gorgonzola");
    }
    
    public void terceiroAdicional(){
        System.out.println("Tomate Cereja");
    }

    public void prepararMassa(){
        System.out.println("Cozinhar massa com todos os ingredientes e seu molho");
    }
}