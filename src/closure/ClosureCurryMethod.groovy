//Closure#curry method 

def log = {String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "log message")

def debugLog = log.curry("DEBUG")

debugLog(new Date(), "another log")

def todayDebugLog = log.curry("DEBUG", new Date())

todayDebugLog("message")

//rcurry fill parameters from rigth to left
def defaultMessageLog = log.rcurry("info")
defaultMessageLog("DEBUG", new Date())
