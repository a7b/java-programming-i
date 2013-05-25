/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author TQNINH
 */
public class Admin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Doctor objDoctor = new Doctor();
        objDoctor.setDoctorInfo();
        
        Patient objPatient = new Patient();
        objPatient.setPatientDetails();
        
        objPatient.doctorCode = objDoctor.code;
        objPatient.doctorName = objDoctor.name;
        
        System.out.format("The doctor for %s is %s.", objPatient.name,
                objDoctor.name);
        System.out.println();
        
        objPatient.getPatientDetails();
        objDoctor.getDoctorInfo();
    }
}
