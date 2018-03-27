package legion.core.quizaur.screens.create_quiz.build_quiz;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseFragment;
import legion.core.quizaur.model.pojo.Question;
import legion.core.quizaur.screens.create_quiz.QuestionAdapter;

public class BuildFragment extends BaseFragment implements BuildQuizMvp.View {

    @Inject BuildQuizMvp.Presenter presenter;
    @Inject LinearLayoutManager layoutManager;
    @Inject QuestionAdapter adapter;

    @BindView(R.id.ed_quiz_name) EditText edQuizName;
    @BindView(R.id.rv_questions) RecyclerView rvQuestions;
    @BindView(R.id.btn_add) Button btnAdd;

    @Override protected int getLayoutId() {
        return R.layout.fragment_build_quiz;
    }

    @Override protected void bindViews() {
        rvQuestions.setLayoutManager(layoutManager);
        rvQuestions.setAdapter(adapter);

        btnAdd.setOnClickListener(view -> presenter.onBtnAddQuestionClick());

        presenter.onViewInit();
    }

    @Override
    public void showQuestions(List<Question> questions) {
        adapter.setQuestions(questions);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void notifyAdapter() {
        adapter.notifyDataSetChanged();
    }
}
