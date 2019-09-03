
public class TestaProduto {
    public static void main (String[] args){
        
        Produto elemento1 = new Produto();
        elemento1.nome = "Granola";
        elemento1.preco = 9.99;
                
                System.out.println("O Produto a ser verificado é:   " +elemento1.nome);
                double valorCalculado = elemento1.diminuir10(elemento1.preco);
                System.out.println("Valor com desconto:   "  +valorCalculado);
                
                double valorCalculado1 = elemento1.aumenta25(elemento1.preco);
                System.out.println("Valor com acrescimo:    "   +valorCalculado1);
    }
}
