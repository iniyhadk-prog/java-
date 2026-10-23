
class ComputerLab {

    // Static data members shared by all objects
    static int totalComputers = 10;
    static int computersInUse = 0;

    String studentName;

    // Constructor
    ComputerLab(String studentName) {
        this.studentName = studentName;
    }

    // Method to allocate a computer
    void useComputer() {
        if (computersInUse < totalComputers) {
            computersInUse++;
            System.out.println(studentName + " is using a computer.");
        } else {
            System.out.println("No computers available for " + studentName);
        }
    }

    // Method to release a computer
    void releaseComputer() {
        if (computersInUse > 0) {
            computersInUse--;
            System.out.println(studentName + " released a computer.");
        } else {
            System.out.println("No computers are currently in use.");
        }
    }

    // Static method to display resource status
    static void displayStatus() {
        System.out.println("\n===== COMPUTER LAB STATUS =====");
        System.out.println("Total Computers     : " + totalComputers);
        System.out.println("Computers In Use    : " + computersInUse);
        System.out.println("Computers Available : "
                + (totalComputers - computersInUse));
        System.out.println("===============================\n");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("SHARED RESOURCE HANDLING SYSTEM");

        // Create student objects
        ComputerLab student1 = new ComputerLab("Arun");
        ComputerLab student2 = new ComputerLab("Ravi");
        ComputerLab student3 = new ComputerLab("Priya");

        // Display initial status
        System.out.println("\nInitial Status:");
        ComputerLab.displayStatus();

        // Allocate computers
        System.out.println("Allocating Computers:");
        student1.useComputer();
        student2.useComputer();
        student3.useComputer();

        // Display status after allocation
        System.out.println("\nStatus After Allocation:");
        ComputerLab.displayStatus();

        // Release a computer
        System.out.println("Releasing Computer:");
        student1.releaseComputer();

        // Display final status
        System.out.println("\nFinal Status:");
        ComputerLab.displayStatus();
    }
}
