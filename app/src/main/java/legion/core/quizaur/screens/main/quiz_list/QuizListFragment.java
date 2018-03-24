package legion.core.quizaur.screens.main.quiz_list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseFragment;


public class QuizListFragment extends BaseFragment implements QuizListMvp.View {

    @BindView(R.id.rv_quiz) RecyclerView rvQuiz;

    @Inject GridLayoutManager layoutManager;
    @Inject QuizListAdapter adapter;

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz_list, null);
        ButterKnife.bind(this, view);

        rvQuiz.setLayoutManager(layoutManager);
        rvQuiz.setAdapter(adapter);

        return view;
    }
}
