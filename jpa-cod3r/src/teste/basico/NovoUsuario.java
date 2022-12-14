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

        Usuario novoUsuario = new Usuario("Cesar", "cesar@gmail.com");

        em.getTransaction().begin(); //transação exigida por conta da persistencia da api
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("O ID gerado foi : " +novoUsuario.getId());

        em.clear();
        emf.close();

    }
}
