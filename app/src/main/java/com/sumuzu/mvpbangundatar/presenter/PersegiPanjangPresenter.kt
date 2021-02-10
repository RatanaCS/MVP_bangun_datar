package com.sumuzu.mvpbangundatar.presenter

import com.sumuzu.mvpbangundatar.model.Hasil

//TODO 7 membuat construct di bagian presenter
class PersegiPanjangPresenter(var ppView : PersegiPanjangView) {

    //TODO 3 function parameter hitung
    fun hitung(panjang : String, lebar : String){
        //TODO 4 convert dr type data String ke Integer
        val cPanjang = panjang.toInt()
        val cLebar = lebar.toInt()
        val luas = cPanjang.times(cLebar)

        //TODO 5 hasil presenter masukan ke dlm model
        val hasil = Hasil()
        hasil.luas = luas

        //TODO 8 masukan model ke interface
        ppView.hasilHitung(hasil)

    }

}