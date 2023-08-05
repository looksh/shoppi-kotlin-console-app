package data

// 프로덕트 전역에서 상품 데이터를 저장하므로 같은 값이 유지되어야하기에 싱글턴 객체로
object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts

    fun addProduct(product: Product) {
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        } ?: run {
            mutableProducts[product] = 1
        }
    }
}