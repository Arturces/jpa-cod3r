package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("jpa-cod3r");
        EntityManager em = emf.createEntityManager();

 /*       String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(2);*/

        List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class)
                .setMaxResults(2 )
                .getResultList();

        for(Usuario usuario: usuarios){
            System.out.println("ID: " + usuario.getId()
                    + "E-mail: " + usuario.getEmail());
        }

        em.close();
        emf.close();
    }
}