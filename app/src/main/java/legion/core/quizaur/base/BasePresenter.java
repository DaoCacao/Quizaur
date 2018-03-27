package legion.core.quizaur.base;

public abstract class BasePresenter<V extends BaseMvp.View> {
    private V view;

    protected BasePresenter(V view) {
        this.view = view;
    }

    protected V getView() {
        return view;
    }
}
