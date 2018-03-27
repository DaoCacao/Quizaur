package legion.core.quizaur.screens.create_quiz;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseVH;
import legion.core.quizaur.model.pojo.Question;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.VH> {

    private List<Question> questions = new ArrayList<>();

    @Override public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VH(parent);
    }

    @Override public void onBindViewHolder(VH holder, int position) {
        holder.bind(questions.get(position));
    }

    @Override public int getItemCount() {
        return questions.size();
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public class VH extends BaseVH<Question> {

        @BindView(R.id.tv_question) TextView tvQuestion;

        VH(ViewGroup parent) {
            super(parent, R.layout.item_question);
        }

        @Override public void bind(Question item) {
            tvQuestion.setText(item.getQuestion());
        }
    }
}
