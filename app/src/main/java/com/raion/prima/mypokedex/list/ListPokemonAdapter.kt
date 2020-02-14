package com.raion.prima.mypokedex.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.raion.prima.mypokedex.model.Pokemon
import com.raion.prima.mypokedex.R

class ListPokemonAdapter(private val listPokemon: ArrayList<Pokemon>) : RecyclerView.Adapter<ListPokemonAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.recyclerview_item_row, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listPokemon.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pokemon = listPokemon[position]

        Glide.with(holder.itemView.context)
            .load(pokemon.sprite)
            .apply(RequestOptions().override(55,55))
            .into(holder.ImgPokemon)

        holder.tvPokemonName.text = pokemon.name
        pokemon.type.forEach {
            holder.tvPokemonType.text = it
        }

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listPokemon[holder.adapterPosition]) }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ImgPokemon: ImageView = itemView.findViewById(R.id.img_item_pokemon)
        var tvPokemonName: TextView = itemView.findViewById(R.id.tv_item_name_pokemon)
        var tvPokemonType: TextView = itemView.findViewById(R.id.tv_item_type)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Pokemon)
    }
}