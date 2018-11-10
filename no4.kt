package SeleksiArkademy

fun main(argv:Array<String>){
    print("Masukkan jumlah orang : ")

    val man = readLine().toString().toInt()
    var sum = 0

    for(i in 0 until man){
        sum+=i
    }

    println("Jabat tangan dilakukan sejumlah $sum kali")
}