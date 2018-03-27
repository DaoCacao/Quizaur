package legion.core.quizaur.screens.create_quiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import legion.core.quizaur.FragmentUtils;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseActivity;
import legion.core.quizaur.screens.create_quiz.build_quiz.BuildFragment;

public class CreateQuizActivity extends BaseActivity implements CreateQuizMvp.MainView {

    @BindView(R.id.toolbar) Toolbar toolbar;

    @Inject CreateQuizMvp.Presenter presenter;
    @Inject FragmentManager fragmentManager;

    private BuildFragment buildQuizFragment = new BuildFragment();

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_quiz);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        presenter.onInitView();
    }

    @Override public void showBuildQuizFragment() {
        FragmentUtils.showFragment(fragmentManager, R.id.frame_container, buildQuizFragment, false);
    }
}
