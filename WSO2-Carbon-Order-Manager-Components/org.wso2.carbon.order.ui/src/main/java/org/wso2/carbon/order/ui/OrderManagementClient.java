package org.wso2.carbon.order.ui;

/**
 * Created by prakhash on 5/5/16.
 */

import com.org.beans.xsd.Item;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.wso2.carbon.order.stub.OrderProcessingStub;

import java.rmi.RemoteException;

public class OrderManagementClient {


    private OrderProcessingStub stub;


    public OrderManagementClient() throws Exception{

        this.stub = new OrderProcessingStub();
        ServiceClient client = stub._getServiceClient();
        Options options = client.getOptions();
        options.setManageSession(true);

    }

    public Item[] getAvailableItems() throws Exception{
        try{

            return stub.getAvailableItems();
        }catch (RemoteException e) {
            e.printStackTrace();
            String msg = "Cannot get the list of Items"
                    + " . Backend service may be unavailable";
            throw new Exception(msg, e);
        }
    }

}



