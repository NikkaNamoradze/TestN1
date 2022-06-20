fun main() {


    val mathObject = Math()

    //ორი რიცხვის უსგ
    println(mathObject.greatestCommonDivider(15, 36))

    //ორი რიცხვის უსჯ
    mathObject.lowestCommonMultiple(0, 76) //თუ უდიდესი საერთო გამყოფი არის ნული
    mathObject.lowestCommonMultiple(12, 15)

    //სტრიქონის შემოწმება $ სიმბოლოზე
    stringChecker("1$ არის 3.06 ლარი")
    stringChecker("1 დოლარი არის 3.06 ლარი")

    //ლუწი რიცხვების ჯამი 100-ის ჩათვლით
    println(mathObject.evenNumbersSum(100))

    //რიცხვის შებრუნება
    reverser(4560)

    //პალინდრომზე შემოწმება
    checkPalindrome("ნიკა")
    checkPalindrome("ნიკა აკინ")

}

private fun reverser(x: Int){

    if (x.toString().last() == '0') {
        println(x.toString().reversed().removeRange(0..0))
    }else{
        println(x.toString().reversed())
    }


}

private fun checkPalindrome(str: String) {

    if (str == str.reversed()) {
        println("შემოყვანილი სტრიქონი პალინდრომია")
    } else {
        println("შემოყვანილი სტრიქონი არ არის პალინდრომი")
    }

}

private fun stringChecker(str: String) {

    if (str.contains("$")) {
        println("შეყვანილი სტრიქონი შეიცავს $ ნიშანს")
    } else {
        println("შეყვანილი სტრიქონი არ შეიცავს $ ნიშანს")
    }

}