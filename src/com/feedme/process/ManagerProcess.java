/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.process;

import com.feedme.Global;
import com.feedme.ws.Methods;

/**
 *
 * @author Sentinel
 */
public class ManagerProcess {
   
    
    public ManagerProcess() {
    }

    /**
     * Manager Login Process
     *
     * @param user
     * @param pass
     * @return
     */
    public static boolean managerLogin(String user, String pass) {
        Global.MANAGER = Methods.loginManager(user, pass);
        if (Global.MANAGER==null) {
            return false;
        }
        return true;
    }
}
