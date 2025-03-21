package atu.ie.Billing;
import java.util.Date;
public class Billing {
    private int billID;
    private int patientID;
    private double amount;
    private String paymentStatus; // "Paid" or "Unpaid"
    private Date date;

    // Constructor
    public Billing(int billID, int patientID, double amount, String paymentStatus, Date date) {
        this.billID = billID;
        this.patientID = patientID;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.date = date;
    }

    // Getters and Setters
    public int getBillID() { return billID; }
    public int getPatientID() { return patientID; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    // Method to display bill details
    public void displayBill() {
        System.out.println("Bill ID: " + billID + ", Patient ID: " + patientID +
                ", Amount: $" + amount + ", Payment Status: " + paymentStatus + ", Date: " + date);
    }
}
