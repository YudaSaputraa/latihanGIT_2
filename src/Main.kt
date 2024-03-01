class Triangle(val height : Float, val base:Float ){

    fun calculateArea(){
        println("Luas Segitiga ${(base * height)/2}")
    }
    fun calculatePerimeter(){
        println("Keliling Segitiga ${3*base}")
    }
}


fun main() {
    val triangle = Triangle(4.0F, 3.0F)
    println(triangle.calculateArea())
    println(triangle.calculatePerimeter())

}