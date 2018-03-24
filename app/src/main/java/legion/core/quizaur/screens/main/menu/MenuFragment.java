package legion.core.quizaur.screens.main.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseFragment;
import legion.core.quizaur.screens.quiz_builder.QuizBuilderActivity;

public class MenuFragment extends BaseFragment implements MenuMvp.View {


    @BindView(R.id.btn_choose_quiz) Button btnChooseQuiz;
    @BindView(R.id.btn_offer_quiz) Button btnOfferQuiz;

    @Inject MenuMvp.Presenter presenter;

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, null);
        ButterKnife.bind(this, view);

        btnChooseQuiz.setOnClickListener(v -> presenter.onChooseQuizClick());
        btnOfferQuiz.setOnClickListener(v -> presenter.onOfferQuizClick());

        return view;
    }

    @Override public void navigateToQuizBuilder() {
        startActivity(new Intent(getContext(), QuizBuilderActivity.class));
    }
}
