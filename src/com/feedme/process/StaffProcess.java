/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.Global;
import com.feedme.service.EmployeeDTO;
import com.feedme.service.ManagerDTO;
import com.feedme.ws.Methods;
import java.util.List;

/**
 *
 * @author Sentinel
 */
public class StaffProcess {

    public StaffProcess() {
    }

    /**
     * Employee Login Process
     *
     * @param dto
     * @param user
     * @return
     */
    public static boolean employeeLogin(ManagerDTO dto,String user) {
        Global.EMPLOYEE = Methods.loginEmployee(dto, user);
        if (Global.EMPLOYEE==null) {
           return false;
        }
        return true;
    }
}
