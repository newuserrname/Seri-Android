package com.dmt.thanhtruong.recyclerview;

public class User {
    private int ResourceId;
    private String name; // ten user

    public User(int resourceId, String name) {
        ResourceId = resourceId;
        this.name = name;
    }

    public int getResourceId() {
        return ResourceId;
    }

    public void setResourceId(int resourceId) {
        ResourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
