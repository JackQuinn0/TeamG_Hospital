package atu.ie.Doctor;
public class Doctor {
    private int doctorID;
    private String name;
    private String specialization;
    private String contactNumber;

    //Constructor
    public Doctor(int doctorID, String name, String specialization, String contactNumber) {
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
    }

    // Getters+Setters
    public int getDoctorID() { return doctorID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    //display doctor details
    public void displayDoctor() {
        System.out.println("Doctor ID: " + doctorID + ", Name: " + name +
                ", Specialization: " + specialization + ", Contact: " + contactNumber);
    }
}

