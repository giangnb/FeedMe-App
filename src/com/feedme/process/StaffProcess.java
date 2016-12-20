/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.service.EmployeeDTO;
import com.feedme.ws.Methods;
import java.util.List;

/**
 *
 * @author Sentinel
 */
public class StaffProcess {

    private List<EmployeeDTO> employees;

    public StaffProcess() {
    }

    /**
     * Employee Login Process
     *
     * @param user
     * @param managerUser
     * @return
     */
    public EmployeeDTO employeeLogin(String user, String managerUser) {
        EmployeeDTO emp = new EmployeeDTO();
        employees = Methods.fetchEmployees();
        for (EmployeeDTO em : employees) {
            if (!user.equals(em.getUsername()) && !managerUser.equals(em.getManager().getUsername()) && em.isIsEnabled() == false) {
                return null;
            }
            emp.setUsername(em.getUsername());
            emp.setInfo(em.getInfo());
            emp.setIsEnabled(em.getEmployee().isIsEnabled());
            emp.setManager(em.getManager());
        }
        return emp;
    }
    
    public static void main(String[] args) {
       
        
    }
}
