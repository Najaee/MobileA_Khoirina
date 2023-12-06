package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplicatdion.ItemRental
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var rentalViewModel: RentalViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rentalViewModel = ViewModelProvider(this).get(RentalViewModel::class.java)

        val recyclerView = binding.rvRental
        recyclerView.layoutManager = LinearLayoutManager(this)


        val adapterRental = AdapterRental(rentalViewModel.rental)
        recyclerView.adapter = adapterRental


    }
}