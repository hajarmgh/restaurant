package com.gestion.restaurant.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Table {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idTable;
private Long nbPlaces;

    @Override
    public String toString() {
        return "Table{" +
                "idTable=" + idTable +
                ", nbPlaces=" + nbPlaces +
                '}';
    }

    public Table() {
        super();
    }

    public Table(Long idTable, Long nbPlaces) {
        this.idTable = idTable;
        this.nbPlaces = nbPlaces;
    }

    public Long getIdTable() {
        return idTable;
    }

    public void setIdTable(Long idTable) {
        this.idTable = idTable;
    }

    public Long getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(Long nbPlaces) {
        this.nbPlaces = nbPlaces;
    }
}
