package teste.basico.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento(("1A"));
        Cliente cliente = new Cliente("César", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao().incluir(assento).incluir(cliente).fecharTransacao().fechar();


    }
}
