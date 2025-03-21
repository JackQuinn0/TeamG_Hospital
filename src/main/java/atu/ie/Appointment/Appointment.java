package atu.ie.Appointment;

import java.util.Date;
public class Appointment {
    private int appointmentID;
    private int patientID;
    private int doctorID;
    private Date appointmentDate;
    private String status; // "Scheduled", "Completed", "Cancelled"

    //Constructor
    public Appointment(int appointmentID, int patientID, int doctorID, Date appointmentDate, String status) {
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

    // Getters+Setters
    public int getAppointmentID() { return appointmentID; }
    public int getPatientID() { return patientID; }
    public int getDoctorID() { return doctorID; }

    public Date getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(Date appointmentDate) { this.appointmentDate = appointmentDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    //display appointment details
    public void displayAppointment() {
        System.out.println("Appointment ID: " + appointmentID + ", Patient ID: " + patientID +
                ", Doctor ID: " + doctorID + ", Date: " + appointmentDate + ", Status: " + status);
    }
}

