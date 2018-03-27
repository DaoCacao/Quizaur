package legion.core.quizaur.screens.main.quiz_list;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import javax.inject.Inject;

import butterknife.BindView;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseFragment;


public class QuizListFragment extends BaseFragment implements QuizListMvp.View {

    @BindView(R.id.rv_quiz) RecyclerView rvQuiz;

    @Inject GridLayoutManager layoutManager;
    @Inject QuizListAdapter adapter;

    @Override protected int getLayoutId() {
        return R.layout.fragment_quiz_list;
    }

    @Override protected void bindViews() {
        rvQuiz.setLayoutManager(layoutManager);
        rvQuiz.setAdapter(adapter);
    }
}
