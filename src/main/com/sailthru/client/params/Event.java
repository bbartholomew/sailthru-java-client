package com.sailthru.client.params;

import com.google.gson.reflect.TypeToken;
import com.sailthru.client.ApiAction;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Event params
 * @author Ben Bartholomew <bbartholomew@sailthru.com>
 */
public class Event extends AbstractApiParams implements ApiParams {
    protected String id;
    protected String key;
    protected Map<String, Object> vars;
    protected String event;
    protected String schedule_time;
    protected Integer simulate_time;
    protected String sim_id;
    
    public Event(String id) {
        this.id = id;
    }

    public Event() {
        // this will be used when new user_id is to be created
    }
    
    public Event setKey(String key) {
        this.key = key;
        return this;
    }

    public Event setEvent(String eventName) {
        this.event = eventName;
        return this;
    }

    public Event setSimulateTime(Integer simulateTime) {
        this.simulate_time = simulateTime;
        return this;
    }
    
    public Event setSimId(String simId) {
        this.sim_id = simId;
        return this;
    }

    public Event setVars(Map<String, Object> vars) {
        this.vars = vars;
        return this;
    }

    public Event setScheduleTime(String scheduleTime) {
        this.schedule_time = scheduleTime;
        return this;
    }

    public Type getType() {
        java.lang.reflect.Type _type = new TypeToken<Event>() {}.getType();
        return _type;
    }

    public ApiAction getApiCall() {
        return ApiAction.event;
    }
}
