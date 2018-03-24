package legion.core.quizaur.screens.quiz_builder;

import android.support.v4.app.FragmentManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import legion.core.quizaur.screens.quiz_builder.question_pattern.PatternFragment;
import legion.core.quizaur.screens.quiz_builder.question_pattern.PatternModule;

@Module
public abstract class QuizBuilderModule {

    @Binds abstract QuizBuilderMvp.View view(QuizBuilderActivity activity);

    @Binds abstract QuizBuilderMvp.Presenter presenter(QuizBuilderPresenter presenter);

    @Binds abstract QuizBuilderMvp.FragmentNavigation fragmentNavigation(QuizBuilderActivity activity);

    @Provides static FragmentManager fragmentManager(QuizBuilderActivity activity) {
        return activity.getSupportFragmentManager();
    }

    @ContributesAndroidInjector(modules = PatternModule.class) abstract PatternFragment patternFragment();
}
