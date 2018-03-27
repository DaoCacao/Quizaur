package legion.core.quizaur;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class FragmentUtils {

    public static void showFragment(FragmentManager fragmentManager, @IdRes int container, Fragment fragment, boolean addToBackStack) {
        String tag = fragment.getClass().getName();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(container, fragment, tag);
        if (addToBackStack) transaction.addToBackStack(tag);
        transaction.commit();
    }
}
