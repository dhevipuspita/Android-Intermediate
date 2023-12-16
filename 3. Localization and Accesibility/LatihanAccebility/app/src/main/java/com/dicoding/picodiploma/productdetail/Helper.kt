package com.dicoding.picodiploma.productdetail

import java.text.*
import java.util.*

object Helper {
    //untuk penomoran
    fun String.withNumberingFormat(): String {
        return NumberFormat.getNumberInstance().format(this.toDouble())
    }

    //untuk date
    fun String.withDateFormat(): String {
        val format = SimpleDateFormat("dd/MM/yyyy", Locale.US)
        val date = format.parse(this) as Date
        return DateFormat.getDateInstance(DateFormat.FULL).format(date)
    }

    //untuk mata uang
    fun String.withCurrencyFormat(): String {
        val rupiahExchangeRate  = 12495.95
        val euroExchangeRate = 0.88

        var priceOnDollar = this.toDouble() / rupiahExchangeRate

        var mCurrencyFormat = NumberFormat.getCurrencyInstance()
        val deviceLocale = Locale.getDefault().country
        when {
            deviceLocale.equals("ES") -> {
                priceOnDollar *= euroExchangeRate
            }
            deviceLocale.equals("ID") -> {
                priceOnDollar *= rupiahExchangeRate
            }
            else -> {
                mCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US)
            }
        }

        return mCurrencyFormat.format(priceOnDollar)
    }
}