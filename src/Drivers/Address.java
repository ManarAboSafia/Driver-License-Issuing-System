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
public class Address {

    private String Country;
    private String city;
    private String StreetName;
    private int MailBoxNumber;

    public Address(String Country, String city, String StreetName, int MailBoxNumber) {
        this.Country = Country;
        this.city = city;
        this.StreetName = StreetName;
        this.MailBoxNumber = MailBoxNumber;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public int getMailBoxNumber() {
        return MailBoxNumber;
    }

    public void setMailBoxNumber(int MailBoxNumber) {
        this.MailBoxNumber = MailBoxNumber;
    }

}
