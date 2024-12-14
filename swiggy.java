import java.util.*;
class Swiggy
{
static class Item {
        String name;
        double price;
        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
    private List<Item> items;
    public Swiggy() {
        items = new ArrayList<>();
        items.add(new Item("Burger", 150.0));
        items.add(new Item("Pizza", 250.0));
        items.add(new Item("Pasta", 200.0));
        items.add(new Item("Soda", 50.0));
        items.add(new Item("Fries", 100.0));
    }
    public void showItems() {
        System.out.println("Available items:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).name + " - Rs. " + items.get(i).price);
        }
    }
    public double calculateTotalBill(List<Integer> selectedItems) {
        double totalBill = 0.0;
        for (int itemIndex : selectedItems) {
            totalBill += items.get(itemIndex - 1).price;
        }
        return totalBill;
    }
    public double getItemBill(int itemIndex) {
        if (itemIndex >= 1 && itemIndex <= items.size()) {
            return items.get(itemIndex - 1).price;
        }
        return 0.0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Swiggy swiggy = new Swiggy();
        swiggy.showItems();
        System.out.print("Enter the number of items you want to order (comma separated): ");
        String[] selectedItemNumbers = scanner.nextLine().split(",");
        List<Integer> selectedItems = new ArrayList<>();
        for (String item : selectedItemNumbers) {
            selectedItems.add(Integer.parseInt(item.trim()));
        }
        double totalBill = swiggy.calculateTotalBill(selectedItems);
        System.out.println("Total bill for the selected items: Rs. " + totalBill);
        System.out.print("Enter the item number you want to check the bill for: ");
        int itemIndex = scanner.nextInt();
        double itemBill = swiggy.getItemBill(itemIndex);
        if (itemBill > 0) {
            System.out.println("Bill for the selected item: Rs. " + itemBill);
        } else {
            System.out.println("Invalid item selection.");
        }

        scanner.close();
    }
}