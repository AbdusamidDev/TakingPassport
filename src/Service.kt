import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@Suppress("UNREACHABLE_CODE", "NAME_SHADOWING")
class Service : Inteface {
    private var sc = Scanner(System.`in`)
    private val list = ArrayList<Passport>()
    private var issue: String = "-"
    private var expiry: String = "-"
    private var cardNumber = sc.next()
    override fun passportOlish(): String? {
        print("Surname: ")
        val surname = sc.next()
        print("Name: ")
        val name = sc.next()
        print("Patronymic: ")
        sc = Scanner(System.`in`)
        val patronymic = sc.nextLine()
        print("Age: ")
        val age = sc.nextByte()
        if (age >= 16) {

            println(
                """
                1. Male
                2. Female
            """.trimIndent()
            )
            var gender = sc.next()
            when (gender) {
                "1" -> gender = "$name $surname is boy"
                "2" -> gender = "$name $surname is girl"
            }
            print("Citizenship: ")
            val citizenship = sc.next()

            val s1 = Random().nextInt(27)
            val s2 = Random().nextInt(27)
            var ser1 = ""
            var ser2 = ""
            for ((index, i) in ('A'..'Z').withIndex()) {
                if (index == s1) {
                    ser1 = i.toString()
                }
                if (index == s2) {
                    ser2 = i.toString()
                }
            }
            var serRaq = ""
            for (i in 0..6) {
                serRaq += Random().nextInt(10).toString()
            }
            cardNumber = ser1 + ser2 + serRaq


            val startIssue = LocalDateTime.now()
            val format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")

            issue = startIssue.format(format)
            expiry = issue.replace(
                issue.substring(6, 10),
                (issue.substring(6, 10).toInt() + 10).toString()
            )
            list.add(Passport(name, surname, patronymic, age, gender, citizenship, issue, expiry, cardNumber))
        } else {
            println("You are young to take a passport")
        }
        return cardNumber

        println("$issue: ")
        println("$expiry: ")
        println("$cardNumber: ")
    }

    override fun passportKorish() {
        for (passport in list) {
            println(passport)
        }
    }

    override fun passportOzgartirish(): String? {
        for (i in 0 until list.size) {
            println("$i ->${list[i]}")
            val ara = sc.nextInt()
            print("Surname: ")
            val surname = sc.next()
            print("Name: ")
            val name = sc.next()
            print("Patronymic: ")
            sc = Scanner(System.`in`)
            val patronymic = sc.nextLine()
            print("Age: ")
            val age = sc.nextByte()
            if (age >= 16) {
                //println("Your age is small for passport")

                println(
                    """
                1. Male
                2. Female
            """.trimIndent()
                )
                var gender = sc.next()
                when (gender) {
                    "1" -> gender = "$name $surname is boy"
                    "2" -> gender = "$name $surname is girl"
                }
                print("Citizenship: ")
                val citizenship = sc.next()
                val s1 = Random().nextInt(27)
                val s2 = Random().nextInt(27)
                var ser1 = ""
                var ser2 = ""
                for ((index, i) in ('A'..'Z').withIndex()) {
                    if (index == s1) {
                        ser1 = i.toString()
                    }
                    if (index == s2) {
                        ser2 = i.toString()
                    }
                }
                var serRaq = ""
                for (i in 0..6) {
                    serRaq += Random().nextInt(10).toString()
                }
                cardNumber = ser1 + ser2 + serRaq
                val startIssue = LocalDateTime.now()
                val format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")

                issue = startIssue.format(format)
                expiry = issue.replace(
                    issue.substring(6, 10),
                    (issue.substring(6, 10).toInt() + 10).toString()
                )
                list[ara] = Passport(name, surname, patronymic, age, gender, citizenship, issue, expiry, cardNumber)
            } else {
                println("You are young to take a passport")
            }
        }
        return cardNumber
    }
}