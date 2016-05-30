package com.tomduan.kickoff.model;

/**
 * Created by tomduan on 16-4-19.
 */
public class Team {
    private Link _links;
    private String code;
    private String crestUrl;
    private String name;
    private String shortName;
    private String squadMarketValue;

    public Link get_links() {
        return _links;
    }

    public String getCode() {
        return code;
    }

    public String getCrestUrl() {
        return crestUrl;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getSquadMarketValue() {
        return squadMarketValue;
    }
}
