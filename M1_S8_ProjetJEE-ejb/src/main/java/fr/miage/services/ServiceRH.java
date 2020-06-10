/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.services;

import javax.ejb.Stateless;

/**
 *
 * @author aympa
 */
@Stateless
public class ServiceRH implements ServiceRHRemote {

    @Override
    public void test() {
        System.out.println("HELLO WORLD");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
