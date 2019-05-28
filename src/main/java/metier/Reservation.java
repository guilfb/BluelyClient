package metier;

public class Reservation {

  private long vehicule;
  private long client;
  private java.sql.Timestamp dateReservation;
  private java.sql.Timestamp dateEcheance;


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


  public java.sql.Timestamp getDateReservation() {
    return dateReservation;
  }

  public void setDateReservation(java.sql.Timestamp dateReservation) {
    this.dateReservation = dateReservation;
  }


  public java.sql.Timestamp getDateEcheance() {
    return dateEcheance;
  }

  public void setDateEcheance(java.sql.Timestamp dateEcheance) {
    this.dateEcheance = dateEcheance;
  }

}
