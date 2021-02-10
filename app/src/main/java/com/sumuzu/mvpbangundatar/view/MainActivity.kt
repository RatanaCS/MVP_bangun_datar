package com.sumuzu.mvpbangundatar.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sumuzu.mvpbangundatar.R
import com.sumuzu.mvpbangundatar.model.Hasil
import com.sumuzu.mvpbangundatar.presenter.PersegiPanjangPresenter
import com.sumuzu.mvpbangundatar.presenter.PersegiPanjangView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PersegiPanjangView {

    //TODO 9 deklarasi presenter
    private var presenter : PersegiPanjangPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 10 init presenter
        presenter = PersegiPanjangPresenter(this);

        //TODO 1 event klik
        btnHitung.setOnClickListener {

            //TODO 2 ambil inputan user
            val panjang = etInput1.text.toString()
            val lebar = etInput2.text.toString()

            //TODO 11 eksekusi presenter
            presenter?.hitung(panjang, lebar)

        }

    }

    override fun hasilHitung(hasil: Hasil) {
        //TODO 12 bind data ke view
        Toast.makeText(this, hasil.luas.toString(), Toast.LENGTH_LONG).show()
    }

//    override fun hasilHitung(hasil: Hasil) {
//        Toast.makeText(this, hasil.luas.toString(), Toast.LENGTH_LONG).show()
//    }
}