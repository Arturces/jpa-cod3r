package teste.basico.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filme filmeA = new Filme("Star Wars Ep. 4", 8.9);
        Filme filmeB = new Filme("O Fugitivo", 8.1);


        Ator atorA = new Ator("Artur Ford");
        Ator atrizB = new Ator("Gabi Fisher");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atorA);

        DAO<Filme> dao = new DAO<>();
        dao.incluirAtomico(filmeA);

    }
}
