package legion.core.quizaur.screens.main.quiz_list;

import android.view.ViewGroup;

import legion.core.quizaur.R;
import legion.core.quizaur.base.BaseVH;
import legion.core.quizaur.model.pojo.QuizListItem;

public class QuizListVH extends BaseVH<QuizListItem> {
    private final QuizListMvp.OnQuizListItemClick onQuizListItemClick;

    QuizListVH(ViewGroup parent, QuizListMvp.OnQuizListItemClick onQuizListItemClick) {
        super(parent, R.layout.quiz_list_item);
        this.onQuizListItemClick = onQuizListItemClick;
    }

    @Override public void bind(QuizListItem item) {
        itemView.setOnClickListener(view -> onQuizListItemClick.onClick(item));
    }
}
