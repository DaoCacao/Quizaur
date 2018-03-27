package legion.core.quizaur.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private long id;
    private String name;
    private String category;
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
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

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
