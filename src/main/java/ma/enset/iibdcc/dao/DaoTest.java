package ma.enset.iibdcc.dao;

import ma.enset.iibdcc.entites.Patient;

public class DaoTest {
    public static void main(String[] args) {
        PatientDao patientDao = new PatientDao();
//        Patient patient = new Patient("DIALLO", "Amadou", "amadou@gmail.com", "0661013474");
//        patientDao.save(patient);
        System.out.println("All patients:");
        patientDao.findAll().forEach(System.out::println);
        System.out.println("Patient with id 1:");
        var optionalPatient = patientDao.findOne(1L);
        System.out.println(optionalPatient.orElse(null));
        assert(optionalPatient.isPresent());
//        patientDao.delete(3L);
    }
}
