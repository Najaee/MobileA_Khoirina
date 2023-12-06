package com.example.myapplication

import androidx.lifecycle.ViewModel
import com.example.myapplicatdion.ItemRental

class RentalViewModel : ViewModel() {

    val rental = listOf(
        ItemRental(
            "Rental Motor Abadi",
            "085657786865",
            "Jl. Brawijaya No.99, Jadan, Tamantirto, Kec. Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta 55184"
        ),
        ItemRental(
            "Rental Semesta",
            "085657786844",
            "Jl. Tundan, Ngrame, Tamantirto, Kec. Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta 55184"
        ),
        ItemRental(
            "Dream Rental",
            "08565806844",
            "58JF+G5F, Ngrame, Tamantirto, Kec. Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta 55184"
        )
    )
}


