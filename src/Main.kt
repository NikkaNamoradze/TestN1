fun main() {

    val mathObject = Math()

    //ორი რიცხვის უსგ
    println(mathObject.greatestCommonDivider(15, 36))

    //ორი რიცხვის უსჯ
    mathObject.lowestCommonMultiple(0, 76) //თუ უდიდესი საერთო გამყოფი არის ნული
    mathObject.lowestCommonMultiple(12, 15)

    //სტრიქონის შემოწმება $ სიმბოლოზე
    mathObject.stringChecker("1$ არის 3.06 ლარი")
    mathObject.stringChecker("1 დოლარი არის 3.06 ლარი")

    //ლუწი რიცხვების ჯამი 100-ის ჩათვლით
    println(mathObject.evenNumbersSum(100))

    //სტრიქონის შებრუნება
    println(mathObject.stringReverser("547810"))
    println(mathObject.stringReverser("ნიკა"))

    //პალინდრომზე შემოწმება
    mathObject.checkPalindrome("ნიკა")
    mathObject.checkPalindrome("ნიკა აკინ")


}