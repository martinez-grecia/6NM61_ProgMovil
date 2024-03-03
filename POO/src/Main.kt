//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val CarroChipiado = Vehiculo()
    var op = 0
    var op1 = 0

    var Person1 = Person("Grecia","Raawdino","Mujer",1.15f)
    println("La craadora de todo este codigo chipipado es:" +
            "\n Nombre:${Person1.Nombre},\n Apellido: ${Person1.Apellidos}" +
            "\n Sexo: ${Person1.Sexo},\n Altura: ${Person1.Altura}")

    CarroChipiado.Marca = "Nissan"
    CarroChipiado.Modelo = "El ultimo pq si"
    CarroChipiado.Placas = "PPCDALC"
    CarroChipiado.Color = "NEGRO (pa q no se note lo marrano, vdd)"

    println("El vehiculo esta encendido?")
    println("------------------------------------")
    println("${CarroChipiado.Encendido}")
    if (CarroChipiado.Encendido == false){
        println("------------------------------------")
        println("No, pero ahorita te lo enciendo, mi rey")
        println("------------------------------------")
    CarroChipiado.EncenderVehiculo()
        println("------------------------------------")
    }else{
        println("------------------------------------")
   println("Claro q si, mi rey")
     println("Quieres que lo apague?")
       println("1.- Si 2.- No")
        println("------------------------------------")
        op = readLine()!!.toInt()
        if (op == 1 ){
            CarroChipiado.ApagarVehiculo()
        }
        println("------------------------------------")
           println("${CarroChipiado.Encendido}")
        }
    println("El nivel de gasolina es: ${CarroChipiado.Gasolina}")
    println("Quieres cargar gasolina?")
    println("1.- Si 2.- No")
    op1 = readLine()!!.toInt()
    if (op1==1){
        CarroChipiado.CargarGasolina(10)
    }
    println("El vehiculo tiene ahora: ${CarroChipiado.Gasolina}L de gasolina")
}

