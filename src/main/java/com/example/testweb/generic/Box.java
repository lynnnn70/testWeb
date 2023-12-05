package com.example.testweb.generic;

import java.util.Objects;

public class Box<T> {
    private T t;

    private String name;

    private int weight;

    private int height;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append("{t:").append(t);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Box<?> box = (Box<?>) object;
        return weight == box.weight && height == box.height && Objects.equals(t, box.t) && Objects.equals(name, box.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, name, weight, height);
    }
}
