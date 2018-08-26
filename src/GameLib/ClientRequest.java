package GameLib;

import java.io.Serializable;

public class ClientRequest implements Serializable {

    private ClientRequestKey requestKey;
    private Object params;

    public ClientRequest(ClientRequestKey requestKey) {
        this.requestKey = requestKey;
    }

    public ClientRequest(ClientRequestKey requestKey, Object params) {
        this.requestKey = requestKey;
        this.params = params;
    }

    public ClientRequestKey getRequestKey() {
        return requestKey;
    }

    public Object getParams() {
        return params;
    }

    @Override
    public String toString() {
        return "Key: <" + requestKey + "> Params: <" + params + ">";
    }
}
