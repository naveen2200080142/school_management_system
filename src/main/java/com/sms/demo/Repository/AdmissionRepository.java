package com.sms.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.demo.Model.Admission;

public interface AdmissionRepository extends JpaRepository<Admission, Long> {
}
