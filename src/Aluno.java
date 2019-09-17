public class Aluno {
  private String nome;
  private String cpf;
Data dataDeNascimento;

String imprimir(){
    String aluno = this.nome + "\n"
            + this.cpf + "\n"
            +this.dataDeNascimento.imprimir();
    return aluno;
}
}
