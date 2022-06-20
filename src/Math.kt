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


    fun evenNumbersSum(x: Int): Int {

        return if (x < 2) {
            x
        } else {
            x + evenNumbersSum(x - 2)
        }

    }

}


