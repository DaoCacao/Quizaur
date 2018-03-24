package legion.core.quizaur.screens.quiz_builder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseActivity;
import legion.core.quizaur.screens.quiz_builder.question_pattern.PatternFragment;

public class QuizBuilderActivity extends BaseActivity implements QuizBuilderMvp.View, QuizBuilderMvp.FragmentNavigation {

    @BindView(R.id.toolbar) Toolbar toolbar;

    @Inject QuizBuilderMvp.Presenter presenter;
    @Inject FragmentManager fragmentManager;

    //TODO--> holy shit, please, don't look at it
    private PatternFragment patternFragment = new PatternFragment();

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_builder);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        presenter.onInitView();
    }

    @Override public void showPatternFragment() {
        fragmentManager.beginTransaction().replace(R.id.frame_container, patternFragment, "PatternFragment").commit();
    }

    @Override public void showFillFragment() {

    }
}
