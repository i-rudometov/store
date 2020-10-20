package com.store.simple.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productID;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "product_id")
    Product product;

    @Column(name = "price")
    private double price;

    @Column(name = "date_begin")
    private Date beginDate;

    @Column(name = "date_end")
    private Date endDate;

    protected Price() {}

    public Price(long productID, double price, Date beginDate, Date endDate) {
        this.productID = productID;
        this.price = price;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Price(Long productId, double productPrice) {
        this.price = price;
    }



    public long getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return String.format("Price[productID=%d, price=%d, beginDate=%s, endDate=%s]", productID, price, beginDate, endDate
        );
    }
}
