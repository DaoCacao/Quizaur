package legion.core.quizaur.screens.main.menu;

import android.content.Intent;
import android.widget.Button;

import javax.inject.Inject;

import butterknife.BindView;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseFragment;
import legion.core.quizaur.screens.create_quiz.CreateQuizActivity;

public class MenuFragment extends BaseFragment implements MenuMvp.View {


    @BindView(R.id.btn_choose_quiz) Button btnChooseQuiz;
    @BindView(R.id.btn_offer_quiz) Button btnOfferQuiz;

    @Inject MenuMvp.Presenter presenter;

    @Override protected int getLayoutId() {
        return R.layout.fragment_menu;
    }

    @Override protected void bindViews() {
        btnChooseQuiz.setOnClickListener(v -> presenter.onChooseQuizClick());
        btnOfferQuiz.setOnClickListener(v -> presenter.onOfferQuizClick());
    }

    @Override public void navigateToQuizBuilder() {
        startActivity(new Intent(getContext(), CreateQuizActivity.class));
    }
}
