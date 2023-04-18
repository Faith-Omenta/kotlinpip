fun main() {
    var words=vowels("faith")
    println(words)
    var person=Human("Glenah",29,80.8)
    person.eat(4)
    println(person.weight)
    person.speak("I like peace and joy")
    person.birthday(1)
    println(person.age)

    var name=Information("Darlene","Nyanchoka","nyanchokdarlen@gmail.com",79088989,"lindsay")
    println(name.email)
    println(name.lastName)
}
fun vowels(words:String):Int {
    var count = 0
    var x= arrayOf("a","e","i","o","u")
    for (x in words) {

    }
    return count++
}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight: Int){
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")
    }

//speak(speech: String) :Prints the string passed to it
fun speak(speech:String){
    println(speech)
}
// birthday( ) :Increments the human’s age by 1
fun birthday(birthday: Int){
    age += birthday
}
}

//Create an instance of this human class and invoke all its functions

//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
data class Information(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String )


