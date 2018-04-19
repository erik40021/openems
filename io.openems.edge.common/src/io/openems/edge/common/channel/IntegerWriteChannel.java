package io.openems.edge.common.channel;

import java.util.Optional;
import java.util.function.Consumer;

import io.openems.edge.common.channel.doc.ChannelId;
import io.openems.edge.common.component.OpenemsComponent;

public class IntegerWriteChannel extends IntegerReadChannel implements WriteChannel<Integer> {

	public IntegerWriteChannel(OpenemsComponent component, ChannelId channelId) {
		super(component, channelId);
	}

	private Optional<Integer> nextWriteValueOpt = Optional.empty();

	@Override
	public void _setNextWriteValue(Integer value) {
		this.nextWriteValueOpt = Optional.ofNullable(value);
	}

	@Override
	public Optional<Integer> _getNextWriteValue() {
		return this.nextWriteValueOpt;
	}

	/*
	 * onSetNextWriteCallback
	 */
	private Consumer<Integer> onSetNextWriteCallback = null;

	@Override
	public Consumer<Integer> getOnSetNextWriteCallback() {
		return this.onSetNextWriteCallback;
	}

	@Override
	public void _onSetNextWriteCallback(Consumer<Integer> onSetNextWriteCallback) {
		this.onSetNextWriteCallback = onSetNextWriteCallback;
	}

}