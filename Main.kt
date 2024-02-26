//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun AreaRectangulo(base:Float,altura:Float):Float{
return base*altura
}

fun VolumenPrisma(areaBase: Float, alturaPrisma: Float):Float{
    return areaBase*alturaPrisma
}
//3.-
fun promedio(cal1: Float = 8f,cal2:Float = 8f,cal3:Float):Float{
    val promedio = (cal1+cal2+cal3)/3f
    return promedio
}
//5.-
fun ladosTriangulo(L1:Float,L2:Float,L3:Float){
    if(L1 == L2 && L2 ==L3){
        println("El triangulo es EQUILATERO")
    } else if(L1 == L2 || L1 == L3 || L2 == L3){
        println("El triangulo es ISOCELES")
    }else{
       println("El triangulo es ESCALENO")
    }
}
//6.-
fun tipoDato(dato:Any){
    when(dato){
        is Int ->println("Es un dato de tipo ENTERO")
        is Double -> println("Es un dato de tipo decimal(pero decimal grandoteee)")
        is String -> println("Es un dato de tipo CADENA DE CARACTERES(letritas de amorrr)")
        else -> println("Es otro tipo de dato. Ni lo topo")
    }
}
//7.-
fun repeticionNombres(nombre:String, listaNombres: List<String>):Int {
    return listaNombres.count { it -> it.contains(nombre) };
}

fun main() {
    //7.-
        val listaNombres = listOf("Pedro Luis",
                            "Juan Manuel",
                            "Juan Luis",
                            "María Inés",
                            "Romeo",
                            "Ernesto",
                            "Juan Pedro",
                            "Ariadna",
                            "Mireya María",
                            "Ana Sofía",
                            "José Juan")
        val nombreRepetido = "Luis"
        val numNombreRepetido = repeticionNombres(nombreRepetido,listaNombres)
        println("El numero de veces que se repite el nombre dee $nombreRepetido es de: $numNombreRepetido")

    //6.-
    val dato1 = 6
    val dato2 = 8.23
    val dato3 = "TRAKAAAA, diria YeriMua"
    val dato4 = false

        //tipoDato(dato1)
        //tipoDato(dato2)
        //tipoDato(dato3)
        //tipoDato(dato4)

    val base = 10f
    val altura = 3f
    val alturaPrisma = 12f
    val AreaRec = AreaRectangulo(base, altura)
    val volPrisma = VolumenPrisma(AreaRec, alturaPrisma)

    //5.-
        //ladosTriangulo(4f,5f,6f)
        //ladosTriangulo(4f,4f,7f)
        //ladosTriangulo(8f,8f,8f)
    //4.-
        //println("El promedio de las calificaciones es: ${promedio(cal3= 10f)}")

    //1.-
        // println("El área del rectangulo es: $AreaRec")
    //2.-
        //println("El volumen del prisma rectangular es: $volPrisma")
}
