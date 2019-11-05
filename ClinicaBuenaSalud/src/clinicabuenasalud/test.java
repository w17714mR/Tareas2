package clinicabuenasalud;


public class test {


    public static void main(String[] args) {
    
        Doctor doctor1 = new Doctor();
        doctor1.setPnombre("William");
        doctor1.setSnombre("Alberto");
        doctor1.setApaterno("Rehel");
        doctor1.setAmaterno("Rifo");
        doctor1.setRut("1");
        doctor1.setRut("16387103");
        doctor1.setEspecialidad("Oncologìa");
        doctor1.setTurno('1');
        System.out.println(doctor1.toString());
        
    }
    
}
