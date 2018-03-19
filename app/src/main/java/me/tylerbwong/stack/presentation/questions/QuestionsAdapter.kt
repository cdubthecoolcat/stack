package me.tylerbwong.stack.presentation.questions

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import me.tylerbwong.stack.R
import me.tylerbwong.stack.data.model.Question
import me.tylerbwong.stack.inflateWithoutAttaching

class QuestionsAdapter : RecyclerView.Adapter<QuestionHolder>() {

    internal var questions: List<Question> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionHolder {
        val view = parent.inflateWithoutAttaching(R.layout.question_holder)
                ?: throw IllegalStateException("Could not inflate question view")
        return QuestionHolder(view)
    }

    override fun onBindViewHolder(holder: QuestionHolder, position: Int) {
        val question = questions[position]
        holder.bind(question)
    }

    override fun getItemCount() = questions.size
}