package legion.core.quizaur.screens.main.quiz_list;

import legion.core.quizaur.base.BaseMvp;
import legion.core.quizaur.model.pojo.QuizListItem;

interface QuizListMvp {

    interface View extends BaseMvp.View {
    }

    interface Presenter extends BaseMvp.Presenter {
    }

    interface OnQuizListItemClick {
        void onClick(QuizListItem item);
    }
}