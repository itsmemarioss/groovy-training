import java.util.concurrent.*

Thread.start {
    println "thread"
}

Thread.start('thread-name') { /*do something*/ }

BlockingQueue queue = [] as LinkedBlockingQueue

Thread.start('push') {
    10.times {
        try {
            println "${Thread.currentThread().name}\t: ${i}"
            queue << it
            sleep 100
        } catch (Exception e) {
        }
    }
}

Thread.start('pop') {
    for ( in in 0..9) {
        sleep 200
        println "${Thread.currentThread().name}\t: ${queue.take()}"
    }
}

sleep 5000

println 'done'
