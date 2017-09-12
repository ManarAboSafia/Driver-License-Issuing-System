/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drivers;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dexter
 */
public class Start {

    private static int LicenseIdNumber = 100000;
    private static int PlateNumber = 60000000;
    private static ArrayList<Drivers> driverlist = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String choose = JOptionPane.showInputDialog(null, "1.Create  new  driver  license"
                + "\n2.Modify  driver  license  information"
                + "\n3.Search  for  a  driver"
                + "\n4.Delete  a  driver  license"
                + "\n5.Display  the  information  of  any  driver  license"
                + "\n                            Enter Done to Exit", "Choose", 1);

        if (choose.equals("1")) {
            for (int i = 0; i != 1; i += 0) {
                String firstname = JOptionPane.showInputDialog("Enter First Name");
                String middlename = JOptionPane.showInputDialog("Enter Middle Name");
                String lastname = JOptionPane.showInputDialog("Enter Last Name");
                String Country = JOptionPane.showInputDialog("Enter a Country");
                String city = JOptionPane.showInputDialog("Enter a city");
                String StreetName = JOptionPane.showInputDialog("Enter a Street Name");
                String MailBoxNumber = JOptionPane.showInputDialog("Enter a Mail Box Number");
                String PersonalIdNumber = JOptionPane.showInputDialog("Enter a Personal Id Number");
                String DrivingExperience = JOptionPane.showInputDialog("Enter a Driving Experience");
                String VehicleType = JOptionPane.showInputDialog("Enter Vehicle Type");
                String ManufacturingYear = JOptionPane.showInputDialog("Enter a Manu facturing Year");
                String VehicleBrand = JOptionPane.showInputDialog("Enter a Vehicle Brand");
                int Validity = 1;
                if (DrivingExperience.equalsIgnoreCase("expert")) {
                    Validity = 4;
                }
                Drivers drivers = new Drivers(new Name(firstname, middlename, lastname),
                        new Address(Country, city, StreetName, Integer.parseInt(MailBoxNumber)),
                        Integer.parseInt(PersonalIdNumber), DrivingExperience,
                        new VehicleBrand(LicenseIdNumber, PlateNumber, Integer.parseInt(ManufacturingYear), VehicleBrand),
                        Validity, VehicleType);

                LicenseIdNumber++;
                PlateNumber++;

                i = JOptionPane.showConfirmDialog(null,
                        "Name is :" + drivers.getName().getFirstname() + " " + drivers.getName().getMiddlename() + " " + drivers.getName().getLastname()
                        + "\nPersonal Id Number is: " + PersonalIdNumber
                        + "\nAddress is :" + drivers.getAddress().getCountry() + "  " + drivers.getAddress().getCity()
                        + "  " + drivers.getAddress().getStreetName() + "    " + drivers.getAddress().getMailBoxNumber()
                        + "\nDriving Experience : " + drivers.getDrivingExperience()
                        + "\nVehicle Type : " + drivers.getVehicleType()
                        + "\nVehicle Brand : " + drivers.getVB().getVehicleBrand()
                        + "\nLicense Id Number : " + drivers.getVB().getLicenseIdNumber()
                        + "\nPlate Number : " + drivers.getVB().getPlateNumber()
                        + "\nValidity : " + drivers.getValidity() + "\nDo you want to create new driver license ? ", "Create new driver license",
                        JOptionPane.YES_NO_OPTION);
                driverlist.add(drivers);
                if (i == 1) {
                    main(args);
                }
            }
        } else if (choose.equals("2")) {
            for (int q = 0; q != 1; q += 0) {
                int chek = -1;
                String pidns = JOptionPane.showInputDialog("Enter personal ID number to Modify");
                for (int i = 0; i < driverlist.size(); i++) {
                    if (Integer.parseInt(pidns) == driverlist.get(i).getPersonalIdNumber()) {
                        chek = i;
                        break;
                    }
                }
                if (chek == -1) {
                    JOptionPane.showMessageDialog(null, "Not found personal ");
                    main(args);
                }
                String modify = JOptionPane.showInputDialog(null, "1-Driver’s Name"
                        + "\n2-Driver’s personal ID number"
                        + "\n3-Driver’s Address"
                        + "\n4-Driver’s driving experience"
                        + "\n5-Driver’s vehicle type"
                        + "\n6-Driver’s vehicle brand"
                        + "\n7-The year of issuing the license", "Modify Option", JOptionPane.INFORMATION_MESSAGE);
                if (modify.equals("1")) {
                    String firstname = JOptionPane.showInputDialog("Enter First Name");
                    String middlename = JOptionPane.showInputDialog("Enter Middle Name");
                    String lastname = JOptionPane.showInputDialog("Enter Last Name");
                    driverlist.get(chek).setName(new Name(firstname, middlename, lastname));
                    q = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(chek).getName().getFirstname() + " " + driverlist.get(chek).getName().getMiddlename()
                            + " " + driverlist.get(chek).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(chek).getPersonalIdNumber()
                            + "\nAddress is :" + driverlist.get(chek).getAddress().getCountry() + "  " + driverlist.get(chek).getAddress().getCity()
                            + "  " + driverlist.get(chek).getAddress().getStreetName() + "    " + driverlist.get(chek).getAddress().getMailBoxNumber()
                            + "\nDriving Experience : " + driverlist.get(chek).getDrivingExperience()
                            + "\nVehicle Type : " + driverlist.get(chek).getVehicleType()
                            + "\nVehicle Brand : " + driverlist.get(chek).getVB().getVehicleBrand()
                            + "\nLicense Id Number : " + driverlist.get(chek).getVB().getLicenseIdNumber()
                            + "\nPlate Number : " + driverlist.get(chek).getVB().getPlateNumber()
                            + "\nValidity : " + driverlist.get(chek).getValidity() + "\nDo you want to Modify another item?", "Modify another item?",
                            JOptionPane.YES_NO_OPTION);
                    main(args);
                } else if (modify.equals("2")) {
                    String PersonalIdNumber = JOptionPane.showInputDialog("Enter a Personal Id Number");
                    driverlist.get(chek).setPersonalIdNumber(Integer.parseInt(PersonalIdNumber));
                    q = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(chek).getName().getFirstname() + " " + driverlist.get(chek).getName().getMiddlename()
                            + " " + driverlist.get(chek).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(chek).getPersonalIdNumber()
                            + "\nAddress is :" + driverlist.get(chek).getAddress().getCountry() + "  " + driverlist.get(chek).getAddress().getCity()
                            + "  " + driverlist.get(chek).getAddress().getStreetName() + "    " + driverlist.get(chek).getAddress().getMailBoxNumber()
                            + "\nDriving Experience : " + driverlist.get(chek).getDrivingExperience()
                            + "\nVehicle Type : " + driverlist.get(chek).getVehicleType()
                            + "\nVehicle Brand : " + driverlist.get(chek).getVB().getVehicleBrand()
                            + "\nLicense Id Number : " + driverlist.get(chek).getVB().getLicenseIdNumber()
                            + "\nPlate Number : " + driverlist.get(chek).getVB().getPlateNumber()
                            + "\nValidity : " + driverlist.get(chek).getValidity() + "\nDo you want to Modify another item?", "Modify another item?",
                            JOptionPane.YES_NO_OPTION);
                    main(args);

                } else if (modify.equals("3")) {
                    String Country = JOptionPane.showInputDialog("Enter a Country");
                    String city = JOptionPane.showInputDialog("Enter a city");
                    String StreetName = JOptionPane.showInputDialog("Enter a Street Name");
                    String MailBoxNumber = JOptionPane.showInputDialog("Enter a Mail Box Number");
                    driverlist.get(chek).setAddress(new Address(Country, city, StreetName, Integer.parseInt(MailBoxNumber)));
                    q = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(chek).getName().getFirstname() + " " + driverlist.get(chek).getName().getMiddlename()
                            + " " + driverlist.get(chek).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(chek).getPersonalIdNumber()
                            + "\nAddress is :" + driverlist.get(chek).getAddress().getCountry() + "  " + driverlist.get(chek).getAddress().getCity()
                            + "  " + driverlist.get(chek).getAddress().getStreetName() + "    " + driverlist.get(chek).getAddress().getMailBoxNumber()
                            + "\nDriving Experience : " + driverlist.get(chek).getDrivingExperience()
                            + "\nVehicle Type : " + driverlist.get(chek).getVehicleType()
                            + "\nVehicle Brand : " + driverlist.get(chek).getVB().getVehicleBrand()
                            + "\nLicense Id Number : " + driverlist.get(chek).getVB().getLicenseIdNumber()
                            + "\nPlate Number : " + driverlist.get(chek).getVB().getPlateNumber()
                            + "\nValidity : " + driverlist.get(chek).getValidity() + "\nDo you want to Modify another item?", "Modify another item?",
                            JOptionPane.YES_NO_OPTION);
                    main(args);

                } else if (modify.equals("4")) {
                    String DrivingExperience = JOptionPane.showInputDialog("Enter a Driving Experience");
                    driverlist.get(chek).setDrivingExperience(DrivingExperience);
                    q = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(chek).getName().getFirstname() + " " + driverlist.get(chek).getName().getMiddlename()
                            + " " + driverlist.get(chek).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(chek).getPersonalIdNumber()
                            + "\nAddress is :" + driverlist.get(chek).getAddress().getCountry() + "  " + driverlist.get(chek).getAddress().getCity()
                            + "  " + driverlist.get(chek).getAddress().getStreetName() + "    " + driverlist.get(chek).getAddress().getMailBoxNumber()
                            + "\nDriving Experience : " + driverlist.get(chek).getDrivingExperience()
                            + "\nVehicle Type : " + driverlist.get(chek).getVehicleType()
                            + "\nVehicle Brand : " + driverlist.get(chek).getVB().getVehicleBrand()
                            + "\nLicense Id Number : " + driverlist.get(chek).getVB().getLicenseIdNumber()
                            + "\nPlate Number : " + driverlist.get(chek).getVB().getPlateNumber()
                            + "\nValidity : " + driverlist.get(chek).getValidity() + "\nDo you want to Modify another item?", "Modify another item?",
                            JOptionPane.YES_NO_OPTION);
                    main(args);

                } else if (modify.equals("5")) {
                    String VehicleType = JOptionPane.showInputDialog("Enter Vehicle Type");
                    driverlist.get(chek).setVehicleType(VehicleType);
                    q = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(chek).getName().getFirstname() + " " + driverlist.get(chek).getName().getMiddlename()
                            + " " + driverlist.get(chek).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(chek).getPersonalIdNumber()
                            + "\nAddress is :" + driverlist.get(chek).getAddress().getCountry() + "  " + driverlist.get(chek).getAddress().getCity()
                            + "  " + driverlist.get(chek).getAddress().getStreetName() + "    " + driverlist.get(chek).getAddress().getMailBoxNumber()
                            + "\nDriving Experience : " + driverlist.get(chek).getDrivingExperience()
                            + "\nVehicle Type : " + driverlist.get(chek).getVehicleType()
                            + "\nVehicle Brand : " + driverlist.get(chek).getVB().getVehicleBrand()
                            + "\nLicense Id Number : " + driverlist.get(chek).getVB().getLicenseIdNumber()
                            + "\nPlate Number : " + driverlist.get(chek).getVB().getPlateNumber()
                            + "\nValidity : " + driverlist.get(chek).getValidity() + "\nDo you want to Modify another item?", "Modify another item?",
                            JOptionPane.YES_NO_OPTION);
                    main(args);

                } else if (modify.equals("6")) {
                    String VehicleBrand = JOptionPane.showInputDialog("Enter a Vehicle Brand");
                    driverlist.get(chek).setVB(new VehicleBrand(VehicleBrand));
                    q = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(chek).getName().getFirstname() + " " + driverlist.get(chek).getName().getMiddlename()
                            + " " + driverlist.get(chek).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(chek).getPersonalIdNumber()
                            + "\nAddress is :" + driverlist.get(chek).getAddress().getCountry() + "  " + driverlist.get(chek).getAddress().getCity()
                            + "  " + driverlist.get(chek).getAddress().getStreetName() + "    " + driverlist.get(chek).getAddress().getMailBoxNumber()
                            + "\nDriving Experience : " + driverlist.get(chek).getDrivingExperience()
                            + "\nVehicle Type : " + driverlist.get(chek).getVehicleType()
                            + "\nVehicle Brand : " + driverlist.get(chek).getVB().getVehicleBrand()
                            + "\nLicense Id Number : " + driverlist.get(chek).getVB().getLicenseIdNumber()
                            + "\nPlate Number : " + driverlist.get(chek).getVB().getPlateNumber()
                            + "\nValidity : " + driverlist.get(chek).getValidity() + "\nDo you want to Modify another item?", "Modify another item?",
                            JOptionPane.YES_NO_OPTION);
                    main(args);

                } else if (modify.equals("7")) {
                    String Validity = JOptionPane.showInputDialog("Enter a Validity");
                    driverlist.get(chek).setValidity(Integer.parseInt(Validity));
                    q = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(chek).getName().getFirstname() + " " + driverlist.get(chek).getName().getMiddlename()
                            + " " + driverlist.get(chek).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(chek).getPersonalIdNumber()
                            + "\nAddress is :" + driverlist.get(chek).getAddress().getCountry() + "  " + driverlist.get(chek).getAddress().getCity()
                            + "  " + driverlist.get(chek).getAddress().getStreetName() + "    " + driverlist.get(chek).getAddress().getMailBoxNumber()
                            + "\nDriving Experience : " + driverlist.get(chek).getDrivingExperience()
                            + "\nVehicle Type : " + driverlist.get(chek).getVehicleType()
                            + "\nVehicle Brand : " + driverlist.get(chek).getVB().getVehicleBrand()
                            + "\nLicense Id Number : " + driverlist.get(chek).getVB().getLicenseIdNumber()
                            + "\nPlate Number : " + driverlist.get(chek).getVB().getPlateNumber()
                            + "\nValidity : " + driverlist.get(chek).getValidity() + "\nDo you want to Modify another item?", "Modify another item?",
                            JOptionPane.YES_NO_OPTION);
                    main(args);

                }
            }
        } else if (choose.equals("3")) {
            Search search = new Search();
            for (int q = 0; q != 1; q += 0) {

                String searchby = JOptionPane.showInputDialog(null, "\n1-Driver’s license number "
                        + "\n2-Driver’s personal ID number"
                        + "\n3-Car registration plate number"
                        + "\n4-Driver’s last name", "Search", 1);
                if (searchby.equals("1")) {
                    int index = search.LicenseIdNumber(driverlist, Integer.parseInt(JOptionPane.showInputDialog("Enter Driver license number  for search")));
                    if (index == -1) {
                        JOptionPane.showMessageDialog(null, "Not Found");
                        main(args);
                    }
                    String yes = JOptionPane.showInputDialog("1-Name : " + driverlist.get(index).getName().getFirstname()
                            + " " + driverlist.get(index).getName().getMiddlename()
                            + " " + driverlist.get(index).getName().getLastname()
                            + "\n2-LicenseIdNumber : " + driverlist.get(index).getVB().getLicenseIdNumber());

                    if (yes.equals("yes")) {
                        q = JOptionPane.showConfirmDialog(null,
                                "Name is :" + driverlist.get(index).getName().getFirstname() + " " + driverlist.get(index).getName().getMiddlename()
                                + " " + driverlist.get(index).getName().getLastname()
                                + "\nPersonal Id Number is: " + driverlist.get(index).getPersonalIdNumber()
                                + "\nAddress is :" + driverlist.get(index).getAddress().getCountry()
                                + "  " + driverlist.get(index).getAddress().getCity()
                                + "  " + driverlist.get(index).getAddress().getStreetName()
                                + "    " + driverlist.get(index).getAddress().getMailBoxNumber()
                                + "\nDriving Experience : " + driverlist.get(index).getDrivingExperience()
                                + "\nVehicle Type : " + driverlist.get(index).getVehicleType()
                                + "\nVehicle Brand : " + driverlist.get(index).getVB().getVehicleBrand()
                                + "\nLicense Id Number : " + driverlist.get(index).getVB().getLicenseIdNumber()
                                + "\nPlate Number : " + driverlist.get(index).getVB().getPlateNumber()
                                + "\nValidity : " + driverlist.get(index).getValidity() + "\nDo you want to Search another item?", "Search another item?",
                                JOptionPane.YES_NO_OPTION);
                        main(args);

                    }
                } else if (searchby.equals("2")) {
                    int index = search.Driverlicense(driverlist, Integer.parseInt(JOptionPane.showInputDialog("Enter personal ID number for search")));
                    if (index == -1) {
                        JOptionPane.showMessageDialog(null, "Not Found");
                        main(args);
                    }
                    String yes = JOptionPane.showInputDialog("1-Name : " + driverlist.get(index).getName().getFirstname()
                            + " " + driverlist.get(index).getName().getMiddlename()
                            + " " + driverlist.get(index).getName().getLastname()
                            + "\n2-LicenseIdNumber : " + driverlist.get(index).getVB().getLicenseIdNumber());
                    if (yes.equals("yes")) {
                        q = JOptionPane.showConfirmDialog(null,
                                "Name is :" + driverlist.get(index).getName().getFirstname() + " " + driverlist.get(index).getName().getMiddlename()
                                + " " + driverlist.get(index).getName().getLastname()
                                + "\nPersonal Id Number is: " + driverlist.get(index).getPersonalIdNumber()
                                + "\nAddress is :" + driverlist.get(index).getAddress().getCountry()
                                + "  " + driverlist.get(index).getAddress().getCity()
                                + "  " + driverlist.get(index).getAddress().getStreetName()
                                + "    " + driverlist.get(index).getAddress().getMailBoxNumber()
                                + "\nDriving Experience : " + driverlist.get(index).getDrivingExperience()
                                + "\nVehicle Type : " + driverlist.get(index).getVehicleType()
                                + "\nVehicle Brand : " + driverlist.get(index).getVB().getVehicleBrand()
                                + "\nLicense Id Number : " + driverlist.get(index).getVB().getLicenseIdNumber()
                                + "\nPlate Number : " + driverlist.get(index).getVB().getPlateNumber()
                                + "\nValidity : " + driverlist.get(index).getValidity() + "\nDo you want to Search another item?", "Search another item?",
                                JOptionPane.YES_NO_OPTION);
                        main(args);

                    }

                } else if (searchby.equals("3")) {
                    int index = search.platenumber(driverlist, Integer.parseInt(JOptionPane.showInputDialog("Enter plate number for search")));
                    if (index == -1) {
                        JOptionPane.showMessageDialog(null, "Not Found");
                        main(args);
                    }
                    String yes = JOptionPane.showInputDialog("1-Name : " + driverlist.get(index).getName().getFirstname()
                            + " " + driverlist.get(index).getName().getMiddlename()
                            + " " + driverlist.get(index).getName().getLastname()
                            + "\n2-LicenseIdNumber : " + driverlist.get(index).getVB().getLicenseIdNumber());
                    if (yes.equals("yes")) {
                        q = JOptionPane.showConfirmDialog(null,
                                "Name is :" + driverlist.get(index).getName().getFirstname() + " " + driverlist.get(index).getName().getMiddlename()
                                + " " + driverlist.get(index).getName().getLastname()
                                + "\nPersonal Id Number is: " + driverlist.get(index).getPersonalIdNumber()
                                + "\nAddress is :" + driverlist.get(index).getAddress().getCountry()
                                + "  " + driverlist.get(index).getAddress().getCity()
                                + "  " + driverlist.get(index).getAddress().getStreetName()
                                + "    " + driverlist.get(index).getAddress().getMailBoxNumber()
                                + "\nDriving Experience : " + driverlist.get(index).getDrivingExperience()
                                + "\nVehicle Type : " + driverlist.get(index).getVehicleType()
                                + "\nVehicle Brand : " + driverlist.get(index).getVB().getVehicleBrand()
                                + "\nLicense Id Number : " + driverlist.get(index).getVB().getLicenseIdNumber()
                                + "\nPlate Number : " + driverlist.get(index).getVB().getPlateNumber()
                                + "\nValidity : " + driverlist.get(index).getValidity() + "\nDo you want to Search another item?", "Search another item?",
                                JOptionPane.YES_NO_OPTION);
                        main(args);

                    }
                } else if (searchby.equals("4")) {
                    int index = search.lastname(driverlist, JOptionPane.showInputDialog("Enter Driver last name for search"));
                    if (index == -1) {
                        JOptionPane.showMessageDialog(null, "Not Found");
                        main(args);
                    }
                    String yes = JOptionPane.showInputDialog("1-Name : " + driverlist.get(index).getName().getFirstname()
                            + " " + driverlist.get(index).getName().getMiddlename()
                            + " " + driverlist.get(index).getName().getLastname()
                            + "\n2-LicenseIdNumber : " + driverlist.get(index).getVB().getLicenseIdNumber());
                    if (yes.equals("yes")) {
                        q = JOptionPane.showConfirmDialog(null,
                                "Name is :" + driverlist.get(index).getName().getFirstname() + " " + driverlist.get(index).getName().getMiddlename()
                                + " " + driverlist.get(index).getName().getLastname()
                                + "\nPersonal Id Number is: " + driverlist.get(index).getPersonalIdNumber()
                                + "\nAddress is :" + driverlist.get(index).getAddress().getCountry()
                                + "  " + driverlist.get(index).getAddress().getCity()
                                + "  " + driverlist.get(index).getAddress().getStreetName()
                                + "    " + driverlist.get(index).getAddress().getMailBoxNumber()
                                + "\nDriving Experience : " + driverlist.get(index).getDrivingExperience()
                                + "\nVehicle Type : " + driverlist.get(index).getVehicleType()
                                + "\nVehicle Brand : " + driverlist.get(index).getVB().getVehicleBrand()
                                + "\nLicense Id Number : " + driverlist.get(index).getVB().getLicenseIdNumber()
                                + "\nPlate Number : " + driverlist.get(index).getVB().getPlateNumber()
                                + "\nValidity : " + driverlist.get(index).getValidity() + "\nDo you want to Search another item?", "Search another item?",
                                JOptionPane.YES_NO_OPTION);
                        main(args);

                    }

                }
            }
        } else if (choose.equals("4")) {
            Search search = new Search();
            int index = search.Driverlicense(driverlist, Integer.parseInt(JOptionPane.showInputDialog("Enter personal ID number")));
            if (index == -1) {
                JOptionPane.showMessageDialog(null, "Not Found");
                main(args);
            }
            int chos = JOptionPane.showConfirmDialog(null,
                    "Name is :" + driverlist.get(index).getName().getFirstname() + " " + driverlist.get(index).getName().getMiddlename()
                    + " " + driverlist.get(index).getName().getLastname()
                    + "\nPersonal Id Number is: " + driverlist.get(index).getPersonalIdNumber()
                    + "\nAddress is :" + driverlist.get(index).getAddress().getCountry()
                    + "  " + driverlist.get(index).getAddress().getCity()
                    + "  " + driverlist.get(index).getAddress().getStreetName()
                    + "    " + driverlist.get(index).getAddress().getMailBoxNumber()
                    + "\nDriving Experience : " + driverlist.get(index).getDrivingExperience()
                    + "\nVehicle Type : " + driverlist.get(index).getVehicleType()
                    + "\nVehicle Brand : " + driverlist.get(index).getVB().getVehicleBrand()
                    + "\nLicense Id Number : " + driverlist.get(index).getVB().getLicenseIdNumber()
                    + "\nPlate Number : " + driverlist.get(index).getVB().getPlateNumber()
                    + "\nValidity : " + driverlist.get(index).getValidity() + "\nThe information of this license will be lost,Are you sure ? ", "Warning",
                    JOptionPane.YES_NO_OPTION);
            if (chos == 0) {
                driverlist.remove(index);
                main(args);

            } else {
                main(args);
            }
        } else if (choose.equals("5")) {
            String cho = JOptionPane.showInputDialog("1-Show All\n2-Show Specific");
            if (cho.equals("1")) {
                for (int i = 0; i < driverlist.size(); i++) {
                    int coun = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(i).getName().getFirstname() + " " + driverlist.get(i).getName().getMiddlename()
                            + " " + driverlist.get(i).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(i).getPersonalIdNumber()
                            + "\nLicense Id Number : " + driverlist.get(i).getVB().getLicenseIdNumber(), "Warning", JOptionPane.OK_CANCEL_OPTION);
                    if (coun == 1) {
                        main(args);
                    }
                }
                main(args);

            } else if (cho.equals("2")) {
                Search search = new Search();
                String choo = JOptionPane.showInputDialog("1-License ID number\n2-Personal ID number");
                if (choo.equals("1")) {
                    int index = search.LicenseIdNumber(driverlist, Integer.parseInt(JOptionPane.showInputDialog("Enter License ID number")));
                    int coun = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(index).getName().getFirstname() + " " + driverlist.get(index).getName().getMiddlename()
                            + " " + driverlist.get(index).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(index).getPersonalIdNumber()
                            + "\nLicense Id Number : " + driverlist.get(index).getVB().getLicenseIdNumber(), "Warning", JOptionPane.OK_CANCEL_OPTION);
                    main(args);

                } else if (choo.equals("2")) {
                    int index = search.PersonalIDnumber(driverlist, Integer.parseInt(JOptionPane.showInputDialog("Enter Personal ID number")));
                    int coun = JOptionPane.showConfirmDialog(null,
                            "Name is :" + driverlist.get(index).getName().getFirstname() + " " + driverlist.get(index).getName().getMiddlename()
                            + " " + driverlist.get(index).getName().getLastname()
                            + "\nPersonal Id Number is: " + driverlist.get(index).getPersonalIdNumber()
                            + "\nLicense Id Number : " + driverlist.get(index).getVB().getLicenseIdNumber(), "Warning", JOptionPane.OK_CANCEL_OPTION);
                    main(args);

                }
            }
        } else if(choose.equals("done")){
            System.exit(0);
        }
    }
}
