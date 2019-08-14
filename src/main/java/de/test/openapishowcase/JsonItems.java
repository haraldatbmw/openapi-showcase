package de.test.openapishowcase;

import java.util.List;

public class JsonItems<T> {
    private List<T> items;
    private int totalItems;

    public JsonItems(List<T> items, int totalItems) {
        this.items = items;
        this.totalItems = totalItems;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }
}
