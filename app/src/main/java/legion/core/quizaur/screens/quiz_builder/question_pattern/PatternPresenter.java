package legion.core.quizaur.screens.quiz_builder.question_pattern;

import javax.inject.Inject;

import legion.core.quizaur.base.BasePresenter;

class PatternPresenter extends BasePresenter<PatternMvp.View> implements PatternMvp.Presenter, PatternMvp.OnPatternItemClick{

    @Inject public PatternPresenter(PatternMvp.View view) {
        super(view);
    }

    @Override public void onInitView() {

    }

    @Override public void onClick(PatternAdapter.QuestionPattern pattern) {

    }
}
