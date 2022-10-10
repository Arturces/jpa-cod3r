package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-cod3r");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class,4L);
        usuario.setNome("Artur");
        usuario.setEmail("artur@gmail.com");

        em.merge(usuario);


        System.out.println(usuario.getEmail());

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
