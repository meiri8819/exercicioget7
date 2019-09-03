public class TestaCasa {
    public static void main (String args[]){
        Casa casa1 = new Casa();
        casa1.porta1 = false;
        casa1.porta2 = false;
        casa1.porta3 = true;   
        
        casa1.pinta("Salmão");
        System.out.println("A quantidade de portas abertas é: " + casa1.quantasPortasEstaoAbertas());        
    }
    
}
