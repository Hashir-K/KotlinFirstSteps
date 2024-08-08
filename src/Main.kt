//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("I have been waiting for you")
    println("What power do you seek?")
    println("Magic? Sword? Shield?")
    val power = readln()

    if(power.lowercase() == "magic")
    {
        println("$power is a powerful tool but dangerous")
    }
    else if(power.lowercase() == "sword")
    {
        println("$power is deadly but only if the user can wield it")
    }
    else if (power.lowercase() == "shield")
    {
        println("the $power is a wise choice. The best defence is a good offence")
    }

    println("You are the one who will open the door. Don't be afraid")

}