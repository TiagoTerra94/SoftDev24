package com.example.mysecondapp.data

import com.example.mysecondapp.model.Carro

class CarroMock {

    var listaDeCarros = ArrayList<Carro>()

    init {
        for(i in 1..10){
            listaDeCarros.add(Carro(i,"Modelo $i"))
        }
    }
}