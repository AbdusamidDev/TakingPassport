import java.util.*

fun main() {
    val service = Service()
    var raqam = 0
    do {
        println(
            """
            1. TAKE A PASSPORT
            2. VIEW
            3. EDIT
            0. BACK
        """.trimIndent()
        )
        when (Scanner(System.`in`).nextInt()) {
            1 -> service.passportOlish()
            2 -> service.passportKorish()
            3 -> service.passportOzgartirish()
            0 -> raqam = -1
        }
    } while (raqam == 0)
}