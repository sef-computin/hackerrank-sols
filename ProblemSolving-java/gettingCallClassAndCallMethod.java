public static String getCallerClassAndMethodName() {
    StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
    String message = "";
    if(stackTraceElements.length >= 3) {
        StackTraceElement element = stackTraceElements[2];
        String className = element.getClassName();
        String methodName = element.getMethodName();
        message = className + "#" + methodName;
        return message;
}
    else return null; 
}
