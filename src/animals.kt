sealed class Animals(val id:Int, val name:String, var yearDiscovered:Int){


    fun consumeFood( food:String){

    }

    open fun move(){

    }

    fun breath(){

    }

    fun reprduce(){

    }
}

class Mammals(id: Int, name: String, yearDiscovered: Int): Animals(id, name, yearDiscovered) {
    override fun move(){

    }



}


class Birds(id: Int, name: String, yearDiscovered: Int): Animals(id, name, yearDiscovered) {
    override fun move(){

    }



}

class Fish(id: Int, name: String, yearDiscovered: Int): Animals(id, name, yearDiscovered) {
    override fun move() {

    }

}
