package legion.core.quizaur.screens.quiz_builder.question_pattern;

import android.support.v7.widget.GridLayoutManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PatternModule {

    @Binds abstract PatternMvp.View view(PatternFragment fragment);

    @Binds abstract PatternMvp.Presenter presenter(PatternPresenter presenter);

    @Provides static GridLayoutManager layoutManager(PatternFragment fragment) {
        return new GridLayoutManager(fragment.getContext(), 2);
    }

    @Provides static PatternAdapter adapter() {
        return new PatternAdapter();
    }
}
