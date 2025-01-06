package com.cafeapp.controller.dataStructure;

import com.cafeapp.model.MenuItems;
import java.util.LinkedList;
import java.util.List;

/**
 * @author PRANAV_SHARMA_23048577 Implements a stack data structure to manage a
 * list of MenuItems objects. Provides standard stack operations like push, pop,
 * and peek.
 */
public class MenuStack {

    /**
     * Internal storage for the stack, implemented using a LinkedList.
     */
    private List<MenuItems> menuList; // Internal storage for the queue.  

    public MenuStack() {
        /**
         * Constructor to initialize the stack.
         */
        this.menuList = new LinkedList<>();
    }

    /**
     * Removes and returns the last MenuItem added to the stack.
     *
     * @return The last MenuItem in the stack.
     */
    public MenuItems pop() {
        return menuList.removeLast();
    }

    /**
     * Adds a MenuItem to the top of the stack.
     *
     * @param menuModel The MenuItem to add to the stack.
     */
    public void push(MenuItems menuModel) {
        menuList.addLast(menuModel);
    }

    /**
     * Returns the current size of the stack.
     *
     * @return The number of MenuItems in the stack.
     */
    public int poll() {
        return menuList.size();
    }

    /**
     * Returns the last MenuItem added to the stack without removing it.
     *
     * @return The last MenuItem in the stack.
     */
    public MenuItems peek() {
        return menuList.getLast();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return True if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return menuList.isEmpty();
    }

}
