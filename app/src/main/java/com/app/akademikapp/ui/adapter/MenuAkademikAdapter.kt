package com.app.AcademikMobile.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.AcademikMobile.data.model.MenuAkademik
import com.app.AcademikMobile.databinding.ItemMenuAkademikListBinding

class MenuAkademikAdapter(
    private val items: List<MenuAkademik>,
    private val onItemClick: (MenuAkademik) -> Unit
) : RecyclerView.Adapter<MenuAkademikAdapter.MenuAkademikViewHolder>() {

    inner class MenuAkademikViewHolder(
        private val binding: ItemMenuAkademikListBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MenuAkademik) {
            binding.tvMenuTitle.text = item.title
            binding.tvMenuDescription.text = item.description
            binding.root.setOnClickListener {
                onItemClick(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAkademikViewHolder {
        val binding = ItemMenuAkademikListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MenuAkademikViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuAkademikViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}