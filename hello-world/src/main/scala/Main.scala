object Main extends App {

  // variables
  var a: Int = 5
  val b: Double = 12
  println(a)
  println(b)

  // funciones
  def suma(a: Int, b: String): String = b + " " + a
  def algo(b: String) : String = {
    "Ingresaste " + b
  }
  def resta(a: Int, b: Int): Unit = {
    println(a + b)
  }
  println(suma(15, "17"))
  println(algo("a"))
  resta(12, 12)

  // objetos
  object Objecto {
    def sumar(a: Int, b: Int): Int = a + b
  }
  println(Objecto.sumar(12, 13))

  // condicionales
  val n: Int = 10
  
  if (n == 1) {
    println("Vale 1")
  } else if (n == 2) {
    println("Vale 2")
  } else {
    println("No vale ni 1 ni 2")
  }
  
  var k = 10
  println(if (k == 10) "K vale 10" else "K no vale 10")

  // match
  val mes = 6

  println(mes match {
    case 1 => "Enero"
    case 2 => "Febrero"
    case 3 => "Marzo"
    case 4 => "Abril"
    case 5=> "Mayo"
    case 6 => "Junio"
    case 7 => "Julio"
    case 8 => "Agosto"
    case 9 => "Septiembre"
    case 10 => "Octubre"
    case 11 => "Noviembre"
    case 12 => "Diciembre"
    case _ => "Ninguno"
  })

  // while
  var h: Int = 0
  while (h < 20) {
    println(s"h vale $h (el siguiente valor de h es ${h + 1})")
    h += 1
  }
  
  // map
  def cubo(x: Int) = x * x * x
  val numeros = List(4, 8, 12, 6, 23, 42)
  val nuevosNumeros = numeros.map(x => x * 2)
  val cuboNumeros = numeros.map(cubo)
  println(nuevosNumeros)
  println(cuboNumeros)
}