package com.sms.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdmissionRepository extends JpaRepository<Admission, Long> {
    
}
