package legion.core.quizaur.screens.create_quiz.build_quiz;

import java.util.ArrayList;

import javax.inject.Inject;

import legion.core.quizaur.base.BasePresenter;
import legion.core.quizaur.model.pojo.Question;
import legion.core.quizaur.model.pojo.Quiz;

public class BuildQuizPresenter extends BasePresenter<BuildQuizMvp.View> implements BuildQuizMvp.Presenter {

    private Quiz quiz;

    @Inject BuildQuizPresenter(BuildQuizMvp.View view) {
        super(view);
    }

    @Override
    public void onViewInit() {
        quiz = new Quiz();
        getView().showQuestions(quiz.getQuestions());
    }

    @Override
    public void onBtnAddQuestionClick() {
        quiz.getQuestions().add(new Question("test", new ArrayList<>()));
        getView().notifyAdapter();
    }
}
