package legion.core.quizaur.screens.create_quiz.build_quiz;

import java.util.List;

import legion.core.quizaur.base.BaseMvp;
import legion.core.quizaur.model.pojo.Question;

public class BuildQuizMvp {

    public interface View extends BaseMvp.View {
        void showQuestions(List<Question> questions);

        void notifyAdapter();
    }

    public interface Presenter {
        void onViewInit();
        void onBtnAddQuestionClick();
    }
}
