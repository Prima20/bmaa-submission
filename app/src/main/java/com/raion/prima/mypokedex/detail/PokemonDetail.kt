package com.raion.prima.mypokedex.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.raion.prima.mypokedex.R
import com.raion.prima.mypokedex.model.Pokemon
import kotlinx.android.synthetic.main.activity_pokemon_detail.*

class PokemonDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_detail)

        val pokeData = intent.extras.getParcelable<Pokemon>("pokeData")

        InitData(pokeData)
    }

    fun InitData(data: Pokemon){
        tv_detail_name.text = data.name

        Glide.with(this)
            .load(data.sprite)
            .into(img_detail_pokemon)

        data.type.forEach {
            tv_detail_type.text = it
        }
        tv_detail_desc.text = data.description
    }
}