package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("jpa-cod3r");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 3L); //buscar valor na base de dados
        System.out.println(usuario.getNome());



        em.close();
        emf.close();
    }
}
