fun main(){
    val school= "akirachix"
    println(school[0]+""+school[2]+""+school[3])
    var x= me ("Clever",21)
    println(x)

    val name= "Marisah"
    println(name.length)

    var y= person("C lever")
    println(y)

    var z = person("Janet")
    println(z)
}


fun me (name:String, Age:Int): String{
    var me= ("Hi, my name is $name and I am $Age years old")
    return me
}
fun person (name:String){
    if(name=="Clever")
        println("that's me!")
    else println("I don't know who that is")

}

