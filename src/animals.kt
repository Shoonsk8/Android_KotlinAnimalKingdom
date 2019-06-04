sealed class Animals(val id:Int, val name:String, var yearDiscovered:Int){



    fun consumeFood( food:String){

    }

    open fun move():String{
        return "move"
    }

    open fun breath():String{
        return "breathe"

    }

    open fun reprduce():String{
        return "reproduce"
    }
}

class Mammals(id: Int, name: String, yearDiscovered: Int): Animals(id, name, yearDiscovered) {
    override fun move():String{
        return "usually walk"
    }

    override fun breath():String{
        return "breathe with lungs"

    }
    override fun reprduce():String{
        return "live births except for platypus"
    }
}


class Birds(id: Int, name: String, yearDiscovered: Int): Animals(id, name, yearDiscovered) {
    override fun move():String{
        return "usually fly"
    }
    override fun breath():String{
        return "breathe with lungs"

    }
    override fun reprduce():String{
        return "egg"
    }

}

class Fish(id: Int, name: String, yearDiscovered: Int): Animals(id, name, yearDiscovered) {
    override fun move() :String{
        return "usually swim"
    }
    override fun breath():String{
        return "breathe with branchia"

    }
    override fun reprduce():String{
        return "egg except for sea horse,guppy etc."
    }
}
