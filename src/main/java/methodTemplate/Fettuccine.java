package methodTemplate;

public class Fettuccine extends Spoletto{
    
    @Override
    public void escolherMassa(){
        System.out.println("Pegar massa fettuccine");
    }

    public void escolherMolho(){
        System.out.println("Molho pesto");
    }

    public void primeiroAdicional(){
        System.out.println("Ricota Temperada");
    }

    public void segundoAdicional(){
        System.out.println("Tomate picado'");
    }
    
    public void terceiroAdicional(){
        System.out.println("Alho Poró Refogado");
    }

    public void prepararMassa(){
        System.out.println("Cozinhar massa com todos os ingredientes e seu molho");
    }

}