class Vehiculo {
    var Color = " "
    var Marca = " "
    var Modelo = " "
    var Placas = " "
    var Encendido = true;
    var Gasolina = 0

    fun EncenderVehiculo() {
        if (Gasolina <= 0) {
            println("No pude encenderlo, pa. El nivel de gasolina es bajo. \n -RECARGUE-")
        }
        else{
            println("VEHICULO ENCENDIDO")
            Encendido = true
            Gasolina--
        }

    }

    fun ApagarVehiculo(){
        println("EL VEHICULO SE APAGARA")
        Encendido=false
    }

    fun CargarGasolina(Gas:Int){
        Gasolina = Gasolina.plus(Gas)
    }
}