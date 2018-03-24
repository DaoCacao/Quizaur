package legion.core.quizaur.screens.quiz_builder.question_pattern;

import legion.core.quizaur.base.BaseMvp;

interface PatternMvp {

    interface View extends BaseMvp.View {
    }

    interface Presenter extends BaseMvp.Presenter {
    }

    interface OnPatternItemClick {
        void onClick(PatternAdapter.QuestionPattern pattern);
    }
}