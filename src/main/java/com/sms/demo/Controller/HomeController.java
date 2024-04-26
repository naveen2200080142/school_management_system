package com.sms.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sms.demo.Repository.Admin;
import com.sms.demo.Repository.Admission;
import com.sms.demo.Repository.Student;
import com.sms.demo.Repository.Teacher;
import com.sms.demo.Service.AdminRepository;
import com.sms.demo.Service.AdmissionRepository;
import com.sms.demo.Service.StudentRepository;
import com.sms.demo.Service.TeacherRepository;



@Controller
public class HomeController {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private AdmissionRepository admissionRepository;
    @Autowired
    private StudentRepository StudentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @GetMapping("/")
    public String home() {
        System.err.println("Home Controller");
        return "home1.html"; // Assuming your HTML file is named home1.html
    }  
    @GetMapping("teachersignup")
    public String teachersignup() {
        System.err.println("teachersignup");
        return "teachersignup.html"; // Return the name of your admission.html file
    }
    @GetMapping("studentsignup")
    public String studentsignup() {
        System.err.println("studentsignup");
        return "studentsignup.html"; // Return the name of your admission.html file
    }
    @GetMapping("studentlogin")
    public String studentlogin() {
        System.err.println("studentlogin");
        return "studentlogin.html"; // Return the name of your admission.html file
    }
    @GetMapping("/admission")
    public String admission() {
        return "admission.html"; // Return the name of your admission.html file
    }
    @GetMapping("/adminsignup")
    public String adminsignup() {
        return "adminsignup.html"; // Return the name of your admission.html file
    }
    @GetMapping("/adminlogin")
    public String adminlogin() {
        return "adminlogin.html";}
    @GetMapping("adminclick")
    public String adminclick() {
        return "adminclick.html";
    }
    @GetMapping("studentclick")
    public String studentclick(){
        return "studentclick.html";
    }
    @GetMapping("teacherclick")
    public String teacherclick(){
        return "teacherclick.html";
    }
    @GetMapping("contactus")
    public String  contactus(){
        return "contactus.html";
    }
    @GetMapping("aboutus")
    public String aboutus(){
        System.err.println("aboutus");
        return "aboutus.html";
    }
    @GetMapping("student_dashboard")
    public String student_dashboard(){
        return "student_dashboard.html";
    }
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    @PostMapping("studentlogincheck")
    public String studentlogincheck(@ModelAttribute Student  student) {
        Student existingStudent = StudentRepository.findByUsername(student.getUsername());
    
        // Check if the admin record exists and if the password matches
        if (existingStudent != null && existingStudent.getPassword().equals(student.getPassword())) {
            // Admin login successful
            System.err.println("Student login successful");
            return "student_dashboard"; // Redirect to the admin panel or any other page
        } else {
            System.err.println("student login failed");
            // Admin login failed, handle accordingly (e.g., show error message)
            return "redirect:/"; // Redirect back to the login page with an error message
        }
        }
    @PostMapping("/submitAdminSignup")
    public String submitAdminsignup(@ModelAttribute Admin admin) {
        // Save admission details to the database
        adminRepository.save(admin);
        return "redirect:/"; // Redirect to the home page after submission
    }
    @PostMapping("admin_dashboard")
    public String admin_dashboard(Teacher teacher) {
        return "admin_dashboard.html";
    }
    @PostMapping("teacher_dashboard")
    public String teacher_dashboard() {
        
        return "teacher_dashboard.html";
    }
   
    
    @PostMapping("adminlogin")
    public String adminlogin(@ModelAttribute Admin admin) {
        Admin existingAdmin = adminRepository.findByUsername(admin.getUsername());
    
    // Check if the admin record exists and if the password matches
    if (existingAdmin != null && existingAdmin.getPassword().equals(admin.getPassword())) {
        // Admin login successful
        System.err.println("Admin login successful");
        return "admin_dashboard"; // Redirect to the admin panel or any other page
    } else {
        System.err.println("Admin login failed");
        // Admin login failed, handle accordingly (e.g., show error message)
        return "redirect:/"; // Redirect back to the login page with an error message
    }
    }

    @PostMapping("/submitAdmission")
    public String submitAdmission(@ModelAttribute Admission admission) {
        // Save admission details to the database
        admissionRepository.save(admission);
        return "redirect:/"; // Redirect to the home page after submission
    }
    @PostMapping("addteacher")
    public String addteacher(@ModelAttribute Teacher teacher){
        teacherRepository.save(teacher);
        return "redirect:/";
    }
   @GetMapping("teacherlogin")
   public String teacherlogin() {
       return "teacherlogin.html";
   }
   
    @PostMapping("teacherlogincheck")
    public String teacherlogincheck(@ModelAttribute Teacher teacher) {
        Teacher existingTeacher = teacherRepository.findByUsername(teacher.getUsername());
        if (existingTeacher != null && existingTeacher.getPassword().equals(teacher.getPassword())) {
            // Admin login successful
            System.err.println("Admin login successful");
            return "teacher_dashboard"; // Redirect to the admin panel or any other page
        } else {
            System.err.println("Admin login failed");
            // Admin login failed, handle accordingly (e.g., show error message)
            return "redirect:/"; // Redirect back to the login page with an error message
        }
    }
  
    
    
}
