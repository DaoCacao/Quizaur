package legion.core.quizaur.screens.create_quiz;


import javax.inject.Inject;

import legion.core.quizaur.base.BasePresenter;

public class CreateQuizPresenter extends BasePresenter<CreateQuizMvp.MainView> implements CreateQuizMvp.Presenter {

    @Inject CreateQuizPresenter(CreateQuizMvp.MainView view) {
        super(view);
    }

    @Override public void onInitView() {
        getView().showBuildQuizFragment();
    }
}
