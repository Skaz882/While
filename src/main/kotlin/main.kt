fun main() {
    var userAns: Int
    val userString: String



    do {
        println("Beverage Menu")
        println("1) Water")
        println("2) Iced Tea")
        println("3) Lemonade")
        println("4) Cranberry Juice")
        println("5) Orange Juice")
        println("6) Milk")

        print("Enter number: ")
        userAns = readLine()!!.toInt()
    } while (userAns >= 7)
        userString = when (userAns){
          1 -> "Water"
          2 -> "Iced Tea"
          3 -> "Lemonade"
          4 -> "Cranberry Juice"
          5 -> "Orange Juice"
          6 -> "Milk"
        else -> "Select again"
      }
        println("Your choice is $userString")
}