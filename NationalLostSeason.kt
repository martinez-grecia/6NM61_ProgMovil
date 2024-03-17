package clases

import interfaces.CancelarViaje
import interfaces.Promocion


class NationalLostSeason(city: String) : National(city),Promocion,CancelarViaje {
    override val discount = 10
    override val typeDiscount =0

    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays)
        return if (amount ==0)0 else getDiscountPrice(amount)
    }

    override fun cancelTrip(city: String, country: String): String {
        return "El viaje a $city en $country ha sido cancelado."
    }
}