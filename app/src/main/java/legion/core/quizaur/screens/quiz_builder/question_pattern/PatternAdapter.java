package legion.core.quizaur.screens.quiz_builder.question_pattern;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import legion.core.quizaur.R;

public class PatternAdapter extends RecyclerView.Adapter<PatternVH> {

    public enum QuestionPattern {
        RadioButton(R.drawable.ic_patern_radio_button, R.string.pattern_radio_button),
        CheckBox(R.drawable.ic_pattenr_check_box, R.string.pattern_check_box);

        private final int drawable;
        private final int description;

        QuestionPattern(@DrawableRes int drawable, @StringRes int description) {
            this.drawable = drawable;
            this.description = description;
        }

        public int getDrawable() {
            return drawable;
        }

        public int getDescription() {
            return description;
        }
    }

    @Override public PatternVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PatternVH(parent);
    }

    @Override public void onBindViewHolder(PatternVH holder, int position) {
        holder.bind(QuestionPattern.values()[position]);
    }

    @Override public int getItemCount() {
        return QuestionPattern.values().length;
    }
}
