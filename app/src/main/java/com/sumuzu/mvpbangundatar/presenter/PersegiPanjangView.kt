package com.sumuzu.mvpbangundatar.presenter

import com.sumuzu.mvpbangundatar.model.Hasil


//TODO 6 membuat sebuah interface untuk notify activity(view) kalau hasil logic sudah selesai
interface PersegiPanjangView {

    fun hasilHitung(hasil : Hasil)
}