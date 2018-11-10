package SeleksiArkademy

fun main(argv:Array<String>){
    var text:String
    var ch:String

    print ("Masukkan kata : ")
    text = readLine().toString()
    print("Masukkan huruf : ")
    ch = readLine().toString()

    println(CharCounter(text, ch))
}

fun CharCounter(t:String,c:String):Int{
    var res:Int = 0

    print("Jumlah huruf $c pada kata $t  adalah  ")

    for(i in t){
        if(c == i.toString()){
            res++
        }
    }

    return res
}