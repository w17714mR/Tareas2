package modelo;

public class Mascota {

    private int idMascota;
    private String nomMascota;
    private boolean atPrevia;
    private int cantAtPrev;
    private boolean duenio;
    private String nomDuenio;
    private String descriMascota;
    private int edadMascota;
    private String tipoMascota;
    private String telefono;

    public Mascota() {
        this.idMascota = 0;
        this.nomMascota = "";
        this.atPrevia = false;
        this.cantAtPrev = 0;
        this.duenio = false;
        this.nomDuenio = "";
        this.descriMascota = "";
        this.edadMascota = 0;
        this.tipoMascota = "";
        this.telefono = "";

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
    }

    public boolean isAtPrevia() {
        return atPrevia;
    }

    public void setAtPrevia(boolean atPrevia) {
        this.atPrevia = atPrevia;
    }

    public int getCantAtPrev() {
        return cantAtPrev;
    }

    public void setCantAtPrev(int cantAtPrev) {
        this.cantAtPrev = cantAtPrev;
    }

    public boolean isDuenio() {
        return duenio;
    }

    public void setDuenio(boolean duenio) {
        this.duenio = duenio;
    }

    public String getNomDuenio() {
        return nomDuenio;
    }

    public void setNomDuenio(String nomDuenio) {
        this.nomDuenio = nomDuenio;
    }

    public String getDescriMascota() {
        return descriMascota;
    }

    public void setDescriMascota(String descriMascota) {
        this.descriMascota = descriMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    @Override
    public String toString() {
        return "Mascota{" + "idMascota=" + idMascota + ", nomMascota=" + nomMascota + ", atPrevia=" + atPrevia + ", cantAtPrev=" + cantAtPrev + ", duenio=" + duenio + ", nomDuenio=" + nomDuenio + ", descriMascota=" + descriMascota + ", edadMascota=" + edadMascota + ", tipoMascota=" + tipoMascota + ", telefono=" + telefono + '}';
    }

    

}
