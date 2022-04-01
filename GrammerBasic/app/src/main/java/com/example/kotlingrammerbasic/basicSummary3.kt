//NonNull,Nullable

package com.example.kotlingrammerbasic

import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

fun main(){
    nullcheck()
}

//7. Nullable / NonNull
fun nullcheck(){
    //NPE: NULL Pointer Exception
    //자바에서는 실행시간에 나타남. 런타임 오류.

    var name = "minjeong"           //NonNUll
    var nullName : String? = null   //Null일 수도 있음
    var nameInUpperCase = name.uppercase()
    var nullNmaeInUpperCase = nullName?.uppercase()     //nullName이 null이 아니면 uppercase. null이면 전체가 null 반환. 컴파일에서 null 잡기

    // ?: 앨비스 연산자
    var lastName : String? = null
    var fullName = name+" "+(lastName ?: "no lastname") //lastName이 null이라면 no lastname 반환
    println(fullName)

    //!!    nullable로 지정되어있지만 null이 아님을 보증
}

fun ignoreNulls(str : String?){     //함수가 인자로 null값을 받을 수도 있음
    val mNotNull : String = str!!   //str에 절대 null값이 들어올 일이 절대 없으면 !! 붙여 컴파일러에게 알려주기
    val upper = mNotNull.uppercase()    //mNotNull? 할 필요 없음
    //정말로 확실하지 않는 이상 !! 사용 지양

    val email : String? = "serak@naver.com" //email이 nullable
    //email이 null이 아니라면 중괄호 안의 문장 실행. let으로 안에 전달해 줌.
    email?.let {
        println("my email is ${email}") //null이 아니여야만 해당 문장이 프린트됨.
    }
}
