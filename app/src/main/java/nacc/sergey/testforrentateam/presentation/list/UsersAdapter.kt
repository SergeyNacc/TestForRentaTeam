package nacc.sergey.testforrentateam.presentation.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import nacc.sergey.testforrentateam.databinding.UserItemBinding
import nacc.sergey.testforrentateam.domain.model.User
import nacc.sergey.testforrentateam.presentation.list.UsersAdapter.UserViewHolder

class UsersAdapter : ListAdapter<User, UserViewHolder>(UsersDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = getItem(position)
        holder.bind(user)
    }

    class UserViewHolder(val binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.userItemName.text = user.full_name
            binding.userItemEmail.text = user.email
        }
    }
}