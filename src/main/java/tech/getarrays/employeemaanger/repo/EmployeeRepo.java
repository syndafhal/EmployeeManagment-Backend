/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tech.getarrays.employeemaanger.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemaanger.model.Employee;

/**
 *
 * @author HP
 */
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    
   void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
