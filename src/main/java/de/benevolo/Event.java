package de.benevolo;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;
import net.bytebuddy.asm.Advice;

import java.time.LocalDateTime;
import java.util.Date;


@Entity
public class Event extends PanacheEntity {
    private String name;
    private String description;

    private LocalDateTime date;

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}

