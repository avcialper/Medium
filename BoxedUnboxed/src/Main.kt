fun main() {

    /**
     *      Bütün boxed değerlerde aynı sonuçları alacağımızı düşünebiliriz, ancak burada ince bir ayrıntı var. Eğer
     *      unboxed değişkenin değeri, byte değer aralığında yani -128 ile 127 arasında ise, bu değişkenler referans
     *      olarak aynı nesneyi işaret ederler. Bu durum JVM tarafında yapılan özel optimizasyonlardan kaynaklanır.
     */

    val numberOne: Int = 120
    val boxedNumberOne: Int? = numberOne
    val boxedNumberTwo: Int? = numberOne

    println(boxedNumberOne === boxedNumberTwo)
}