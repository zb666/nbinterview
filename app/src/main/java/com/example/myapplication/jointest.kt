package com.example.myapplication

fun main(){
    // 用join,让制定的线程获取执行权利
    val tA = Thread(Runnable {

    },"a-thread")
    val tB = Thread("b-thread")
    tA.start()
    tA.join()
    tA.isDaemon = true //tA是 main线程的守护线程
    tB.start()
    //主线程结束
    //线程的优先级

    Thread.sleep(1_000)


}