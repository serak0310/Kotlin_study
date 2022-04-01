//조건식(if, when), Array, List, 반복문(For, While)

package com.example.kotlingrammerbasic

fun main(){
    checkNum(1)
    for1()
    while1()
}

//4. 조건식
fun maxBy(a: Int, b:Int) : Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

//삼항연산자가 없는 대신 아래처럼 사용
//Expression
fun maxBy2(a:Int, b:Int) : Int = if(a>b) a else b

//자바의 void는 Statement
//코틀린의 모든 함수는 Expression: Unit을 반환하기 때문
fun checkNum(score : Int){
    //when이 function으로 사용될 때
    //Statement
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2,3")
        else -> println("i dont know")      //else 생략 가능
    }
    // when이 return식으로 사용될 때
    //Expression
    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3                           //else 생략 불가능
   }
    println("b: $b")

    //범위값
    //Statement
    when(score){
        in 90..100 -> println("you are genius")
        in 70..80 -> println("not bad")
        else -> println("okay")
    }
}

//Expression vs Statement
//Expression: 값 반환 o
//Statement: 값 반환 x, 명령을 제시하는 문장


//5. Array and List

//Array: 메모리 처음부터 할당, 일반적인 배열
//List 1.List 2.MutableList(ArrayList)
//1.List: 수정 불가능
//2.MutableList 수정 가능, ArrayList == 사이즈가 동적인 배열

fun array(){
    //초기화
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    val array2 : Array<Any> = arrayOf(1, "d", 3.4)   //Array<Any>

    array[0]=3
    //list[0]=3 불가능
    var result = list.get(0)

    //arrayList 생성
    val arrayList = ArrayList<Int>()
    arrayList.add(10)
    arrayList.add(20)
    //arrayList = arrayListOf()     오류. 새 객체 생성 후 할당 불가능. val
}

//6. For / While
fun for1(){
    val students = arrayListOf("a", "b", "c", "d")

    for(name in students){
        println("${name}")
    }
    var sum = 0
    for(i in 1..100){     //1~100
        sum +=i
    }
    println(sum)

    for(i in 1..10 step 2){     //1 3 5 7 9
        sum +=i
    }
    println(sum)

    for(i in 10 downTo 1){     //10 9 8 7 6 ...
        sum +=i
    }
    println(sum)

    for(i in 1 until 100){     //1~99
        sum +=i
    }
    println(sum)

    //인덱스와 함께 배열 사용하고싶은 경우
    //index는 0부터 시작
    for((index, name) in students.withIndex()){
        println("${index+1}번째 학생: ${name}")
    }

}

fun while1(){
    var index = 0
    while(index<10){
        println("current index ${index}")
        index++
    }
}





