package dao;

import meserreurs.MonException;
import metier.TypeVehiculeEntity;

import javax.persistence.EntityTransaction;
import java.util.List;

public class TypeVehiculeService extends EntityService {


    /* Lister les bornes
     * */
    public List<TypeVehiculeEntity> consulterListeBornes() throws MonException {
        List<TypeVehiculeEntity> mesAdherents = null;
        try
        {
            EntityTransaction transac = startTransaction();
            transac.begin();
            mesAdherents = (List<TypeVehiculeEntity>)
                    entitymanager.createQuery(
                            "SELECT a FROM TypeVehiculeEntity a " +
                                    "ORDER BY a.idTypeVehicule").getResultList();
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
    public TypeVehiculeEntity borneById(int numero) throws MonException {
        List<TypeVehiculeEntity> adherents = null;
        TypeVehiculeEntity adherent = new TypeVehiculeEntity();
        try {
            EntityTransaction transac = startTransaction();
            transac.begin();

            adherents = (List<TypeVehiculeEntity>)entitymanager.createQuery("SELECT a FROM TypeVehiculeEntity a WHERE a.idTypeVehicule="+numero).getResultList();
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
