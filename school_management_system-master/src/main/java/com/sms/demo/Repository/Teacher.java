package com.sms.demo.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Teacher {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String first_name;
private String last_name;
private String username;
private String password;
private String email;
private String mobile;
private String salary;
private String qualification;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getFirst_name() {
    return first_name;
}
public void setFirst_name(String first_name) {
    this.first_name = first_name;
}
public String getLast_name() {
    return last_name;
}
public void setLast_name(String last_name) {
    this.last_name = last_name;
}
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getMobile() {
    return mobile;
}
public void setMobile(String mobile) {
    this.mobile = mobile;
}
public String getSalary() {
    return salary;
}
public void setSalary(String salary) {
    this.salary = salary;
}
public String getQualification() {
    return qualification;
}
public void setQualification(String qualification) {
    this.qualification = qualification;
}
public Teacher() {

}
}