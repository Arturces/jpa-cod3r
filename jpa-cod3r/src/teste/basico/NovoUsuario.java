package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("jpa-cod3r");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Gabi", "gabi@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        em.clear();
        emf.close();

    }
}
