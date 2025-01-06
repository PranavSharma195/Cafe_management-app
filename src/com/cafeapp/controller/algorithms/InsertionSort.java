package com.cafeapp.controller.algorithms;

import com.cafeapp.model.MenuItems;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Implements insertion sort for a list of MenuItems objects, sorting by their
 * calories.
 *
 * @author Pranav_Sharma_23048577
 */
public class InsertionSort {

    /**
     * Sorts a list of MenuItems objects by their calories in ascending or
     * descending order.
     *
     * @param menuList the list of MenuItems objects to be sorted
     * @param isAsc specifies the sort order (true for ascending, false for
     * descending)
     * @return the sorted list
     */
    public LinkedList<MenuItems> sortbyCalories(List<MenuItems> menuList, boolean isAsc) {
        List<MenuItems> sortItems = new ArrayList(menuList);
        for (int i = 1; i < sortItems.size(); i++) {
            MenuItems keyItem = sortItems.get(i);
            int keyCalories = keyItem.getCalories();
            int j = i - 1;

            // Move elements of menuList[0..i-1] that are greater (or smaller) than key
            // to one position ahead of their current position
            while (j >= 0 && shouldSwap(sortItems.get(j).getCalories(), keyCalories, isAsc)) {
                sortItems.set(j + 1, sortItems.get(j));
                j--;
            }
            sortItems.set(j + 1, keyItem);
        }
        return new LinkedList<>(sortItems);
    }

    /**
     * Determines whether two calorie values should be swapped based on the sort
     * order.
     *
     * @param current the calories of the current MenuItems object
     * @param key the calories of the key MenuItems object
     * @param isAsc specifies the sort order (true for ascending, false for
     * descending)
     * @return true if the current value should move; false otherwise
     */
    private boolean shouldSwap(int current, int key, boolean isAsc) {
        return isAsc ? current > key : current < key;
    }
}
