package screen

class ShoppingHome {
    fun start() {
        showWelcomeMessage()
        showCategories()
    }

    private fun showWelcomeMessage() {
        println("쇼핑을 계속 하시려면 이름을 입력해주세요 :)")
        println("안녕하세요, shoppi에 오신 것을 환영합니다.")

        val userName = readln()

        println(
            """
            감사합니다, 반갑습니다, $userName 님
            원하시는 카테고리를 입력해주세요.
            ================================
        """.trimIndent()
        )
    }

    private fun showCategories() {
        val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }
}