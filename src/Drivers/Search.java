/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drivers;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Dexter
 */
public class Search {

    public int Driverlicense(ArrayList<Drivers> list, int PersonalIdNumber) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPersonalIdNumber() == PersonalIdNumber) {
                index = i;
            }
        }

        return index;
    }

    public int platenumber(ArrayList<Drivers> list, int PlateNumber) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getVB().getPlateNumber() == PlateNumber) {
                index = i;
            }
        }

        return index;
    }

    public int lastname(ArrayList<Drivers> list, String lastname) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().getLastname().equals(lastname)) {
                index = i;
            }
        }

        return index;
    }

    public int LicenseIdNumber(ArrayList<Drivers> list, int LicenseIdNumber) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getVB().getLicenseIdNumber() == LicenseIdNumber) {
                index = i;
            }
        }

        return index;
    }

    public int PersonalIDnumber(ArrayList<Drivers> list, int PersonalIDnumber) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPersonalIdNumber() == PersonalIDnumber) {
                index = i;
            }
        }

        return index;
    }
}
