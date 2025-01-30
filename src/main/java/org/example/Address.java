package org.example;

import com.beust.ah.A;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Student_Address")
public class Address {
    @Id
    @Column(name="Address_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;


    @Column(name="City",length = 50)
    private String city;
    @Column(name = "Street",length = 200)
    private String street;
    @Column(name = "Society",length = 100)
    private String society;
    @Column(name = "Is_Open")
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name = "Added_Date")
    @Temporal(TemporalType.DATE)
    private Date addDate;

    public Address(){

    }
    public Address(int addressId,String city,String street,String society,boolean isOpen,double x,Date addDate){
        this.addressId= addressId;
        this.city = city;
        this.street = street;
        this.society = society;
        this.isOpen = isOpen;
        this.x = x;
        this.addDate = addDate;
    }

    //Setters
    public void setAddressId(int addressId){
        this.addressId = addressId;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public void setSociety(String society){
        this.society = society;
    }
    public void setOpen(boolean isOpen){
        this.isOpen = isOpen;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setAddDate(Date addDate){
        this.addDate = addDate;
    }

    // Getters


    public int getAddressId() {
        return addressId;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getSociety() {
        return society;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public double getX() {
        return x;
    }

    public Date getAddDate() {
        return addDate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", society='" + society + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addDate=" + addDate +
                '}';
    }

    /*public static void main(String[] args) {
        Address a = new Address();
        System.out.println(a.isOpen(true));
    }*/
}
