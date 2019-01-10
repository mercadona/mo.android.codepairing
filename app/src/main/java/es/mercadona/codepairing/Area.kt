package es.mercadona.codepairing

import android.graphics.Color

enum class Area {
    PRODUCT,
    DESIGN,
    ENGINEERING;

    val color: Int
        get() = when (this) {
            PRODUCT -> Color.RED
            DESIGN -> Color.GREEN
            ENGINEERING -> Color.BLUE
        }
}