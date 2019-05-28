package metier;


public class Client {

  private long idClient;
  private String nom;
  private String prenom;
  private java.sql.Date dateNaissance;


  public long getIdClient() {
    return idClient;
  }

  public void setIdClient(long idClient) {
    this.idClient = idClient;
  }


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }


  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }


  public java.sql.Date getDateNaissance() {
    return dateNaissance;
  }

  public void setDateNaissance(java.sql.Date dateNaissance) {
    this.dateNaissance = dateNaissance;
  }

}
