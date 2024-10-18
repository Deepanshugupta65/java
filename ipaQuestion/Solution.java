package ipaQuestion;
import java.util.Scanner;

class Resort {
    // Private attributes
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    // Constructor to initialize all attributes
    public Resort(int resortId, String resortName, String category, double price, double rating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    // Getters and Setters for each attribute
    public int getResortId() {
        return resortId;
    }

    public void setResortId(int resortId) {
        this.resortId = resortId;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resort[] resorts = new Resort[4];

        // Reading input for 4 Resort objects
        for (int i = 0; i < 4; i++) {
            int resortId = sc.nextInt();
            sc.nextLine(); // To consume the newline character after integer input
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            resorts[i] = new Resort(resortId, resortName, category, price, rating);
        }

        sc.nextLine(); // To consume the newline character after last double input
        String searchCategory = sc.nextLine(); // Reading the category to search for

        // Calling the method and printing the result
        int averagePrice = findAvgPriceByCategory(resorts, searchCategory);
        if (averagePrice > 0) {
            System.out.println("Average price of the " + searchCategory + " Resort: " + averagePrice);
        } else {
            System.out.println("There are no such available resort");
        }

        sc.close();
    }

    // Static method to find the average price by category with rating > 4
    public static int findAvgPriceByCategory(Resort[] resorts, String category) {
        double totalPrice = 0;
        int count = 0;

        // Iterate over each resort to find matches based on category and rating
        for (Resort resort : resorts) {
            if (resort.getCategory().equalsIgnoreCase(category) && resort.getRating() > 4) {
                totalPrice += resort.getPrice();
                count++;
            }
        }

        // If there are no resorts matching the criteria, return 0
        if (count == 0) {
            return 0;
        }

        // Calculate the average price and return as an integer
        return (int) (totalPrice / count);
    }
}
