package legion.core.quizaur.screens.main;

import javax.inject.Inject;

import legion.core.quizaur.base.BasePresenter;

public class MainPresenter extends BasePresenter<MainMvp.View> implements MainMvp.Presenter {

    private final MainMvp.FragmentNavigation fragmentNavigation;

    @Inject MainPresenter(MainMvp.View view, MainMvp.FragmentNavigation fragmentNavigation) {
        super(view);
        this.fragmentNavigation = fragmentNavigation;
    }

    @Override public void onInitView() {
        fragmentNavigation.showMenuFragment();
    }
}
