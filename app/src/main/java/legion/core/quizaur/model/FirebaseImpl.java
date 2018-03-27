package legion.core.quizaur.model;

import com.google.firebase.database.DatabaseReference;

import java.util.List;

import javax.inject.Inject;

import legion.core.quizaur.model.pojo.Quiz;
import legion.core.quizaur.model.pojo.QuizListItem;

public class FirebaseImpl implements Firebase {

    private static final String QUIZ_REF = "Quiz";

    private DatabaseReference reference;

    @Inject public FirebaseImpl(DatabaseReference reference) {
        this.reference = reference;
    }

    @Override public List<QuizListItem> getQuizList() {
        return null;
    }

    @Override public void addQuiz(Quiz quiz) {
        reference.child(QUIZ_REF).child(String.valueOf(quiz.getId())).setValue(quiz);
    }
}
