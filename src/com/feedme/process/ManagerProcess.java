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
    public ManagerDTO managerLogin(String user, String pass) {
        ManagerDTO m = new ManagerDTO();
        list = Methods.fetchManagers();
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (ManagerDTO manager : list) {
            if (!user.equalsIgnoreCase(manager.getUsername()) && !pass.equalsIgnoreCase(manager.getPassword())) {
                return null;
            }
            m.setUsername(manager.getUsername());
            m.setPassword(manager.getPassword());
            m.setInfo(manager.getInfo());
            m.setPriviledge(manager.getPriviledge());
        }
        return m;
    }
}
