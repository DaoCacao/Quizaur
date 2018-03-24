package legion.core.quizaur.app;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class AppLoader extends DaggerApplication {

    @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.create();
    }
}
