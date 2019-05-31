package dao;

import dao.EntityService;
import meserreurs.MonException;

import javax.persistence.*;



import javax.persistence.EntityTransaction;

public class UtilisateurService extends EntityService {

    public UtilisateurEntity getUtilisateur( String login) throws MonException
    {
        UtilisateurEntity unUtilisateur=null;
        try {
            EntityTransaction transac = startTransaction();
            transac.begin();

            Query query = entitymanager.createNamedQuery("UtilisateurEntity.rechercheNom");
            query.setParameter("name", login);
            unUtilisateur = (UtilisateurEntity) query.getSingleResult();

            if (unUtilisateur == null) {
                new MonException("Utilisateur Inconnu", "Erreur ");
            }
            entitymanager.close();

        }
        catch(RuntimeException e)
        {
            new MonException("Erreur de lecture", e.getMessage());
        } catch (Exception e){
            new MonException("Erreur de lecture", e.getMessage());
        }
        return unUtilisateur;
    }


}
