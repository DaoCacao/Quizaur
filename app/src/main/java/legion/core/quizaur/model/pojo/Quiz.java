package legion.core.quizaur.model.pojo;

import java.util.List;

public class Quiz {
    long id;
    String name;
    String category;
    List<Question> questions;

    public Quiz(long id, String name, String category, List<Question> questions) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.questions = questions;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
