package com.blogspot.sontx.chatsocket.client.model.handler;

import com.blogspot.sontx.chatsocket.lib.bean.Response;
import com.blogspot.sontx.chatsocket.lib.bo.ObjectTransmission;

public interface ResponseHandler {
    void handle(ObjectTransmission transmission, Response response) throws Exception;
}
