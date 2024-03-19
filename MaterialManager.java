import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class MaterialManager {
    private List<Material> materials;

    public MaterialManager() {
        materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void updateMaterial(String id, Material newMaterial) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                materials.set(i, newMaterial);
                break;
            }
        }
    }

    public void removeMaterial(String id) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                materials.remove(i);
                break;
            }
        }
    }

    public void displayMaterials() {
        for (Material material : materials) {
            System.out.println("ID: " + material.getId());
            System.out.println("Name: " + material.getName());
            System.out.println("Manufacturing Date: " + material.getManufacturingDate());
            System.out.println("Cost: $" + material.getCost());
            System.out.println("Amount: $" + material.getAmount());
            System.out.println("Expiry Date: " + material.getExpiryDate());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MaterialManager materialManager = new MaterialManager();

        CrispyFlour crispyFlour1 = new CrispyFlour("CF001", "Crispy Flour 1", LocalDate.now(), 10, 5);
        CrispyFlour crispyFlour2 = new CrispyFlour("CF002", "Crispy Flour 2", LocalDate.now(), 12, 3);
        materialManager.addMaterial(crispyFlour1);
        materialManager.addMaterial(crispyFlour2);

        materialManager.displayMaterials();

        CrispyFlour updatedCrispyFlour = new CrispyFlour("CF001", "Updated Crispy Flour", LocalDate.now(), 15, 4);
        materialManager.updateMaterial("CF001", updatedCrispyFlour);

        System.out.println("After updating Crispy Flour 1:");
        materialManager.displayMaterials();

        materialManager.removeMaterial("CF002");

        System.out.println("After removing Crispy Flour 2:");
        materialManager.displayMaterials();
    }
}