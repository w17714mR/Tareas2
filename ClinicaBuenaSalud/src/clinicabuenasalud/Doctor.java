package clinicabuenasalud;

public class Doctor {

    private String rut;
    private String pnombre;
    private String snombre;
    private String apaterno;
    private String amaterno;
    private String especialidad;
    private char turno;

    public Doctor() {
        this.rut = "";
        this.pnombre = "";
        this.snombre = "";
        this.apaterno = "";
        this.amaterno = "";
        this.especialidad = "";
        this.turno = ' ';

    }

    public Doctor(String rut, String pnombre, String snombre, String apaterno, String amaterno, String especialidad, char turno) {
        this.rut = rut;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.especialidad = especialidad;
        this.turno = turno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (rut.length() == 8) {
            this.rut = rut;
        } else {
            System.out.println("Cantidad de carácteres inválidos.");
        }

    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Doctor{" + "rut=" + rut + ", pnombre=" + pnombre + ", snombre=" + snombre + ", apaterno=" + apaterno + ", amaterno=" + amaterno + ", especialidad=" + especialidad + ", turno=" + turno + '}';
    }

}
