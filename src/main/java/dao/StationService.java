package dao;

import meserreurs.MonException;
import metier.StationEntity;

import javax.persistence.EntityTransaction;
import java.util.List;

public class StationService extends EntityService {


    /* Lister les bornes
     * */
    public List<StationEntity> consulterListeBornes() throws MonException {
        List<StationEntity> mesAdherents = null;
        try
        {
            EntityTransaction transac = startTransaction();
            transac.begin();
            mesAdherents = (List<StationEntity>)
                    entitymanager.createQuery(
                            "SELECT a FROM StationEntity a " +
                                    "ORDER BY a.idStation").getResultList();
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
    public StationEntity borneById(int numero) throws MonException {
        List<StationEntity> adherents = null;
        StationEntity adherent = new StationEntity();
        try {
            EntityTransaction transac = startTransaction();
            transac.begin();

            adherents = (List<StationEntity>)
                    entitymanager.createQuery(
                            "SELECT a FROM StationEntity a " +
                                    "WHERE a.idStation="+numero).getResultList();
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
