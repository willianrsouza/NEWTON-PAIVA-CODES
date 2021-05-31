public class Teste {
    public static void main(String[] args) {

        var funcoes = new DaoAluno();
        var aluno = new Aluno(1, "3434", "09348493663", "Roberto Carlos", "23.23.2020");
        var aluno2 = new Aluno(2, "3434", "0935463663", "Ximbinha", "23.23.2020");

        funcoes.save(aluno);
        funcoes.save(aluno2);

        funcoes.buscarID(1);
        funcoes.buscarObjeto(aluno);
         
        funcoes.imprimirAluno();
    }

}
