package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

val countries=arrayOf(Country("au", "Australia", "Canberra", R.drawable.au),
    Country("ca", "canada", "Ottawa", R.drawable.ca),
    Country("au", "Australia", "Berlin", R.drawable.gr),
    Country("in", "India", "New Delhi", R.drawable.india),
    Country("ir", "Ireland", "Dublin", R.drawable.ir),
    Country("it", "italy", "Rome", R.drawable.it),
    Country("po", "Poland", "Warsaw", R.drawable.po),
    Country("ru", "Russia", "Moscow", R.drawable.ru),
    Country("us", "United State", "Washington", R.drawable.us),
    Country("uj", "Union jack", "Edinburgh", R.drawable.uj),)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val counrtyList=findViewById<RecyclerView>(R.id.county_list).apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=CountryAdapter().apply {
                setHasStableIds(true)
            }
            setHasFixedSize(true)
        }
        val showCountries=findViewById<Button>(R.id.button)
        showCountries.setOnClickListener{
            (counrtyList.adapter as CountryAdapter).countryData= countries
        }
    }
}