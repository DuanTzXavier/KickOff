package com.tomduan.kickoff.model;

/**
 * Created by tomduan on 16-5-21.
 */
public class Link {
    private LinkHref fixtures;
    private LinkHref players;
    private LinkHref self;
    private LinkHref leagueTable;
    private LinkHref team;
    private LinkHref awayTeam;
    private LinkHref homeTeam;

    public LinkHref getFixtures() {
        return fixtures;
    }

    public LinkHref getPlayers() {
        return players;
    }

    public LinkHref getSelf() {
        return self;
    }

    public LinkHref getLeagueTable() {
        return leagueTable;
    }

    public LinkHref getTeam() {
        return team;
    }

    public LinkHref getAwayTeam() {
        return awayTeam;
    }

    public LinkHref getHomeTeam() {
        return homeTeam;
    }
}
