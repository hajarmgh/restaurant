package com.gestion.restaurant.models;


import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nomClient;
    private String prenomClient;
    private String emailClient;
    private Long telClient;
    private String CINClient;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateRes;
    private Long nbPersonnes;

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nomClient='" + nomClient + '\'' +
                ", prenomClient='" + prenomClient + '\'' +
                ", emailClient='" + emailClient + '\'' +
                ", telClient=" + telClient +
                ", CINClient='" + CINClient + '\'' +
                ", dateRes=" + dateRes +
                ", nbPersonnes=" + nbPersonnes +
                '}';
    }

    public Client() {
        super();
    }

    public Client(String nomClient, String prenomClient, String emailClient, Long telClient, String CINClient, Date dateRes, Long nbPersonnes) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.emailClient = emailClient;
        this.telClient = telClient;
        this.CINClient = CINClient;
        this.dateRes = dateRes;
        this.nbPersonnes = nbPersonnes;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public Long getTelClient() {
        return telClient;
    }

    public void setTelClient(Long telClient) {
        this.telClient = telClient;
    }

    public String getCINClient() {
        return CINClient;
    }

    public void setCINClient(String CINClient) {
        this.CINClient = CINClient;
    }

    public Date getDateRes() {
        return dateRes;
    }

    public void setDateRes(Date dateRes) {
        this.dateRes = dateRes;
    }

    public Long getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(Long nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }
}