fun main(args: Array<String>) {
    println("Unesite visinu")
    var v= readln()?.toDoubleOrNull()

    println("Unesite tezinu")
    var t= readln()?.toDoubleOrNull()

    if (v!=null && t!=null && v>0 && t>0){
        val bmi=t/(v*v)
        println("Vas BMI je: $bmi")
    }else{
        println("Pogresan unos")
    }
}