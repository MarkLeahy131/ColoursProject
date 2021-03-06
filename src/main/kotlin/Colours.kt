class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{
        //TODO return the colours list
        return listOf("this should return the colours list")
    }

    fun numberOfColours (): Int{
        //TODO return the size of the colours list
        fun main(args:List<String>){
            val list = listOf<String>()
            val size = list.size
        }
        return 0
    }

    fun firstColour() : String{
        //TODO return the first colour in the list
        return "this should return the first colour in the list"
    }

    fun lastColour() : String{
        //TODO return the last colour list
        return "this should return the last colour in the list"
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //TODO return the colours in alphabetical order
        return listOf("this should return colours in alphabetic order")
    }

    fun coloursInAllCapitals() : List<String>{
        //TODO return the colours in ALL CAPS
        return listOf("this should return colours in all capitals")
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return listOf("this should return colours that start with ${letter}")
    }
//Reference: Kotlinlang.org/docs/constructing-collections
    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        val largerThan6 = colours.filter { it.length >= 6 }
        return (largerThan6)
    }

//Reference: Kotlinlang.org/docs/constructing-collections
    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
       val lessThan6 = colours.filter { it.length <6}
        return (lessThan6)
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return false
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}