package es.mercadona.codepairing

data class Member(
    val name: String,
    val salary: Double,
    val area: Area,
    val role: Role,
    val productivity: Int = 0
)