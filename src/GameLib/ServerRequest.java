package GameLib;

import java.io.Serializable;

public class ServerRequest implements Serializable {


    private ServerRequestKey requestKey;
    private Object params;

    public ServerRequest(ServerRequestKey requestKey) {
        this.requestKey = requestKey;
    }

    public ServerRequestKey getRequestKey() {
        return requestKey;
    }

    public Object getParams() {
        return params;
    }

    public ServerRequest(ServerRequestKey requestKey, Object params) {
        this.requestKey = requestKey;
        this.params = params;
    }

    @Override
    public String toString() {
        return "Key: <" + requestKey + "> Params: <" + params + ">";
    }
}
