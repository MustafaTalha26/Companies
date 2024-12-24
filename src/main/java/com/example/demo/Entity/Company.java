package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "companies",indexes = {
        @Index(columnList = "country",name = "btreeCountry"),
        @Index(columnList = "name", name = "btreeName")})
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "domain")
    private String domain;

    @Column(name = "year_founded", nullable = true)
    private Integer year_founded;

    @Column(name = "industry")
    private String industry;

    @Column(name = "size_range")
    private String size_range;

    @Column(name = "locality")
    private String locality;

    @Column(name = "country")
    private String country;

    @Column(name = "linkedin_url")
    private String linkedin_url;

    @Column(name = "current_employee_estimate")
    private int current_employee_estimate;

    @Column(name = "total_employee_estimate")
    private int total_employee_estimate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCurrent_employee_estimate() {
        return current_employee_estimate;
    }

    public void setCurrent_employee_estimate(int current_employee_estimate) {
        this.current_employee_estimate = current_employee_estimate;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLinkedin_url() {
        return linkedin_url;
    }

    public void setLinkedin_url(String linkedin_url) {
        this.linkedin_url = linkedin_url;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize_range() {
        return size_range;
    }

    public void setSize_range(String size_range) {
        this.size_range = size_range;
    }

    public int getTotal_employee_estimate() {
        return total_employee_estimate;
    }

    public void setTotal_employee_estimate(int total_employee_estimate) {
        this.total_employee_estimate = total_employee_estimate;
    }

    public Integer getYear_founded() {
        return year_founded;
    }

    public void setYear_founded(Integer year_founded) {
        this.year_founded = year_founded;
    }

    public Company(long id, String name, String domain, Integer year_founded, String industry, String size_range, String locality, String country, String linkedin_url, int current_employee_estimate, int total_employee_estimate) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.year_founded = year_founded;
        this.industry = industry;
        this.size_range = size_range;
        this.locality = locality;
        this.country = country;
        this.linkedin_url = linkedin_url;
        this.current_employee_estimate = current_employee_estimate;
        this.total_employee_estimate = total_employee_estimate;
    }

    public Company() {
    }
}
