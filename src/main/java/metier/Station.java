package metier;


public class Station {

  private long idStation;
  private double latitude;
  private double longitude;
  private String adresse;
  private long numero;
  private String ville;
  private long codePostal;


  public long getIdStation() {
    return idStation;
  }

  public void setIdStation(long idStation) {
    this.idStation = idStation;
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


  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }


  public long getNumero() {
    return numero;
  }

  public void setNumero(long numero) {
    this.numero = numero;
  }


  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }


  public long getCodePostal() {
    return codePostal;
  }

  public void setCodePostal(long codePostal) {
    this.codePostal = codePostal;
  }

}
