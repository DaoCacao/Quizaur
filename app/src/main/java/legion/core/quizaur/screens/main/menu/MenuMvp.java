package legion.core.quizaur.screens.main.menu;

import legion.core.quizaur.base.BaseMvp;

interface MenuMvp {

    interface View extends BaseMvp.View {
        void navigateToQuizBuilder();
    }

    interface Presenter extends BaseMvp.Presenter {
        void onChooseQuizClick();
        void onOfferQuizClick();
    }
}