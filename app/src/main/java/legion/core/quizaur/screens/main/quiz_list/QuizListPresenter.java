package legion.core.quizaur.screens.main.quiz_list;

import android.util.Log;

import javax.inject.Inject;

import legion.core.quizaur.base.BasePresenter;
import legion.core.quizaur.model.pojo.QuizListItem;


public class QuizListPresenter extends BasePresenter<QuizListMvp.View> implements QuizListMvp.Presenter, QuizListMvp.OnQuizListItemClick {
    @Inject public QuizListPresenter(QuizListMvp.View view) {
        super(view);
    }

    @Override public void onClick(QuizListItem item) {
        Log.e("", "click");
    }

    @Override public void onInitView() {

    }
}
