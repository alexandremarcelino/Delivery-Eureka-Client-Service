package com.alexandre.marcelino.delivery.model;

import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long deliveryId;
    @Column(name = "orderId", nullable = false)
    public long orderId;
    @Column(name = "customerId", nullable = false)
    public long customerId;
    @Column(name = "address", nullable = false)
    public String address;
    @Column(name = "shippingValue", nullable = false)
    public long shippingValue;

    public Delivery(long deliveryId, long orderId, long customerId, String address, long shippingValue) {
        this.deliveryId = deliveryId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.address = address;
        this.shippingValue = shippingValue;
    }

    public Delivery() {
    }

    public long getDelivery() {
        return deliveryId;
    }

    public void setDelivery(long delivery) {
        this.deliveryId = delivery;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getShippingValue() {
        return shippingValue;
    }

    public void setShippingValue(long shippingValue) {
        this.shippingValue = shippingValue;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", orderId=" + orderId +
                ", customerId=" + customerId +
                ", address='" + address + '\'' +
                ", shippingValue=" + shippingValue +
                '}';
    }
}
