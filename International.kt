package clases

open class International(override val country: String,override val city:String):Travel() {

    protected val fees = mapOf(
        Pair("Alemania", "Munich") to 980,
        Pair("Alemania", "Berlin") to 820,
        Pair("Alemania", "Francfort") to 850,
        Pair("Chile", "Santiago") to 643,
        Pair("Chile", "Valparaiso") to 721,
        Pair("Canadá", "Vancouver") to 620,
        Pair("Canadá", "Ottawa") to 680,
        Pair("Canadá", "Montreal") to 600
    )
    override fun getPrice(numDays: Int): Int {
        val fee = fees[Pair(country, city)]
        val impuesto = when (country) {
            "Alemania" -> 0.16
            "Chile" -> 0.05
            "Canadá" -> 0.10
            else -> 0.0
        }
        val precioTotal = if (fee != null) fee * numDays else 0
        val calcImp = (precioTotal * impuesto).toInt()
        return calcImp+precioTotal
    }

  //  override fun quotePrice(numDays: Int) {
    //    val price = getPrice(numDays)
      //  if(price==0){
        //    println("Lo sentimos, no hacemos viajes a esta ciudad en $country")
       // } else{
         //   println("Tu viaje a $city, $country cuesta \$$price")

       // }
   // }
}