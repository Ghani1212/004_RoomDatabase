package com.example.roomsiswa.model

import androidx.lifecycle.ViewModel
import com.example.roomsiswa.repositori.RepositoriSiswa

class PenyediaViewModel {
    class HomeViewModel(private val repositorySiswa: RepositoriSiswa) : ViewModel() {
        companion object {
            private const val TIMEOUT_MILLIS = 5_000L
        }
    }
}