package legion.core.quizaur.base;

public interface BaseMvp {

    interface View {
    }

    interface Presenter {
        void onInitView();
    }
}
