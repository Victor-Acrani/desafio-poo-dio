package br.com.acrani;

import br.com.acrani.models.Course;
import br.com.acrani.models.Mentoring;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Course course = new Course("Java 1", "Basic java course", 30);
        Mentoring mentoring = new Mentoring("Java Bootcamp",
                "Advanced java bootcamp", LocalDate.of(2022,10,20));

        System.out.println(course);
        System.out.println("Course name: " + course.getTitle() + " ,total XP: " + course.calculateXP());
        System.out.println(mentoring);
        System.out.println("Mentoring name: " + mentoring.getTitle() + " ,total XP: " + mentoring.calculateXP());
    }
}
