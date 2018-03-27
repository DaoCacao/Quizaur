package legion.core.quizaur.screens.create_quiz.build_quiz;

import android.support.v7.widget.LinearLayoutManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import legion.core.quizaur.screens.create_quiz.QuestionAdapter;

@Module
public abstract class BuildQuizModule {

    @Binds abstract BuildQuizMvp.View view(BuildFragment fragment);

    @Binds abstract BuildQuizMvp.Presenter presenter(BuildQuizPresenter presenter);

    @Provides static LinearLayoutManager layoutManager(BuildFragment fragment) {
        return new LinearLayoutManager(fragment.getContext());
    }
    
    @Provides static QuestionAdapter adapter() {
        return new QuestionAdapter();
    }
}
