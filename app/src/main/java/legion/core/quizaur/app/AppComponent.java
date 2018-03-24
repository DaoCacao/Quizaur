package legion.core.quizaur.app;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;
import legion.core.quizaur.app.bindings.ActivityBindingModule;
import legion.core.quizaur.model.FirebaseModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityBindingModule.class,
        AppModule.class,
        FirebaseModule.class})
interface AppComponent extends AndroidInjector<DaggerApplication> {
}
