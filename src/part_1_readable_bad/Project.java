/**
 * Note:
 * This file is excluded is not formatted on purpose to compare the lack of formatting.
 * It also ignores the code enhancement that Intelli-J idea suggest.
 * To see the difference, create a new branch and format the code and click on the warning icon on the top right.
 */

package part_1_readable_bad;

import java.util.List;

public class Project {
    private static final String currency = "usd";    // inventory
    List<Product> inventory = List.of(
            new Product("Flashlight", "🔦", "A really great flashlight", 100, 1, "usd"),
            new Product("Tin can", "🥫", "Pretty much what you would expect from a tin can", 32, 2, "usd"),
            new Product("Cardboard Box", "📦", "It holds things", 5, 3, "usd"));

    public Project() {
        String rowSize = "| %-15s | %-5s | %-50s | %-5d |%n";
        printHeader(currency);
        printInventories(rowSize);
        printFooter();
    }

    private void printInventories(String format) {
        for (Product item : inventory) {
            System.out.format(format, item.name(), item.img(), item.desc(),item.price());
        }
    }

    private static void printFooter() {
        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");
    }

    private static void printHeader(String currency) {
        System.out.println("1 Readable Bad ❌");
        System.out.println("Global currency: " + currency);
        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");
        System.out.format("| Product         | Image | Description                                        | Price |%n");
        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");
    }
}