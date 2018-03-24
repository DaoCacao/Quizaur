package legion.core.quizaur.screens.quiz_builder.question_pattern;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseVH;

class PatternVH extends BaseVH<PatternAdapter.QuestionPattern> {

    @BindView(R.id.iv_image) ImageView ivImage;
    @BindView(R.id.tv_description) TextView tvDescription;

    PatternVH(ViewGroup parent) {
        super(parent, R.layout.question_pattern_list_item);
    }

    @Override public void bind(PatternAdapter.QuestionPattern item) {
        ivImage.setImageResource(item.getDrawable());
        tvDescription.setText(item.getDescription());
    }
}
