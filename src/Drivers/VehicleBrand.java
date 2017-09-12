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
public class VehicleBrand {

    private int LicenseIdNumber;
    private int PlateNumber;
    private int ManufacturingYear;
    private String VehicleBrand;

    public VehicleBrand(String VehicleBrand) {
        this.VehicleBrand = VehicleBrand;
    }

    public VehicleBrand(int LicenseIdNumber, int PlateNumber, int ManufacturingYear, String VehicleBrand) {
        this.LicenseIdNumber = LicenseIdNumber;
        this.PlateNumber = PlateNumber;
        this.ManufacturingYear = ManufacturingYear;
        this.VehicleBrand = VehicleBrand;
    }

    public int getLicenseIdNumber() {
        return LicenseIdNumber;
    }

    public void setLicenseIdNumber(int LicenseIdNumber) {
        this.LicenseIdNumber = LicenseIdNumber;
    }

    public int getPlateNumber() {
        return PlateNumber;
    }

    public void setPlateNumber(int PlateNumber) {
        this.PlateNumber = PlateNumber;
    }

    public int getManufacturingYear() {
        return ManufacturingYear;
    }

    public void setManufacturingYear(int ManufacturingYear) {
        this.ManufacturingYear = ManufacturingYear;
    }

    public String getVehicleBrand() {
        return VehicleBrand;
    }

    public void setVehicleBrand(String VehicleBrand) {
        this.VehicleBrand = VehicleBrand;
    }

}
