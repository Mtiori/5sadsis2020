package methodTemplate;

public class Penne extends Spoletto{
    
    @Override
    public void escolherMassa(){
        System.out.println("Pegar massa penne");
    }

    public void escolherMolho(){
        System.out.println("Molho pomodoro");
    }

    public void primeiroAdicional(){
        System.out.println("Queijo Minas");
    }

    public void segundoAdicional(){
        System.out.println("Bacon'");
    }
    
    public void terceiroAdicional(){
        System.out.println("Cebola Refogada");
    }

    public void prepararMassa(){
        System.out.println("Cozinhar massa com todos os ingredientes e seu molho");
    }

}