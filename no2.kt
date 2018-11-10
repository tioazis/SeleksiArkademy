package SeleksiArkademy

fun main(argv:Array<String>){
    print("Masukkan username : ")
    var username:String = readLine().toString()

    if(check1(username) && check2(username)){
        println("Username anda valid")
    }else{
        println("Username anda tidak valid")
    }

}

fun check1(usr:String):Boolean{
    var a = 0
    for(i in usr){
        if (i == '_' || i == '.'){
            a++
        }
    }

    return a==1
}

fun check2(usr:String):Boolean{

    val parts = usr.split("_",".")
    var jml1 = 0
    var jml2 = 0

    for(i in parts[0]){
        if(!i.isUpperCase()){
            jml1++
        }
    }

    for(i in parts[1]){
        if (i.isUpperCase()){
            jml2++
        }
    }

    return jml1 == 5 && jml2 == 2


}