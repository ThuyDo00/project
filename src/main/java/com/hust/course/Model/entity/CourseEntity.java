package com.hust.course.Model.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "course", schema = "public", catalog = "Course")
public class CourseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = -1)
    private String name;
    @Basic
    @Column(name = "art", nullable = true, length = -1)
    private String art;
    @Basic
    @Column(name = "slug", nullable = true, length = -1)
    private String slug;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "content", nullable = true, length = -1)
    private String content;
    @Basic
    @Column(name = "time_saleoff", nullable = true, length = -1)
    private String timeSaleoff;
    @Basic
    @Column(name = "duration", nullable = true, length = -1)
    private String duration;
    @Basic
    @Column(name = "lectures", nullable = true)
    private Integer lectures;
    @Basic
    @Column(name = "enrolles", nullable = true)
    private Integer enrolles;
    @Basic
    @Column(name = "language", nullable = true, length = -1)
    private String language;
    @Basic
    @Column(name = "skill_level", nullable = true, length = -1)
    private String skillLevel;
    @Basic
    @Column(name = "deadline", nullable = true)
    private Timestamp deadline;
    @Basic
    @Column(name = "cartificate", nullable = true)
    private Integer cartificate;
    @Basic
    @Column(name = "readmore", nullable = true, length = -1)
    private String readmore;
    @Basic
    @Column(name = "requite", nullable = true, length = -1)
    private String requite;
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
    @OneToMany(mappedBy = "courseByCourseId")
    private Collection<CoursePartEntity> coursePartsById;
    @OneToMany(mappedBy = "courseByCourseId")
    private Collection<InstructorEntity> instructorsById;
    @OneToMany(mappedBy = "courseByCourseId")
    private Collection<LessonEntity> lessonsById;
    @OneToMany(mappedBy = "courseByCourseId")
    private Collection<RatingCommentsEntity> ratingCommentsById;

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

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimeSaleoff() {
        return timeSaleoff;
    }

    public void setTimeSaleoff(String timeSaleoff) {
        this.timeSaleoff = timeSaleoff;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getLectures() {
        return lectures;
    }

    public void setLectures(Integer lectures) {
        this.lectures = lectures;
    }

    public Integer getEnrolles() {
        return enrolles;
    }

    public void setEnrolles(Integer enrolles) {
        this.enrolles = enrolles;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public Integer getCartificate() {
        return cartificate;
    }

    public void setCartificate(Integer cartificate) {
        this.cartificate = cartificate;
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
        CourseEntity that = (CourseEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(art, that.art) && Objects.equals(slug, that.slug) && Objects.equals(description, that.description) && Objects.equals(content, that.content) && Objects.equals(timeSaleoff, that.timeSaleoff) && Objects.equals(duration, that.duration) && Objects.equals(lectures, that.lectures) && Objects.equals(enrolles, that.enrolles) && Objects.equals(language, that.language) && Objects.equals(skillLevel, that.skillLevel) && Objects.equals(deadline, that.deadline) && Objects.equals(cartificate, that.cartificate) && Objects.equals(readmore, that.readmore) && Objects.equals(requite, that.requite) && Objects.equals(price, that.price) && Objects.equals(salePrice, that.salePrice) && Objects.equals(percentSale, that.percentSale) && Objects.equals(status, that.status) && Objects.equals(totalRating, that.totalRating) && Objects.equals(totalStart, that.totalStart) && Objects.equals(totalReview, that.totalReview) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, art, slug, description, content, timeSaleoff, duration, lectures, enrolles, language, skillLevel, deadline, cartificate, readmore, requite, price, salePrice, percentSale, status, totalRating, totalStart, totalReview, createdAt, updatedAt);
    }

    public CategoriesEntity getCategoriesByCategoriesId() {
        return categoriesByCategoriesId;
    }

    public void setCategoriesByCategoriesId(CategoriesEntity categoriesByCategoriesId) {
        this.categoriesByCategoriesId = categoriesByCategoriesId;
    }

    public Collection<CoursePartEntity> getCoursePartsById() {
        return coursePartsById;
    }

    public void setCoursePartsById(Collection<CoursePartEntity> coursePartsById) {
        this.coursePartsById = coursePartsById;
    }

    public Collection<InstructorEntity> getInstructorsById() {
        return instructorsById;
    }

    public void setInstructorsById(Collection<InstructorEntity> instructorsById) {
        this.instructorsById = instructorsById;
    }

    public Collection<LessonEntity> getLessonsById() {
        return lessonsById;
    }

    public void setLessonsById(Collection<LessonEntity> lessonsById) {
        this.lessonsById = lessonsById;
    }

    public Collection<RatingCommentsEntity> getRatingCommentsById() {
        return ratingCommentsById;
    }

    public void setRatingCommentsById(Collection<RatingCommentsEntity> ratingCommentsById) {
        this.ratingCommentsById = ratingCommentsById;
    }
}
