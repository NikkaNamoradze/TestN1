import kotlin.math.min

class Math {

    fun greatestCommonDivider(x: Int, y: Int): Int {

        var result = min(x, y)

        while (result > 0) {

            if (x % result == 0 && y % result == 0) {
                break
            } else {
                result -= 1
            }
        }
        return result

    }

    fun lowestCommonMultiple(x: Int, y: Int) {

        try {
            println(x / greatestCommonDivider(x, y) * y)
        } catch (e: ArithmeticException) {
            println("ნულზე გაყოფა არ შეიძლება")
        }

    }

    fun stringChecker(str: String) {

        if (str.contains("$")) {
            println("შეყვანილი სტრიქონი შეიცავს $ ნიშანს")
        } else {
            println("შეყვანილი სტრიქონი არ შეიცავს $ ნიშანს")
        }
    }

    fun evenNumbersSum(x: Int): Int {

        return if (x < 2) {
            x
        } else {
            x + evenNumbersSum(x - 2)
        }

    }

    fun stringReverser(str: String): String {

        if (str.last() == '0') {
            return str.reversed().removeRange(0..0)
        }

        return str.reversed()

    }

    fun checkPalindrome(str: String) {

        if (str == str.reversed()) {
            println("შემოყვანილი სტრიქონი პალინდრომია")
        } else {
            println("შემოყვანილი სტრიქონი არ არის პალინდრომი")
        }

    }

}


