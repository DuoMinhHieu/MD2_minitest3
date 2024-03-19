import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CrispyFlour crispyFlour = new CrispyFlour("CF001", "Crispy Flour", LocalDate.now(), 10, 5);
        Meat meat = new Meat("MT001", "Beef", LocalDate.now(), 20, 2.5);

        System.out.println("Crispy Flour:");
        displayMaterialInformation(crispyFlour);
        System.out.println("Meat:");
        displayMaterialInformation(meat);
    }
    private static void displayMaterialInformation(Material material) {
        System.out.println("ID: " + material.getId());
        System.out.println("Name: " + material.getName());
        System.out.println("Manufacturing Date: " + material.getManufacturingDate());
        System.out.println("Cost: $" + material.getCost());
        System.out.println("Amount: $" + material.getAmount());
        System.out.println("Expiry Date: " + material.getExpiryDate());
    }
}