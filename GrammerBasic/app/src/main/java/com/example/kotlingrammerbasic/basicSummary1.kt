//함수, 상수,변수, 스트링 템플릿
package com.example.kotlingrammerbasic

 fun main(){
     helloWorld()
     println(add(4, 5))

     //3. String Template
     //스트링 내부에서 변수 사용 시 $표시 사용
     //${} 대괄호 사용하면 띄어쓰기 없이 가능
     val name = "minjeong"
     val lastname = "Kim"
     println("my name is ${name+lastname}I'm 24")
     println("is this true? ${1==0}")
     println("this is 2\$a")  //escape문자 \를 이용해 달러표시 보여줌
 }

//1. 함수
fun helloWorld() : Unit{ //Unit==void 생략 가능
    println("hello WORLD")
}

fun add(a:Int, b:Int) : Int{  //return 값 있을 시, 리턴타입 생략 불가능
    return a+b
}

//2. 상수, 변수
//val vs var
//val = value 상수
//var = variable 변수
fun hi(){
    val a : Int = 10
    var b : Int = 9
    var e : String //생략 불가능
    //a = 100 불가능
    b = 100

    //자료형은 생략 가능
    val c = 100
    var d = 100
    var name2 = "minjeong"
}