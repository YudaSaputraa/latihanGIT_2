class Triangle(val height : Float, val base:Float ){

    fun calculateArea(){
        println("Luas Segitiga ${(base * height)/2}")
    }
    fun calculatePerimeter(){
        println("Keliling Segitiga ${3*base}")
    }
}
class Circle(private val radius: Double) {
    fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    fun calculateCircumference(): Double {
        return 2 * Math.PI * radius
    }
}

fun main(){
    val triangle = Triangle(4.0F, 3.0F)
    println(triangle.calculateArea())
    println(triangle.calculatePerimeter())
    val circle = Circle(10.0)
    println("Area: ${circle.calculateArea()}")
    println("Circumference: ${circle.calculateCircumference()}")
}