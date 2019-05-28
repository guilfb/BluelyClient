package dao;

import meserreurs.MonException;
import metier.BorneEntity;

import javax.persistence.EntityTransaction;
import java.util.List;

public class BorneService extends EntityService {


    /* Lister les bornes
     * */
    public List<BorneEntity> consulterListeBornes() throws MonException {
        List<BorneEntity> mesAdherents = null;
        try
        {
            EntityTransaction transac = startTransaction();
            transac.begin();
            mesAdherents = (List<BorneEntity>)
                    entitymanager.createQuery(
                            "SELECT a FROM BorneEntity a " +
                                    "ORDER BY a.idBorne").getResultList();
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
    public BorneEntity borneById(int numero) throws MonException {
        List<BorneEntity> adherents = null;
        BorneEntity adherent = new BorneEntity();
        try {
            EntityTransaction transac = startTransaction();
            transac.begin();

            adherents = (List<BorneEntity>)entitymanager.createQuery("SELECT a FROM BorneEntity a WHERE a.idBorne="+numero).getResultList();
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
