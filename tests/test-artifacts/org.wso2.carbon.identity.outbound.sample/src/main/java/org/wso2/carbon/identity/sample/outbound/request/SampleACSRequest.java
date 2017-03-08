package org.wso2.carbon.identity.sample.outbound.request;

import org.wso2.carbon.identity.gateway.request.CallbackAuthenticationRequest;

public class SampleACSRequest extends CallbackAuthenticationRequest {


    protected SampleACSRequest(SampleACSRequestBuilder builder) {
        super(builder);
    }

    public static class SampleACSRequestBuilder extends CallbackAuthenticationRequest.CallbackAuthenticationRequestBuilder {

        @Override
        public SampleACSRequest build() {
            return new SampleACSRequest(this);
        }
    }

}