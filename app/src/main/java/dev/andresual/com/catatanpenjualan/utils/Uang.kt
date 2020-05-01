package dev.andresual.com.catatanpenjualan.utils

import java.text.NumberFormat
import java.util.*

/**
 * Created by Andresual on 01/05/2020.
 */
object Uang {

    fun indonesia(uang:Double) : String {
        val localeId = Locale("in", "ID")
        val kursId : NumberFormat = NumberFormat.getCurrencyInstance(localeId)
        return kursId.format(uang);
    }

}