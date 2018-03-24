package legion.core.quizaur.screens.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseActivity;
import legion.core.quizaur.screens.main.menu.MenuFragment;
import legion.core.quizaur.screens.main.quiz_list.QuizListFragment;

public class MainActivity extends BaseActivity implements MainMvp.View, MainMvp.FragmentNavigation {

    @BindView(R.id.toolbar) Toolbar toolbar;

    @Inject MainMvp.Presenter presenter;
    @Inject FragmentManager fragmentManager;

    //TODO--> holy shit, please, don't look at it
    private MenuFragment menuFragment = new MenuFragment();
    private QuizListFragment quizListFragment = new QuizListFragment();

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        presenter.onInitView();
    }

    @Override public void showMenuFragment() {
        fragmentManager.beginTransaction().replace(R.id.frame_container, menuFragment, "MenuFragment").commit();
    }

    @Override public void showQuizListFragment() {
        fragmentManager.beginTransaction().replace(R.id.frame_container, quizListFragment, "QuizListFragment").commit();
    }
}
