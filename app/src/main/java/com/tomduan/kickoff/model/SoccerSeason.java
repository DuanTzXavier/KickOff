package com.tomduan.kickoff.model;

/**
 * Created by tomduan on 16-4-19.
 */
public class SoccerSeason {

    private Link _links;
    private int currentMatchday;
    private String league;
    private int id;
    private String lastUpdated;
    private int numberOfGames;
    private int numberOfMatchdays;
    private int numberOfTeams;
    private int year;
    private String caption;

    public int getCurrentMatchday() {
        return currentMatchday;
    }

    public String getLeague() {
        return league;
    }

    public int getId() {
        return id;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public int getNumberOfMatchdays() {
        return numberOfMatchdays;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public int getYear() {
        return year;
    }

    public String getCaption() {
        return caption;
    }

    public Link get_links() {
        return _links;
    }
}
