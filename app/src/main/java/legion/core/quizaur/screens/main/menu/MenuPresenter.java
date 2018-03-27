package legion.core.quizaur.screens.main.menu;

import javax.inject.Inject;

import legion.core.quizaur.base.BasePresenter;
import legion.core.quizaur.screens.main.MainMvp;


public class MenuPresenter extends BasePresenter<MenuMvp.View> implements MenuMvp.Presenter {
    private final MainMvp.FragmentNavigation fragmentNavigation;

    @Inject MenuPresenter(MenuMvp.View view, MainMvp.FragmentNavigation fragmentNavigation) {
        super(view);
        this.fragmentNavigation = fragmentNavigation;
    }

    @Override public void onChooseQuizClick() {
        fragmentNavigation.showQuizListFragment();
    }

    @Override public void onOfferQuizClick() {
        getView().navigateToQuizBuilder();
    }
}
