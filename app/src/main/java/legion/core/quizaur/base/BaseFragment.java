package legion.core.quizaur.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import dagger.android.support.DaggerFragment;

public abstract class BaseFragment extends DaggerFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), null);
        ButterKnife.bind(this, view);
        bindViews();
        return view;
    }

    protected abstract int getLayoutId();

    protected abstract void bindViews();
}
