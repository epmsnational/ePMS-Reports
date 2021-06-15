/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.services;

import com.vmmc.entities.Userrole;
import java.util.List;

/**
 *
 * @author Developer
 */
public interface UserRoleService {
    int addRole(Userrole ur);
    int removeRole(Userrole ur);
    List<Userrole>getRoles(String userName);
}
