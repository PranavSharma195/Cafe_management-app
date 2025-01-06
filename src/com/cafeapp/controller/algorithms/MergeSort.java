
package com.cafeapp.controller.algorithms;

import com.cafeapp.model.MenuItems;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *Implements insertion sort for a list of MenuItems objects, sorting by their
 * name and id.
 * @author Pranav_Sharma_23048577
 */
public class MergeSort {
    
      public MergeSort() {

    }

    /**
     * Sorts a list of MenuItems objects by their name and id in ascending or
     * descending order.
     * @param menuList The list of MenuItems objects to sort.
     * @param menuField The field to sort by (0 for ID, default for name).
     * @param isAscending A boolean indicating if the sort is in ascending order.
     * @return A sorted LinkedList of MenuItems objects.
     */
    public LinkedList<MenuItems> sort(List<MenuItems> menuList, int menuField, boolean isAscending) {
        List<MenuItems>sortItems=new ArrayList(menuList);
        mergeSort(sortItems, menuField, isAscending, 0, sortItems.size() - 1);
        return new LinkedList<>(sortItems);
    }
    
    /**
     * Performs a recursive merge sort on the provided list of MenuItems.
     * @param menuList The list of MenuItems objects to sort.
     * @param menuField The field to sort by (0 for ID, default for name).
     * @param isAscending A boolean indicating if the sort is in ascending order.
     * @param left The starting index of the sublist to sort.
     * @param right The ending index of the sublist to sort.
     */
    private void mergeSort(List<MenuItems> menuList, int menuField, boolean isAscending, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(menuList, menuField, isAscending, left, mid); // left half
        mergeSort(menuList, menuField, isAscending, mid + 1, right); // rigth half

        merge(menuList, menuField, isAscending, left, mid, right);
    }

    /**
     * Merges two sorted sublists into a single sorted sublist.
     * @param menuList The original list of MenuItems being sorted.
     * @param menuField The field to sort by (0 for ID, default for name).
     * @param isAscending A boolean indicating if the sort is in ascending order.
     * @param start The starting index of the first sublist.
     * @param mid The ending index of the first sublist and the midpoint of the merge.
     * @param end The ending index of the second sublist.
     */
    private void merge(List<MenuItems> menuList, int menuField, boolean isAscending, int start, int mid, int end) {
        LinkedList<MenuItems> tempMenuList = new LinkedList();
        int leftIndex = start;
        int rightIndex = mid + 1;

        while (leftIndex <= mid && rightIndex <= end) {
            boolean condition;
            switch (menuField) {
                case 0: // Compare by price
                    condition = isAscending
                            ? menuList.get(leftIndex).getId() <= menuList.get(rightIndex).getId()
                            : menuList.get(leftIndex).getId() >= menuList.get(rightIndex).getId();
                    break;
                
                default: // by id
                    condition = isAscending
                    ? menuList.get(leftIndex).getName().compareTo(menuList.get(rightIndex).getName()) <= 0
                    : menuList.get(leftIndex).getName().compareTo(menuList.get(rightIndex).getName()) >= 0;

            }

            if (condition) {
                tempMenuList.add(menuList.get(leftIndex++));
            } else {
                tempMenuList.add(menuList.get(rightIndex++));
            }

        }

        while (leftIndex <= mid) {
            tempMenuList.add(menuList.get(leftIndex++));
        }

        while (rightIndex <= end) {
            tempMenuList.add(menuList.get(rightIndex++));
        }

        for (int i = start; i <= end; i++) {
            menuList.set(i, tempMenuList.get(i - start));
        }

    }
    
    
}
