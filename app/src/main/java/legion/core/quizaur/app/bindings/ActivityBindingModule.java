package legion.core.quizaur.app.bindings;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import legion.core.quizaur.screens.main.MainActivity;
import legion.core.quizaur.screens.main.MainModule;
import legion.core.quizaur.screens.create_quiz.CreateQuizActivity;
import legion.core.quizaur.screens.create_quiz.CreateQuizModule;

@Module
public interface ActivityBindingModule {
    @ContributesAndroidInjector(modules = MainModule.class) MainActivity menuActivity();

    @ContributesAndroidInjector(modules = CreateQuizModule.class)
    CreateQuizActivity quizBuilderActivity();
}
