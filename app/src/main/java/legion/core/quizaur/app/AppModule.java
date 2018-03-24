package legion.core.quizaur.app;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
abstract class AppModule {
    @Singleton @Binds abstract Context context(Application application);
}
