package com.raion.prima.mypokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.raion.prima.mypokedex.about.AboutActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.raion.prima.mypokedex.list.ListPokemonAdapter
import com.raion.prima.mypokedex.model.Pokemon
import com.raion.prima.mypokedex.model.PokemonData
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.raion.prima.mypokedex.detail.PokemonDetail


class MainActivity : AppCompatActivity() {
    private lateinit var rvPokemon: RecyclerView
    private val list: ArrayList<Pokemon> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPokemon = findViewById(R.id.rv_pokemon)
        rvPokemon.setHasFixedSize(true)

        list.addAll(PokemonData.listData)
        initData()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.about->{
                intent = Intent(applicationContext, AboutActivity::class.java)
                startActivity(intent)
                return true
            }
            else-> super.onOptionsItemSelected(item)
        }
    }

    fun initData(){
        rvPokemon.layoutManager = LinearLayoutManager(this)
        val listPokemonAdapter = ListPokemonAdapter(list)
        rvPokemon.adapter = listPokemonAdapter

        listPokemonAdapter.setOnItemClickCallback(object : ListPokemonAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Pokemon) {
                val intent = Intent(applicationContext, PokemonDetail::class.java)
                intent.putExtra("pokeData", data)
                startActivity(intent)
            }
        })
    }
}
