package es.mercadona.codepairing

import es.mercadona.codepairing.Area.DESIGN
import es.mercadona.codepairing.Area.ENGINEERING
import es.mercadona.codepairing.Area.PRODUCT
import es.mercadona.codepairing.Role.CODER
import es.mercadona.codepairing.Role.DESIGNER
import es.mercadona.codepairing.Role.PRODUCT_MANAGER

class MemberMother {
    companion object {
        fun arrayProductivity() = listOf(
                Member("Dani", 78.01,  PRODUCT,  PRODUCT_MANAGER),
                Member("Quique", 42.45, DESIGN, DESIGNER),
                Member("Imanol", 30.36, PRODUCT, PRODUCT_MANAGER),
                Member("Andrew", 24.35, ENGINEERING, CODER),
                Member("Jose", 59.13, ENGINEERING, CODER),
                Member("Raúl", 48.90, DESIGN, DESIGNER),
                Member("Aristrol", 88.68, PRODUCT, DESIGNER),
                Member("Nacho", 23.47, DESIGN, CODER),
                Member("Punzano", 54.64, PRODUCT, DESIGNER),
                Member("Igor", 59.15, ENGINEERING, PRODUCT_MANAGER),
                Member("Sergio", 41.81, DESIGN, CODER),
                Member("Jose Antonio", 56.19, ENGINEERING, PRODUCT_MANAGER),
                Member("Fernando", 66.56, DESIGN, PRODUCT_MANAGER),
                Member("Miquel", 66.49, ENGINEERING, DESIGNER),
                Member("Pedro", 77.66, PRODUCT, CODER),
                Member("Juan Pablo", 65.08, ENGINEERING, DESIGNER),
                Member("Joel", 87.79, DESIGN, PRODUCT_MANAGER),
                Member("Tony", 82.27, PRODUCT, CODER)
        )

        fun productivityGroupedByArea() = listOf(
                Member("Dani", 78.01, PRODUCT, PRODUCT_MANAGER),
                Member("Imanol", 30.36, PRODUCT, PRODUCT_MANAGER),
                Member("Andrew", 24.35, ENGINEERING, CODER),
                Member("Jose", 59.13, ENGINEERING, CODER),
                Member("Quique", 42.45, DESIGN, DESIGNER),
                Member("Raúl", 48.90, DESIGN, DESIGNER),
                Member("Aristrol", 88.68, PRODUCT, DESIGNER),
                Member("Punzano", 54.64, PRODUCT, DESIGNER),
                Member("Igor", 59.15, ENGINEERING, PRODUCT_MANAGER),
                Member("Jose Antonio", 56.19, ENGINEERING, PRODUCT_MANAGER),
                Member("Nacho", 23.47, DESIGN, CODER),
                Member("Sergio", 41.81, DESIGN, CODER),
                Member("Pedro", 77.66, PRODUCT, CODER),
                Member("Tony", 82.27, PRODUCT, CODER),
                Member("Miquel", 66.49, ENGINEERING, DESIGNER),
                Member("Juan Pablo", 65.08, ENGINEERING, DESIGNER),
                Member("Fernando", 66.56, DESIGN, PRODUCT_MANAGER),
                Member("Joel", 87.79, DESIGN, PRODUCT_MANAGER)
        )
    }
}
