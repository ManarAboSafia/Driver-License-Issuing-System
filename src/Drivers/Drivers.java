/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drivers;

/**
 *
 * @author Dexter
 */
public class Drivers {

    private Name name;//
    private Address address;//
    private int PersonalIdNumber;//
    private String DrivingExperience;
    private String VehicleType;
    private VehicleBrand VB;
    private int Validity;

    public Drivers(Name name, Address address, int PersonalIdNumber, String DrivingExperience, VehicleBrand VB, int Validity,String VehicleType) {
        this.name = name;
        this.address = address;
        this.PersonalIdNumber = PersonalIdNumber;
        this.DrivingExperience = DrivingExperience;
        this.VB = VB;
        this.Validity = Validity;
        this.VehicleType=VehicleType;
        
    }

    public Drivers(Name name, Address address, int PersonalIdNumber) {
        this.name = name;
        this.address = address;
        this.PersonalIdNumber = PersonalIdNumber;
    }

   

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPersonalIdNumber() {
        return PersonalIdNumber;
    }

    public void setPersonalIdNumber(int PersonalIdNumber) {
        this.PersonalIdNumber = PersonalIdNumber;
    }

    public String getDrivingExperience() {
        return DrivingExperience;
    }

    public void setDrivingExperience(String DrivingExperience) {
        this.DrivingExperience = DrivingExperience;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public VehicleBrand getVB() {
        return VB;
    }

    public void setVB(VehicleBrand VB) {
        this.VB = VB;
    }

    public int getValidity() {
        return Validity;
    }

    public void setValidity(int Validity) {
        this.Validity = Validity;
    }
    
    
}
