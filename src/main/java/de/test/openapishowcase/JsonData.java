package de.test.openapishowcase;

public class JsonData<T> {
    private T data;

    public JsonData() {}
    public JsonData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
