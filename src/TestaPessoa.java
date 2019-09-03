public class TestaPessoa {
    public static void main(String[] args)
    {     
     Pessoa p1 = new Pessoa();
        p1.nome = "Meiriane";
        p1.idade = 27;
       
        System.out.println("Sua idade era " +p1.idade);
        
       p1.fazAniversario();
       
        System.out.println("Parabéns você fez " +p1.idade);
    }
}
