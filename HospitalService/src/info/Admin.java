/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info;

import hospital.Doctor;
import hospital.Patient;

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
        
        objPatient.assignDoctor(objDoctor.getName(), objDoctor.getCode());
        objPatient.getPatientDetails();
    }
}
