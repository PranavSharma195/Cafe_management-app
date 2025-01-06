package com.cafeapp.controller.algorithms;

import com.cafeapp.model.MenuItems;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author PRANAV_SHARMA_23048577
 */
public class SelectionSort {
    
     public SelectionSort(){
       
    }
    /**
     * Sorts a list of MenuItems objects by their Price in ascending or
     * descending order.
     *
     * @param menuList the list of StudentModel objects to be sorted
     * @param isAsec specifies the sort order (true for ascending, false for
     * descending)
     * @return the sorted list
     */
    public LinkedList<MenuItems> sortByPrice(List<MenuItems> menuList, boolean isAsec) {
        List<MenuItems>sortItems=new ArrayList(menuList);
        for (int i = 0; i < sortItems.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(sortItems, i, isAsec);
            if (i != extremumIndex) {
                swap(sortItems, i, extremumIndex);
            }
        }

        return new LinkedList<>(sortItems);
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param menuList the list of MenuItems objects
     * @param startIndex the index to start searching from
     * @param isAsec specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<MenuItems> menuList, int startIndex, boolean isAsec) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < menuList.size(); j++) {
            if (shouldSwap(menuList.get(j).getPrice(), menuList.get(extremumIndex).getPrice(), isAsec)) {
               
                extremumIndex = j;
            }
        }
        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isAsec specifies the sort order (true for ascending, false for
     * descending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isAsec) {
        return isAsec ? current < extremum : current > extremum;
    }
   
    /**
     * Swaps two elements in the list.
     *
     * @param menuList the list of MenuItems objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<MenuItems> menuList, int i, int j) {
        MenuItems temp = menuList.get(i);
        menuList.set(i, menuList.get(j));
        menuList.set(j, temp);
    }
    
    
}
