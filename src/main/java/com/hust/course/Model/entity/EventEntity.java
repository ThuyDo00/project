package com.hust.course.Model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "event", schema = "public", catalog = "Course")
public class EventEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = -1)
    private String name;
    @Basic
    @Column(name = "date", nullable = true)
    private Timestamp date;
    @Basic
    @Column(name = "event_time", nullable = true)
    private Timestamp eventTime;
    @Basic
    @Column(name = "address", nullable = true, length = -1)
    private String address;
    @Basic
    @Column(name = "count_time", nullable = true)
    private Timestamp countTime;
    @Basic
    @Column(name = "art", nullable = true, length = -1)
    private String art;
    @Basic
    @Column(name = "title", nullable = true, length = -1)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "time_saleoff", nullable = true, length = -1)
    private String timeSaleoff;
    @Basic
    @Column(name = "total_slot", nullable = true)
    private Integer totalSlot;
    @Basic
    @Column(name = "book_slot", nullable = true)
    private Integer bookSlot;
    @Basic
    @Column(name = "readmore", nullable = true, length = -1)
    private String readmore;
    @Basic
    @Column(name = "requite", nullable = true, length = -1)
    private String requite;
    @Basic
    @Column(name = "speakers", nullable = true, length = -1)
    private String speakers;
    @Basic
    @Column(name = "price", nullable = true)
    private Integer price;
    @Basic
    @Column(name = "sale_price", nullable = true)
    private Integer salePrice;
    @Basic
    @Column(name = "percent_sale", nullable = true)
    private Integer percentSale;
    @Basic
    @Column(name = "status", nullable = true)
    private Integer status;
    @Basic
    @Column(name = "total_rating", nullable = true)
    private Integer totalRating;
    @Basic
    @Column(name = "total_start", nullable = true)
    private Integer totalStart;
    @Basic
    @Column(name = "total_review", nullable = true)
    private Integer totalReview;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @ManyToOne
    @JoinColumn(name = "categories_id", referencedColumnName = "id")
    private CategoriesEntity categoriesByCategoriesId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Timestamp getEventTime() {
        return eventTime;
    }

    public void setEventTime(Timestamp eventTime) {
        this.eventTime = eventTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getCountTime() {
        return countTime;
    }

    public void setCountTime(Timestamp countTime) {
        this.countTime = countTime;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeSaleoff() {
        return timeSaleoff;
    }

    public void setTimeSaleoff(String timeSaleoff) {
        this.timeSaleoff = timeSaleoff;
    }

    public Integer getTotalSlot() {
        return totalSlot;
    }

    public void setTotalSlot(Integer totalSlot) {
        this.totalSlot = totalSlot;
    }

    public Integer getBookSlot() {
        return bookSlot;
    }

    public void setBookSlot(Integer bookSlot) {
        this.bookSlot = bookSlot;
    }

    public String getReadmore() {
        return readmore;
    }

    public void setReadmore(String readmore) {
        this.readmore = readmore;
    }

    public String getRequite() {
        return requite;
    }

    public void setRequite(String requite) {
        this.requite = requite;
    }

    public String getSpeakers() {
        return speakers;
    }

    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getPercentSale() {
        return percentSale;
    }

    public void setPercentSale(Integer percentSale) {
        this.percentSale = percentSale;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(Integer totalRating) {
        this.totalRating = totalRating;
    }

    public Integer getTotalStart() {
        return totalStart;
    }

    public void setTotalStart(Integer totalStart) {
        this.totalStart = totalStart;
    }

    public Integer getTotalReview() {
        return totalReview;
    }

    public void setTotalReview(Integer totalReview) {
        this.totalReview = totalReview;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEntity that = (EventEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(date, that.date) && Objects.equals(eventTime, that.eventTime) && Objects.equals(address, that.address) && Objects.equals(countTime, that.countTime) && Objects.equals(art, that.art) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(timeSaleoff, that.timeSaleoff) && Objects.equals(totalSlot, that.totalSlot) && Objects.equals(bookSlot, that.bookSlot) && Objects.equals(readmore, that.readmore) && Objects.equals(requite, that.requite) && Objects.equals(speakers, that.speakers) && Objects.equals(price, that.price) && Objects.equals(salePrice, that.salePrice) && Objects.equals(percentSale, that.percentSale) && Objects.equals(status, that.status) && Objects.equals(totalRating, that.totalRating) && Objects.equals(totalStart, that.totalStart) && Objects.equals(totalReview, that.totalReview) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, eventTime, address, countTime, art, title, description, timeSaleoff, totalSlot, bookSlot, readmore, requite, speakers, price, salePrice, percentSale, status, totalRating, totalStart, totalReview, createdAt, updatedAt);
    }

    public CategoriesEntity getCategoriesByCategoriesId() {
        return categoriesByCategoriesId;
    }

    public void setCategoriesByCategoriesId(CategoriesEntity categoriesByCategoriesId) {
        this.categoriesByCategoriesId = categoriesByCategoriesId;
    }
}
