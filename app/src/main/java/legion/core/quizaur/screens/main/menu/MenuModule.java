package legion.core.quizaur.screens.main.menu;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MenuModule {

    @Binds abstract MenuMvp.View view(MenuFragment fragment);

    @Binds abstract MenuMvp.Presenter presenter(MenuPresenter presenter);
}
