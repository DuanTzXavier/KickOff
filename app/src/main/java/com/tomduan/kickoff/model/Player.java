package com.tomduan.kickoff.model;

/**
 * Created by tomduan on 16-5-22.
 */
public class Player {
    private String contractUntil;
    private String dateOfBirth;
    private String jerseyNumber;
    private String marketValue;
    private String name;
    private String nationality;
    private String position;

    public String getContractUntil() {
        return contractUntil;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public String getMarketValue() {
        return marketValue;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
