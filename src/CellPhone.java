// Define the CellPhone class
public class CellPhone {
    // Instance variables
    private String imeiCode;
    private String simCard;
    private String processor;
    private int internalMemory;
    private boolean isDualSim;

    // Parameterized constructor
    public CellPhone(String imeiCode, String simCard, String processor, int internalMemory, boolean isDualSim) {
        this.imeiCode = imeiCode;
        this.simCard = simCard;
        this.processor = processor;
        this.internalMemory = internalMemory;
        this.isDualSim = isDualSim;
    }

    // Method to dial a number
    public void dialNumber(String number) {
        System.out.println("Dialing " + number + "...");
    }

    // Method to send an SMS
    public void sendSMS(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}

// Test class
class Main {
    public static void main(String[] args) {
        // Create a CellPhone object
        CellPhone cellPhone1 = new CellPhone("IEDF34343435235", "Nano SIM", "SnapDragon", 8, false);

        // Call methods of cellPhone1
        cellPhone1.dialNumber("1234567890");
        cellPhone1.sendSMS("9876543210", "Hello there!");
    }
}
