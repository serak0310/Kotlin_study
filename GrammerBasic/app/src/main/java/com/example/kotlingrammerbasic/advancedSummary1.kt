//람다
package com.example.kotlingrammerbasic

// 1. Lamda
// 람다식은 마치 value처럼 다룰 수 있는 익명함수
// 1) 메소드를 파라미터로 넘겨줄 수 있음. fun maxBy(a :Int)에서 a 대신 메소드 전달 가능.
// 2) return 값으로 메소드를 사용할 수 있음.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}
// 선언 람다이름     타입     a와 같은 x값      처리방식
val square : (Int) -> (Int) = {number -> number*number}
val square2 = {number :Int -> number*number}        //타입 추론이 가능함

val nameAge = {name : String, age : Int ->
    "my name is ${name} , I'm ${age}"
}


//확장함수
//ex) 스트링 클래스에 기능을 추가할 때
val pizzaIsGreat : String.() -> String = {
    this + "Piszza is BEST!!"
}


fun main(){
    println(square(12))
    println(nameAge("min", 24))

    val a = "minjoeng said "
    println(a.pizzaIsGreat())
}

