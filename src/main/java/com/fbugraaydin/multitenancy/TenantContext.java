package com.fbugraaydin.multitenancy;

public class TenantContext {

    private static final ThreadLocal<String> currentThread = new InheritableThreadLocal<>();

    public static String getCurrentTenant(){
        return currentThread.get();
    }

    public static void setCurrentTenant(String tenant){
        currentThread.set(tenant);
    }

    public static void clear(){
        currentThread.set(null);
    }

}
