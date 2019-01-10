package es.mercadona.codepairing

class MemberListRepository {
    fun fetch(): List<Member> = listOf(
        Member("Fernando", 66.56, Area.DESIGN, Role.PRODUCT_MANAGER),
        Member("Dani", 78.01, Area.PRODUCT, Role.PRODUCT_MANAGER),
        Member("Miquel", 66.49, Area.ENGINEERING, Role.DESIGNER),
        Member("Quique", 42.45, Area.DESIGN, Role.DESIGNER),
        Member("Aristrol", 88.68, Area.PRODUCT, Role.DESIGNER),
        Member("Imanol", 30.36, Area.PRODUCT, Role.PRODUCT_MANAGER),
        Member("Andrew", 24.35, Area.ENGINEERING, Role.CODER),
        Member("Pedro", 77.66, Area.PRODUCT, Role.CODER),
        Member("Juan Pablo", 65.08, Area.ENGINEERING, Role.DESIGNER),
        Member("Nacho", 23.47, Area.DESIGN, Role.CODER),
        Member("Punzano", 54.64, Area.PRODUCT, Role.DESIGNER),
        Member("Igor", 59.15, Area.ENGINEERING, Role.PRODUCT_MANAGER),
        Member("Joel", 87.79, Area.DESIGN, Role.PRODUCT_MANAGER),
        Member("Jose", 59.13, Area.ENGINEERING, Role.CODER),
        Member("Raúl", 48.90, Area.DESIGN, Role.DESIGNER),
        Member("Sergio", 41.81, Area.DESIGN, Role.CODER),
        Member("Tony", 82.27, Area.PRODUCT, Role.CODER),
        Member("Jose Antonio", 56.19, Area.ENGINEERING, Role.PRODUCT_MANAGER)
    )
}
