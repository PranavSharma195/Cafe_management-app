package com.cafeapp.model;

/**
 *
 * @author Pranav Sharma LMU ID:23048577 Represents an item on the menu,
 * including details such as ID, name, category, price, description, and caloric
 * content.
 */
public class MenuItems {

    private int id;
    private String name;
    private String category;
    private int price;
    private String description;
    private int calories;

    /**
     * Parameterized constructor for the MenuItems class.
     *
     * @param id The unique identifier for the menu item.
     * @param name The name of the menu item.
     * @param category The category to which the menu item belongs (e.g.,
     * Appetizer, Main Course).
     * @param price The price of the menu item in cents or dollars.
     * @param description A brief description of the menu item.
     * @param calories The caloric content of the menu item.
     */
    public MenuItems(int id, String name, String category, int price, String description, int calories) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.calories = calories;
    }

    /**
     * Gets the ID of the menu item.
     *
     * @return The menu item's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the menu item.
     *
     * @return The menu item's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the category of the menu item.
     *
     * @return The menu item's category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets the price of the menu item.
     *
     * @return The menu item's price.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Gets the description of the menu item.
     *
     * @return The menu item's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the caloric content of the menu item.
     *
     * @return The menu item's calories.
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Sets the ID of the menu item.
     *
     * @param id The new ID for the menu item.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the name of the menu item.
     *
     * @param name The new name for the menu item.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the category of the menu item.
     *
     * @param category The new category for the menu item.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Sets the price of the menu item.
     *
     * @param price The new price for the menu item.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Sets the description of the menu item.
     *
     * @param description The new description for the menu item.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the caloric content of the menu item.
     *
     * @param calories The new caloric content for the menu item.
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

}
