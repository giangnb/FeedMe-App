/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.service.ManagerDTO;
import com.feedme.ws.Methods;
import java.util.List;

/**
 *
 * @author Sentinel
 */
public class ManagerProcess {

    private List<ManagerDTO> list;

    public ManagerProcess() {
    }

    /**
     * Manager Login Process
     *
     * @param user
     * @param pass
     * @return
     */
    public String managerLogin(String user, String pass) {
        ManagerDTO m = new ManagerDTO();
        String managerUser = "";
        list = Methods.fetchManagers();
        for (ManagerDTO manager : list) {
            if (user.equals(manager.getUsername()) && pass.equals(manager.getPassword())) {
               managerUser = manager.getUsername();
            }
        }
        return managerUser;
    }
    
    public static void main(String[] args) {
        
    }

}
