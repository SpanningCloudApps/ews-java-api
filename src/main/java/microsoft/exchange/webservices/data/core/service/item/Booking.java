package microsoft.exchange.webservices.data.core.service.item;

import microsoft.exchange.webservices.data.attribute.Attachable;
import microsoft.exchange.webservices.data.attribute.ServiceObjectDefinition;
import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.XmlElementNames;

@Attachable
@ServiceObjectDefinition(xmlElementName = XmlElementNames.Booking, returnedByServer = true)
public class Booking extends Item {

    public Booking(ExchangeService service) throws Exception {
        super(service);
    }
}
