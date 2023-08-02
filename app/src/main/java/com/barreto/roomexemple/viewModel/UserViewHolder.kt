package com.barreto.roomexemple.viewModel

import androidx.recyclerview.widget.RecyclerView
import com.barreto.roomexemple.databinding.RowUserBinding
import com.barreto.roomexemple.model.UserModel

class UserViewHolder(private val bind: RowUserBinding,
                     private val onUserListener: OnUserListener):RecyclerView.ViewHolder(bind.root) {
                         fun bind(user:UserModel){
                             bind.textUsername.text = user.username

                             bind.textUsername.setOnClickListener {
                                 onUserListener.OnClick(user.id)
                             }
                         }
}