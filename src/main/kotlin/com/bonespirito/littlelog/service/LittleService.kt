package com.bonespirito.littlelog.service

import com.bonespirito.logtracing.service.LoggerTracing
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class LittleService(
    @Autowired val loggerTracing: LoggerTracing
) {

//    val logger = LoggerFactory.getLogger(LittleService::class.java)!!

    @PostConstruct
    fun showLog() {
        loggerTracing.getUUID()
//        logger.info("\n\n UUID: ${list[0]} \n")
    }
}
