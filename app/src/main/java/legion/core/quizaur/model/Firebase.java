package legion.core.quizaur.model;

import java.util.List;

import legion.core.quizaur.model.pojo.Quiz;
import legion.core.quizaur.model.pojo.QuizListItem;

public interface Firebase {
    List<QuizListItem> getQuizList();
    void addQuiz(Quiz quiz);
}
