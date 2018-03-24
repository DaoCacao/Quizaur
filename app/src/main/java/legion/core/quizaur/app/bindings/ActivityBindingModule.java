package legion.core.quizaur.app.bindings;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import legion.core.quizaur.screens.main.MainActivity;
import legion.core.quizaur.screens.main.MainModule;
import legion.core.quizaur.screens.quiz_builder.QuizBuilderActivity;
import legion.core.quizaur.screens.quiz_builder.QuizBuilderModule;

@Module
public interface ActivityBindingModule {
    @ContributesAndroidInjector(modules = MainModule.class) MainActivity menuActivity();

    @ContributesAndroidInjector(modules = QuizBuilderModule.class) QuizBuilderActivity quizBuilderActivity();
}
