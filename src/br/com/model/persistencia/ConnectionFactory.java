package br.com.model.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Antônio da Silva Júnior / Mauricio Pires Cardoso
 * @version 1.0 21/09/2013
 */
public class ConnectionFactory {


    private static final String UNIT_NAME = "FastLeasePU";
    private EntityManagerFactory emf = null;
    private EntityManager em = null;

    public EntityManager getEntityManager() {

        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(UNIT_NAME);
        }

        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;

    }
}
