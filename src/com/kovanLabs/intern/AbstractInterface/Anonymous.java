package com.kovanLabs.intern.AbstractInterface;
@FunctionalInterface
interface Plugin{
    void execute();
}
class CoreSystem{
    void runPlugin(Plugin[] plugins){
        for(Plugin plugin:plugins){
            plugin.execute();
        }
    }
}
