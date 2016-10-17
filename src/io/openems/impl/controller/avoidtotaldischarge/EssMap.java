package io.openems.impl.controller.avoidtotaldischarge;

import io.openems.api.channel.Channel;
import io.openems.api.channel.IsRequired;
import io.openems.api.channel.WriteableChannel;
import io.openems.api.controller.IsThingMap;
import io.openems.api.controller.ThingMap;
import io.openems.api.device.nature.Ess;

@IsThingMap(type = Ess.class)
public class EssMap extends ThingMap {

	@IsRequired(channelId = "MinSoc")
	public Channel minSoc;

	@IsRequired(channelId = "SetActivePower")
	public WriteableChannel setActivePower;

	@IsRequired(channelId = "Soc")
	public Channel soc;

	public EssMap(String thingId) {
		super(thingId);
	}
}
