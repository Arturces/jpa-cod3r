package teste.basico.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

    public static void main(String[] args) {

        DAO<Aluno> alunoDAO = new DAO<>();

        Aluno aluno = new Aluno(123L, "Artur");
        AlunoBolsista aluno2 = new AlunoBolsista(312L, "Cesar", 1000);

        alunoDAO.incluirAtomico(aluno);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();

    }
}
