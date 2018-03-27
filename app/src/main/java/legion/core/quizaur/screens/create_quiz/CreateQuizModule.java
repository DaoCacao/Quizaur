package legion.core.quizaur.screens.create_quiz;

import android.support.v4.app.FragmentManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import legion.core.quizaur.screens.create_quiz.build_quiz.BuildFragment;
import legion.core.quizaur.screens.create_quiz.build_quiz.BuildQuizModule;

@Module
public abstract class CreateQuizModule {

    @Binds abstract CreateQuizMvp.MainView view(CreateQuizActivity activity);

    @Binds abstract CreateQuizMvp.Presenter presenter(CreateQuizPresenter presenter);

    @Provides static FragmentManager fragmentManager(CreateQuizActivity activity) {
        return activity.getSupportFragmentManager();
    }

    @ContributesAndroidInjector(modules = BuildQuizModule.class) abstract BuildFragment buildQuizFragment();
}
