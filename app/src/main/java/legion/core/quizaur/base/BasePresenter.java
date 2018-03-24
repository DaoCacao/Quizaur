package legion.core.quizaur.base;

public abstract class BasePresenter<V extends BaseMvp.View> {
    private V view;

    public BasePresenter(V view) {
        this.view = view;
    }

    public V getView() {
        return view;
    }
}
