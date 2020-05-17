package com.example.myapplication.lock

import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.ReentrantLock

/**
 * Lock式可重入的锁
 * 公平的锁: 从挂起到可执行的状态，涉及到上下文的切换需要有2W个时间周期的切换
 * 非公平的话不会有等待一个上下文的切换。就可以完成上下文的切换
 */
val reentrantLock = ReentrantLock()
val count = 1
fun main() {
    //LOCk显式锁
    //Synchronized式内置锁
    reentrantLock.tryLock()//尝试获取锁
    addCount()
}

fun addCount() {
    incr()
}

//syhchronized无法被中断，但是Lock可以被中断
fun incr() {
    //显示锁的写法规范
    reentrantLock.lock()
//    reentrantLock.tryLock(10,TimeUnit.SECONDS) 尝试10秒钟获取锁
    try {
        +count
        print("$count") //这里需要
    } finally {
        reentrantLock.unlock()
    }


}