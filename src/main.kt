fun main(args: Array<String>) {

    var animals= ArrayList<Animals>(1)

    animals.add(Mammals(1,"Panda",1869))

    animals.add(Mammals(2,"Zebra", 1778))
    animals.add(Mammals(3,"Koala", 1816))
    animals.add(Mammals(4,"Sloth", 1804))
    animals.add(Mammals(5,"Armadillo ", 1758))
    animals.add(Mammals(6,"Raccoon ", 1758))
    animals.add(Mammals(7,"Bigfoot ", 2021))

    animals.add(Birds(8," Pigeon ", 1837))
    animals.add(Birds(9,"Peacock ", 1821))
    animals.add(Birds(10,"Toucan ", 1758))
    animals.add(Birds(11,"Parrot ", 1824))
    animals.add(Birds(12,"Swan ", 1758))
    animals.add(Fish(13,"Salmon ", 1758))
    animals.add(Fish(14,"Catfish ", 1817))
    animals.add(Fish(15,"Perch ", 1758))
    for(i in 0..animals.size-1){
        println("name is ${animals[i].name}")
    }

    animals.sortBy {it.yearDiscovered }

    for(i in 0..animals.size-1){
        println("name is ${animals[i].name} discovered in ${animals[i].yearDiscovered} ")
    }
    animals.sortedBy { it.name }

    for(i in 0..animals.size-1){
        println("name is ${animals[i].name}")
    }

    animals.sortBy {it.move() }

    for(i in 0..animals.size-1){
        println("name is ${animals[i].name} , which ${animals[i].move()}")
    }

    var filteredanimal=animals.filter { it->it.breath().contains("lungs") }

    for(i in 0..filteredanimal.size-1){
        println("name is ${filteredanimal[i].name} , which ${filteredanimal[i].move()} and ${filteredanimal[i].breath()} " )
    }

    filteredanimal=filteredanimal.filter { it->it.yearDiscovered==1758 }

    for(i in 0..filteredanimal.size-1){
        println("name is ${filteredanimal[i].name} , which ${filteredanimal[i].move()} and ${filteredanimal[i].breath()} discovered in ${filteredanimal[i].yearDiscovered} " )
    }
    filteredanimal=filteredanimal.filter { it->it.reprduce().contains("egg")&&it.breath().contains("lungs") }

    for(i in 0..filteredanimal.size-1){
        println("name is ${filteredanimal[i].name} , which ${filteredanimal[i].move()} and ${filteredanimal[i].breath()} reproduce with ${filteredanimal[i].reprduce()} " )
    }

    filteredanimal=filteredanimal.filter { it->it.yearDiscovered==1758 }
    filteredanimal.sortedBy { it.name }

    for(i in 0..filteredanimal.size-1){
        println("name is ${filteredanimal[i].name} , which ${filteredanimal[i].move()} and ${filteredanimal[i].breath()} discovered in ${filteredanimal[i].yearDiscovered} " )
    }


}