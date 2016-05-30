package com.tomduan.kickoff.model;

import java.util.List;

/**
 * Created by tomduan on 16-5-22.
 */
public class Head2Head {
    private int awayTeamWins;
    private int count;
    private int draws;
    private List<Fixture> fixtures;
    private int homeTeamWins;
    private Fixture lastAwayWinAwayTeam;
    private Fixture lastHomeWinHomeTeam;
    private Fixture lastWinAwayTeam;
    private Fixture lastWinHomeTeam;

    public int getAwayTeamWins() {
        return awayTeamWins;
    }

    public int getCount() {
        return count;
    }

    public int getDraws() {
        return draws;
    }

    public List<Fixture> getFixtures() {
        return fixtures;
    }

    public int getHomeTeamWins() {
        return homeTeamWins;
    }

    public Fixture getLastAwayWinAwayTeam() {
        return lastAwayWinAwayTeam;
    }

    public Fixture getLastHomeWinHomeTeam() {
        return lastHomeWinHomeTeam;
    }

    public Fixture getLastWinAwayTeam() {
        return lastWinAwayTeam;
    }

    public Fixture getLastWinHomeTeam() {
        return lastWinHomeTeam;
    }
}
