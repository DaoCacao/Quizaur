package legion.core.quizaur.screens.main.quiz_list;

import android.support.v7.widget.GridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import legion.core.quizaur.model.pojo.QuizListItem;

@Module
public abstract class QuizListModule {

    @Binds abstract QuizListMvp.View view(QuizListFragment fragment);

    @Binds abstract QuizListMvp.Presenter presenter(QuizListPresenter presenter);

    @Binds abstract QuizListMvp.OnQuizListItemClick onQuizListItemClick(QuizListPresenter presenter);

    @Provides
    static GridLayoutManager layoutManager(QuizListFragment fragment) {
        return new GridLayoutManager(fragment.getContext(), 6);
    }

    @Provides
    static QuizListAdapter adapter(QuizListMvp.OnQuizListItemClick onQuizListItemClick) {
        //FIXME--> test func
        List<QuizListItem> items = new ArrayList<>();
        for (int i = 0; i < 50; i++) items.add(new QuizListItem());
        return new QuizListAdapter(items, onQuizListItemClick);
    }
}
