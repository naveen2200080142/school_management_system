package com.sms.demo.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.demo.Repository.Admission;
@Repository
public interface AdmissionRepository extends JpaRepository<Admission, Long> {
    
}
