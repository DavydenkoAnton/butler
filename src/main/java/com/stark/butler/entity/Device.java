package com.stark.butler.entity;

import javax.persistence.*;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = 79 * hash + this.id.hashCode();
        hash = 79 * hash + this.name.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Device device = (Device) obj;
        if (!this.name.equals(device.name)) {
            return false;
        }
        return this.id.equals(device.id);
    }

    @Override
    public String toString() {
        return "Device id:" + this.id + ", name: " + this.name;
    }
}
