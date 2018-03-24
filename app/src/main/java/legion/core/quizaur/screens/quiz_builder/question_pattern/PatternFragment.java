package legion.core.quizaur.screens.quiz_builder.question_pattern;

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

public class PatternFragment extends BaseFragment implements PatternMvp.View {

    @BindView(R.id.rv_pattern) RecyclerView rvPattern;

    @Inject GridLayoutManager layoutManager;
    @Inject PatternAdapter adapter;

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pattern, null);
        ButterKnife.bind(this, view);

        rvPattern.setLayoutManager(layoutManager);
        rvPattern.setAdapter(adapter);

        return view;
    }
}
