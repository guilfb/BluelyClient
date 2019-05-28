package metier;


public class Vehicule {

  private long idVehicule;
  private long rfid;
  private long etatBatterie;
  private String disponibilite;
  private double latitude;
  private double longitude;
  private long typeVehicule;


  public long getIdVehicule() {
    return idVehicule;
  }

  public void setIdVehicule(long idVehicule) {
    this.idVehicule = idVehicule;
  }


  public long getRfid() {
    return rfid;
  }

  public void setRfid(long rfid) {
    this.rfid = rfid;
  }


  public long getEtatBatterie() {
    return etatBatterie;
  }

  public void setEtatBatterie(long etatBatterie) {
    this.etatBatterie = etatBatterie;
  }


  public String getDisponibilite() {
    return disponibilite;
  }

  public void setDisponibilite(String disponibilite) {
    this.disponibilite = disponibilite;
  }


  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }


  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }


  public long getTypeVehicule() {
    return typeVehicule;
  }

  public void setTypeVehicule(long typeVehicule) {
    this.typeVehicule = typeVehicule;
  }

}
