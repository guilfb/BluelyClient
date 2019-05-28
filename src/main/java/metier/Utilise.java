package metier;


public class Utilise {

  private long vehicule;
  private long client;
  private java.sql.Timestamp date;
  private long borneDepart;
  private long borneArrivee;


  public long getVehicule() {
    return vehicule;
  }

  public void setVehicule(long vehicule) {
    this.vehicule = vehicule;
  }


  public long getClient() {
    return client;
  }

  public void setClient(long client) {
    this.client = client;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }


  public long getBorneDepart() {
    return borneDepart;
  }

  public void setBorneDepart(long borneDepart) {
    this.borneDepart = borneDepart;
  }


  public long getBorneArrivee() {
    return borneArrivee;
  }

  public void setBorneArrivee(long borneArrivee) {
    this.borneArrivee = borneArrivee;
  }

}
