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


// 확장함수
// 기존 클래스의 함수를 확장
// ex) 스트링 클래스에 기능을 추가할 때
val pizzaIsGreat : String.() -> String = {
    this + "Piszza is BEST!!"
}

fun extendString(name:String, age:Int) : String {
    val introduceMyself : String.(Int) -> String = {"I'm ${this} and ${it} years old"}
    // this=확장함수가 부르는 오브젝트인 String
    // it = Int, Int 딱 하나만 파라미터이기 때문에
    return name.introduceMyself(age)
}


// 람다의 Return
// 마지막 구현식을 return함
// input 파라미터는 여러개 가 올 수 있으므로 괄호 꼭 해줘야 함.
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }

}

// 람다를 표현하는 여러가지 방법
// 람다식을 파라미터로 받기
fun invokeLamda(lamda : (Double)->Boolean) : Boolean {
    return lamda(5.234)
}

fun main(){
    println(square(12))
    println(nameAge("min", 24))

    val a = "minjoeng said "
    println(a.pizzaIsGreat())

    println(extendString("ariana", 28))

    println(calculateGrade(90))

    val lamda = {number:Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({ it>3.24 }))
    println(invokeLamda{ it>3.24 })     //마지막 파라미터가 람다식일 때 괄호 생략 가능

}

