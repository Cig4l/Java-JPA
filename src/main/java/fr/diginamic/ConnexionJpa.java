package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("java-jpa");
        EntityManager em = emf.createEntityManager();

        // Vérifier la connexion en lançant une transaction (optionnel)
        em.getTransaction().begin();
        em.getTransaction().commit();

        // Fermer l'EntityManager et EntityManagerFactory
        em.close();
        emf.close();
    }
}
