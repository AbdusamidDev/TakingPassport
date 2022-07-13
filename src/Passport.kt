data class Passport(
    var name: String = "-",
    var surname: String = "-",
    var patronymic: String = "-",
    var age: Byte = 0,
    var gender: String = "-",
    var citizenship: String = "-",
    var issue: String = "-",
    var expiry: String = "-",
    var cardNumber: String = "-"

) {
    override fun toString(): String {
        return "Passport(Name='$name', Surname='$surname', Patronymic='$patronymic', Age=$age, Gender='$gender', Citizenship='$citizenship', Issue='$issue', Expiry='$expiry', Seria Number='$cardNumber')"
    }
}