package legion.core.quizaur.screens.create_quiz;

import legion.core.quizaur.base.BaseMvp;

interface CreateQuizMvp {

    interface MainView extends BaseMvp.View {
        void showBuildQuizFragment();
    }

    interface Presenter extends BaseMvp.Presenter {
        void onInitView();
    }
}