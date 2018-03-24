package legion.core.quizaur.screens.quiz_builder;

import legion.core.quizaur.base.BaseMvp;

interface QuizBuilderMvp {

    interface View extends BaseMvp.View {
    }

    interface Presenter extends BaseMvp.Presenter {
    }

    interface FragmentNavigation {
        void showPatternFragment();
        void showFillFragment();
    }
}