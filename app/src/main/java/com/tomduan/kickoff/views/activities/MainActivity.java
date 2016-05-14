package com.tomduan.kickoff.views.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.tomduan.kickoff.BaseApplication;
import com.tomduan.kickoff.R;
import com.tomduan.kickoff.injector.components.DaggerMainActivityComponent;
import com.tomduan.kickoff.injector.modules.ActivityModule;
import com.tomduan.kickoff.injector.modules.MainAcitvityModule;
import com.tomduan.kickoff.model.SoccerSeason;
import com.tomduan.kickoff.support.BaseActivity;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Response;

public class MainActivity extends BaseActivity {

    @Bind(R.id.test)
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        BaseApplication application = (BaseApplication) getApplication();

        DaggerMainActivityComponent.builder()
                .appComponent(application.getAppComponent())
                .activityModule(new ActivityModule(getApplicationContext()))
                .mainAcitvityModule(new MainAcitvityModule("2014"))
                .build().getxxxx().execute().subscribe(
                r -> setSeasons(r),
                throwable -> manageError(throwable)
        );


//        test.setText("aaaa");
    }

    private void manageError(Throwable throwable) {
        test.setText(throwable.getMessage());
    }

    private void setSeasons(Response<List<SoccerSeason>> r){
        setTEXT(r.body());

    }

    private void setTEXT(List<SoccerSeason> body) {
        for (int i = 0;i < body.size();i++){
            test.append(body.get(i).getLeague());
        }
    }
}
