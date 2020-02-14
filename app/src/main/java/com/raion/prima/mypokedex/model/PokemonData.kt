package com.raion.prima.mypokedex.model

import com.raion.prima.mypokedex.R

object PokemonData {

    private val pokemonNames = arrayOf("Bulbasaur",
        "Ivysaur",
        "Venusaur",
        "Charmander",
        "Charmander",
        "Charmeleon",
        "Squirtle",
        "Wartortle",
        "Blastoise",
        "Caterpie",
        "Metapod",
        "Butterfree")

    private val pokemonSprites = arrayOf(
        R.drawable.bulbasaur,
        R.drawable.ivysaur,
        R.drawable.venusaur,
        R.drawable.charmander,
        R.drawable.charmeleon,
        R.drawable.charizarrd,
        R.drawable.squirtle,
        R.drawable.wartortle,
        R.drawable.blastoise,
        R.drawable.caterpie,
        R.drawable.metapod,
        R.drawable.butterfree)

    private val pokemonType = arrayOf(
        listOf("Grass"),
        listOf("Poison","Grass"),
        listOf("Poison","Grass"),
        listOf("Fire"),
        listOf("Fire"),
        listOf("Fire","Flying"),
        listOf("Water"),
        listOf("Water"),
        listOf("Water"),
        listOf("Bug"),
        listOf("Bug"),
        listOf("Flying","Bug")
    )

    private val pokemonDesc = arrayOf("Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun’s rays, the seed grows progressively larger.",
        "There is a bud on this Pokémon’s back. To support its weight, Ivysaur’s legs and trunk grow thick and strong. If it starts spending more time lying in the sunlight, it’s a sign that the bud will bloom into a large flower soon.",
        "There is a large flower on Venusaur’s back. The flower is said to take on vivid colors if it gets plenty of nutrition and sunlight. The flower’s aroma soothes the emotions of people.",
        "The flame that burns at the tip of its tail is an indication of its emotions. The flame wavers when Charmander is enjoying itself. If the Pokémon becomes enraged, the flame burns fiercely.",
        "Charizard flies around the sky in search of powerful opponents. It breathes fire of such great heat that it melts anything. However, it never turns its fiery breath on any opponent weaker than itself.",
        "Charmeleon mercilessly destroys its foes using its sharp claws. If it encounters a strong foe, it turns aggressive. In this excited state, the flame at the tip of its tail flares with a bluish white color.",
        "Squirtle’s shell is not merely used for protection. The shell’s rounded shape and the grooves on its surface help minimize resistance in water, enabling this Pokémon to swim at high speeds.",
        "Its tail is large and covered with a rich, thick fur. The tail becomes increasingly deeper in color as Wartortle ages. The scratches on its shell are evidence of this Pokémon’s toughness as a battler.",
        "Blastoise has water spouts that protrude from its shell. The water spouts are very accurate. They can shoot bullets of water with enough accuracy to strike empty cans from a distance of over 160 feet.",
        "Perhaps because it would like to grow up quickly, it has a voracious appetite, eating a hundred leaves a day.",
        "Its shell is filled with a thick liquid. All of the cells throughout its body are being rebuilt in preparation for evolution.",
        "Its wings are covered in toxic scales. If it finds bird Pokémon going after Caterpie, Butterfree sprinkles its scales on them to drive them off.")

    val listData: ArrayList<Pokemon>
        get() {
            val list = arrayListOf<Pokemon>()
            for (position in pokemonNames.indices) {
                val pokemon = Pokemon(pokemonNames[position],
                    pokemonSprites[position],
                    pokemonType[position],
                    pokemonDesc[position]
                    )
                list.add(pokemon)
            }
            return list
        }
}