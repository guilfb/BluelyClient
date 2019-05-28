package dao;

import meserreurs.MonException;
import metier.ClientEntity;

import javax.persistence.EntityTransaction;
import java.util.List;

public class ClientService extends EntityService {


    /* Lister les bornes
     * */
    public List<ClientEntity> consulterListeBornes() throws MonException {
        List<ClientEntity> mesAdherents = null;
        try
        {
            EntityTransaction transac = startTransaction();
            transac.begin();
            mesAdherents = (List<ClientEntity>)
                    entitymanager.createQuery(
                            "SELECT a FROM ClientEntity a " +
                                    "ORDER BY a.idClient").getResultList();
            entitymanager.close();
        }catch (RuntimeException e) {
            new MonException("Erreur de lecture", e.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mesAdherents;
    }

    /* Consultation d'une borne par son numéro
     */
    public ClientEntity borneById(int numero) throws MonException {
        List<ClientEntity> adherents = null;
        ClientEntity adherent = new ClientEntity();
        try {
            EntityTransaction transac = startTransaction();
            transac.begin();

            adherents = (List<ClientEntity>)
                    entitymanager.createQuery(
                            "SELECT a FROM ClientEntity a " +
                                    "WHERE a.idClient="+numero).getResultList();
            adherent = adherents.get(0);
            entitymanager.close();
        }catch (RuntimeException e) {
            new MonException("Erreur de lecture", e.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return adherent;
    }
}
