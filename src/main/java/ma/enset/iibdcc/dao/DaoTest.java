package ma.enset.iibdcc.dao;

public class DaoTest {
    public static void main(String[] args) {
        PatientDaoImpl patientDaoImpl = new PatientDaoImpl();
//        Patient patient = new Patient("DIALLO", "Amadou", "amadou@gmail.com", "0661013474");
//        patientDao.save(patient);
        System.out.println("All patients:");
        patientDaoImpl.findAll().forEach(System.out::println);
        System.out.println("Patient with id 1:");
        var optionalPatient = patientDaoImpl.findOne(1L);
        System.out.println(optionalPatient.orElse(null));
        assert(optionalPatient.isPresent());
//        patientDao.delete(3L);
    }
}
