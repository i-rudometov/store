package com.store.simple.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "price")
public class Price {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "price")
    private double price;

    @Column(name = "date_begin")
    private Date beginDate;

    @Column(name = "date_end")
    private Date endDate;

    public Price() {
    }

    public Price(double price) {
        this.price = price;
    }

    @ManyToOne(cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "product_id")
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "\nPrice{" +
                "id=" + id +
                ", price=" + price +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                '}';
    }
}
