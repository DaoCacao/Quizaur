package legion.core.quizaur.screens.main.quiz_list;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import legion.core.quizaur.model.pojo.QuizListItem;

public class QuizListAdapter extends RecyclerView.Adapter<QuizListVH> {


    private List<QuizListItem> items;
    private QuizListMvp.OnQuizListItemClick onQuizListItemClick;

    QuizListAdapter(List<QuizListItem> items, QuizListMvp.OnQuizListItemClick onQuizListItemClick) {
        this.items = items;
        this.onQuizListItemClick = onQuizListItemClick;
    }

    @Override public QuizListVH onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO --> to autofactory
        return new QuizListVH(parent, onQuizListItemClick);
    }

    @Override public void onBindViewHolder(QuizListVH holder, int position) {
        holder.bind(items.get(position));
    }

    @Override public int getItemCount() {
        return items.size();
    }
}
