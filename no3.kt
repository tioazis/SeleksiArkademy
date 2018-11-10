package SeleksiArkademy

fun main(argv:Array<String>){
    var a:Int = 0
    print("Masukkan angka : ")
    a = readLine().toString().toInt()

    printPiramids(a)


}

fun printPiramids(input:Int){


    for(i in 1..input){
        for(j in 1..i){
            print("$i.  ")
        }
        println("")
    }

}