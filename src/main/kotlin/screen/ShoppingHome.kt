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
        val categories: Array<String> = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) println(category)
        println("=> 장바구니로 이동하시려면 #을 입력해주세요")

        var selectedCategory = readLine()
        while (selectedCategory.isNullOrBlank()) {
            println("값을 입력해주세요")
            selectedCategory = readLine()
        }

        when (selectedCategory) {
            "#" -> {
                // TODO 1. 장바구니 이동
            }

            else -> {
                // TODO 2. 카테고리 목록에 없는 값을 입력시 처리
            }
        }
    }
}