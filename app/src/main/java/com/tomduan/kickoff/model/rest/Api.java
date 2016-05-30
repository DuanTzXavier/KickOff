package com.tomduan.kickoff.model.rest;

import com.tomduan.kickoff.model.FixtureAcrossModel;
import com.tomduan.kickoff.model.FixtureModel;
import com.tomduan.kickoff.model.FixtureTeam;
import com.tomduan.kickoff.model.Head2HeadFixture;
import com.tomduan.kickoff.model.LeagueTable;
import com.tomduan.kickoff.model.PlayerModel;
import com.tomduan.kickoff.model.SoccerSeason;
import com.tomduan.kickoff.model.Team;
import com.tomduan.kickoff.model.TeamsModel;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by tomduan on 16-3-10.
 */
public interface Api {
    public static final String BASE_URL = "http://api.football-data.org/v1/";

    @GET("soccerseasons")
    Observable<Response<List<SoccerSeason>>> getSoccerSeasons(
            @Query("season") String year
    );

    @GET("/v1/soccerseasons/{id}/teams")
    Observable<Response<TeamsModel>> getTeams(
            @Path("id") String id
    );

    @GET("/v1/soccerseasons/{id}/leagueTable")
    Observable<Response<LeagueTable>> getLeagueTable(
            @Path("id") String id,
            @Query("matchday") int day
    );

    @GET("/v1/soccerseasons/{id}/fixtures")
    Observable<Response<FixtureModel>> getCertainFixtures(
            @Path("id") String id,
            @Query("timeFrame") String time,
            @Query("matchday") int day
    );

    @GET("/v1/fixtures/")
    Observable<Response<FixtureAcrossModel>> getAcrossFixtures(
            @Query("timeFrame") String time,
            @Query("league") String leagueCode
    );

    @GET("/v1/fixtures/{id}")
    Observable<Response<Head2HeadFixture>> getOneFixture(
            @Path("id") String id,
            @Query("head2head") String count
    );

    @GET("/v1/teams/{id}/fixtures/")
    Observable<Response<FixtureTeam>> getTeamFixtures(
            @Path("id") String id,
            @Query("timeFrame") String time,
            @Query("venue") String venue
    );

    @GET("/v1/teams/{id}")
    Observable<Response<Team>> getTeam(
            @Path(("id")) String id
    );

    @GET("/v1/teams/{id}/players")
    Observable<Response<PlayerModel>> getPlayers(
            @Path("id") String id
    );
}
