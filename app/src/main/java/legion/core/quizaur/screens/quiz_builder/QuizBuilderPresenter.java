package legion.core.quizaur.screens.quiz_builder;

import javax.inject.Inject;

import legion.core.quizaur.base.BasePresenter;

public class QuizBuilderPresenter extends BasePresenter<QuizBuilderMvp.View> implements QuizBuilderMvp.Presenter {
    private final QuizBuilderMvp.FragmentNavigation fragmentNavigation;

    @Inject public QuizBuilderPresenter(QuizBuilderMvp.View view, QuizBuilderMvp.FragmentNavigation fragmentNavigation) {
        super(view);
        this.fragmentNavigation = fragmentNavigation;
    }

    @Override public void onInitView() {
        fragmentNavigation.showPatternFragment();
    }
}
