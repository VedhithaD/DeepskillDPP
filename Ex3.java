
public class Ex3 {
    public static void main(String[] args) {
        // Basic computer with CPU and RAM only
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB").build();

        // Gaming computer with all optional components
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setMotherboard("Asus ROG Maximus")
                .build();

        // Office computer with medium specs
        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("512GB SSD")
                .build();

        // Output
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
    }
}
