package bangladeshcricketboard.simulatingoperationsofbangladeshcricketboard.NonUserClass.AllModelClasses;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class Appointment {
    private String ID;
    private String Name;
    private String ContactNumber;
    private String Designation;
    private String Date;
    private String Time;
    private String Discription;

    public Appointment(String ID, String name, String contactNumber, String designation, String date, String time, String discription) {
        this.ID = ID;
        Name = name;
        ContactNumber = contactNumber;
        Designation = designation;
        Date = date;
        Time = time;
        Discription = discription;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    @Override
    public String toString() {
        return ID +","+Name +","+ ContactNumber+","+Designation+","+Date+","+Time+","+Discription;
    }
}
