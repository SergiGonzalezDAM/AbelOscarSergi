package pruebaa;


public class Pruebaa {

    
    public static void main(String[] args)
    {
        int cont = 0;
        boolean entrar = true;
        System.out.println("Que guay");
        
        while(entrar)
        {
            cont++;
            System.out.println("Java");
            if(cont == 9000)
                {
                    System.out.println("He salido");
                    entrar = false;
                    
                }  
        }
    }
    
}
