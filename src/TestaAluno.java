public class TestaAluno {
    public static void main(String[] args){
     
     Aluno aluno1 = new Aluno();
     
     aluno1.nome = "Meiriane";
     aluno1.cpf= "000";
     
     Data data = new Data();
     data.dia = 13;
     data.mes = 7;
     data.ano = 1991;
     aluno1.dataDeNascimento = data;
     
     String dados = aluno1.imprimir();
     System.out.println(dados);
 }   
}
