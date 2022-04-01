//Class

package com.example.kotlingrammerbasic

//8. Class
//코틀린은 자바와 달리 파일과 클래스 이름 일치하지 않아도 됨. 여러 클래스를 한 파일 안에 넣을 수 있음.

//클래스 정의
open class Human constructor(val gender :String = "Anonymous"){      //생성자. constructor 생략 가능. default값. open을 통해 상속가능하게 만듦.

    //부 생성자
    constructor(gender: String, age :Int) : this(gender){  //주생성자의 위임을 this로 받아야 함.
        println("my gender is ${gender}, ${age}years old")
    }

    //처음 인스턴스 생성 시에 하고싶은 동작 정의
    //constructor가 아무리 많아도 주생성자의 일부인 init이 가장 먼저 실행됨
    init {
        println("new human!!")
    }

    val name = "minmin"
    //val gender = gender   :생성자 부분에 val로 정의해줘서 다시 쓸 필요 없음

    fun eatingCake(){
        println("yummmy")
    }

    open fun singAsong(){
        println("lalala")
    }
}

//상속
//상속을 하기위해선 부모클래스에 open해야 함. 기본적으로 final 클래스임
class Korean : Human(){     //Human클래스에 open을 해놔서 상속 가능함.
    //부모 클래스의 메소드 오버라이딩
    override fun singAsong(){
        super.singAsong()
        println("라라랄")
        println("MY gender is ${gender}")       //부모의 파라미터 받아옴
    }
}

fun main(){
    //클래스 인스턴스(객체) 생성
    val human = Human("woman")     //new 키워드 필요없음. 생성자에 맞춰 넣어주기.
    val stranger = Human()      //default값으로 생성자에 "anonymous"넣어줘서 값 넣지않고 생성 가능.
    val brother = Human("man", 27)

    human.eatingCake()
    println("this human's name is ${human.gender}")
    println("this human's name is ${stranger.gender}")

    val korean = Korean()
    korean.singAsong()
}
