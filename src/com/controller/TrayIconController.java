/*
 * 
 * 
 */
package com.controller;

import com.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author cgomezmendez
 */
public class TrayIconController implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Main.getVentana().setVisible(true);
    }
    
}
