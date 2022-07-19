package br.com.acrani.models;

import java.time.LocalDate;

public class Mentoring {

    private String title;
    private String descriptoin;
    private LocalDate date;

    public Mentoring() {
    }

    public Mentoring(String title, String descriptoin, LocalDate date) {
        this.title = title;
        this.descriptoin = descriptoin;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptoin() {
        return descriptoin;
    }

    public void setDescriptoin(String descriptoin) {
        this.descriptoin = descriptoin;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
