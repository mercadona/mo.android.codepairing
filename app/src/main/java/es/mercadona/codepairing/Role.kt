package es.mercadona.codepairing

enum class Role {
    PRODUCT_MANAGER,
    DESIGNER,
    CODER;

    override fun toString() = when (this) {
        PRODUCT_MANAGER -> "productManager"
        DESIGNER -> "designer"
        CODER -> "coder"
    }
}