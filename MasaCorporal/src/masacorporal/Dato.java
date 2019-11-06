package masacorporal;

import java.util.Scanner;

public class Dato {

    private Scanner s;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private int edad;
    private char genero;
    private float peso;
    private int altura;

    public Dato() {

        this.s = new Scanner(System.in);
        this.nombre = "";
        this.apaterno = "";
        this.amaterno = "";
        this.edad = -1;
        this.genero = ' ';
        this.peso = -1;
        this.altura = -1;

    }

    public Dato(Scanner s, String nombre, String apaterno, String amaterno, int edad, char genero, float peso, int altura) {
        this.s = s;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Dato{" + "s=" + s + ", nombre=" + nombre + ", apaterno=" + apaterno + ", amaterno=" + amaterno + ", edad=" + edad + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public void calculoImc() {
        double imc = this.peso / this.altura;
        if (imc < 18.5) {
            System.out.println("BAJO PESO");
        } else if (imc < 24.9) {
            System.out.println("PESO NORMAL");
        } else if (imc < 29.9) {
            System.out.println("SOBRE PESO");
        } else if (imc < 34.5) {
            System.out.println("OBESIDAD GRADO 1");
        } else if (imc < 39.9) {
            System.out.println("OBESIDAD GRADO 2");
        } else if (imc > 40) {
            System.out.println("OBESIDAD GRADO 3");
        }
    }

    public void mostrarDatos(){
        this.calculoImc();
        System.out.println(this.toString());
    }
}
