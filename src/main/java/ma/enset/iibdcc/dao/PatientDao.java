package ma.enset.iibdcc.dao;

import ma.enset.iibdcc.entites.Patient;

import java.util.Optional;

public interface PatientDao extends Dao<Patient, Long> {
    Optional<Patient> findByEmail(String email);
}
