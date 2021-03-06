package com.og.examexample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProgramViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val developerNameTextView: TextView =
        itemView.findViewById(R.id.developer_name_text_view)

    fun bind(name: String) {
        developerNameTextView.text = name
    }

}