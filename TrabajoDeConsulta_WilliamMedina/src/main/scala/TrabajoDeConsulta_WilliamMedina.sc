//Calcular Integral por metodo de Simpsom 1/3

def Integracion (f:Double => Double, a: Int, b:Int): Double = (b-a) * ((f(a) + 4*(f((a+b)/2)) + f(b)) / 6)

val f1 = (x:Double) => (-Math.pow(x,2) + 8*x - 12)
val resultadoF1 = Integracion(f1, 3, 5)

val f2 = (x:Double) => (3*Math.pow(x,2))
val resultadoF2 = Integracion(f2, 0, 2)

val f3 = (x:Double) => (x + 2*Math.pow(x,2) - Math.pow(x,3) + 5*Math.pow(x,4))
val resultadoF3 = Integracion(f3, -1, 1)

val f4 = (x:Double) => ((2*x + 1) / (Math.pow(x,2) + x))
val resultadoF4 = Integracion(f4, 1, 2)

val f5 = (x:Double) => Math.pow(2.7182818284, x)
val resultadoF5 = Integracion(f5, 0, 1)

val f6 = (x:Double) => (1 / Math.pow((x - 1), 1/2))
val resultadoF6 = Integracion(f6, 2, 3)

val f7 = (x:Double) => (1 / (1 + Math.pow(x,2)))
val resultadoF7 = Integracion(f7, 0, 1)

//Calcular Error Valor Absoluto

def valorAbsoluto (valE: Double, valO: Double): Double = math.abs(valE - valO)

val CalcularError1 = valorAbsoluto(7.33, resultadoF1)

val CalcularError2 = valorAbsoluto(8, resultadoF2)

val CalcularError3 = valorAbsoluto(3.333, resultadoF3)

val CalcularError4 = valorAbsoluto(1.09861, resultadoF4)

val CalcularError5 = valorAbsoluto(1.71828, resultadoF5)

val CalcularError6 = valorAbsoluto(0.828427, resultadoF6)

val CalcularError7 = valorAbsoluto(0.785398, resultadoF7)
