package com.cafeapp.controller.algorithms;

import com.cafeapp.model.MenuItems;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pranav_Sharma_23048577 Implements binary search for a list of
 * MenuItems objects, allowing searches by name to return one or more matching
 * indices.
 */
public class BinarySearch {

    /**
     * Default constructor for the BinarySearch class.
     */
    public BinarySearch() {

    }

    /**
     * Searches for all occurrences of a MenuItem by name using binary search.
     *
     * @param menuList The list of MenuItems objects to search.
     * @param searchValue The name of the MenuItem to search for.
     * @return A list of indices where the MenuItem with the specified name is
     * found.
     */
    public List<Integer> searchByName(List<MenuItems> menuList, String searchValue) {
        List<Integer> multipleValueList = new ArrayList();
        int initialValue = binarySearch(menuList, searchValue, 0, menuList.size() - 1);
        if (initialValue == -1) {
            return multipleValueList;
        }
        addToList(multipleValueList, menuList, initialValue, searchValue);
        return multipleValueList;
    }

    /**
     * Adds all indices of matching MenuItems to the result list.
     *
     * @param multipleValueList The list to store indices of matching MenuItems.
     * @param menuList The list of MenuItems objects being searched.
     * @param initialValue The index of the first match found by binary search.
     * @param searchValue The name of the MenuItem to search for.
     */
    private void addToList(List<Integer> multipleValueList, List<MenuItems> menuList, int initialValue, String searchValue) {
        multipleValueList.add(initialValue);
        int i = initialValue - 1;
        int j = initialValue + 1;

        while (i >= 0 && searchValue.trim().equalsIgnoreCase(menuList.get(i).getName().trim())) {
            multipleValueList.add(i--);
        }

        while (j < menuList.size() && searchValue.trim().equalsIgnoreCase(menuList.get(j).getName().trim())) {
            multipleValueList.add(j++);
        }
    }

    /**
     * Performs a binary search to find the index of a MenuItem with the
     * specified name.
     *
     * @param menuList The list of MenuItems objects to search.
     * @param searchValue The name of the MenuItem to search for.
     * @param left The starting index of the sublist to search.
     * @param right The ending index of the sublist to search.
     * @return The index of the matching MenuItem, or -1 if not found.
     */
    private int binarySearch(List<MenuItems> menuList, String searchValue, int left, int right) {

        if (right < left) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (searchValue.trim().equalsIgnoreCase(menuList.get(mid).getName().trim())) {
            return mid;
        }
        if (searchValue.compareToIgnoreCase(menuList.get(mid).getName()) < 0) {
            return binarySearch(menuList, searchValue, left, mid - 1);
        } else {
            return binarySearch(menuList, searchValue, mid + 1, right);
        }
    }

}
