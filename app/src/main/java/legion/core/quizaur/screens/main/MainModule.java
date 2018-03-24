package legion.core.quizaur.screens.main;

import android.support.v4.app.FragmentManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import legion.core.quizaur.screens.main.menu.MenuFragment;
import legion.core.quizaur.screens.main.menu.MenuModule;
import legion.core.quizaur.screens.main.quiz_list.QuizListFragment;
import legion.core.quizaur.screens.main.quiz_list.QuizListModule;

@Module
public abstract class MainModule {

    @Binds abstract MainMvp.View view(MainActivity activity);

    @Binds abstract MainMvp.Presenter presenter(MainPresenter presenter);

    @Binds abstract MainMvp.FragmentNavigation fragmentNavigation(MainActivity activity);

    @Provides static FragmentManager fragmentManager(MainActivity activity) {
        return activity.getSupportFragmentManager();
    }

    @ContributesAndroidInjector(modules = MenuModule.class) abstract MenuFragment menuFragment();

    @ContributesAndroidInjector(modules = QuizListModule.class) abstract QuizListFragment QuizListFragment();

}
