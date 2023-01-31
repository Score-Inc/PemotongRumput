package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.PlayerApplyEnterMpResultNotifyOuterClass.PlayerApplyEnterMpResultNotify;

public class PacketPlayerApplyEnterMpResultNotify extends BasePacket {

	public PacketPlayerApplyEnterMpResultNotify(Player target, boolean isAgreed, emu.grasscutter.net.proto.ReasonOuterClass.Reason reason) {
		super(PacketOpcodes.PlayerApplyEnterMpResultNotify);

		PlayerApplyEnterMpResultNotify proto = PlayerApplyEnterMpResultNotify.newBuilder()
				.setTargetUid(target.getUid())
				.setTargetNickname(target.getNickname())
				.setIsAgreed(isAgreed)
				.setReason(reason)
				.build();

		this.setData(proto);
	}

	public PacketPlayerApplyEnterMpResultNotify(int targetId, String targetName, boolean isAgreed, emu.grasscutter.net.proto.ReasonOuterClass.Reason reason) {
		super(PacketOpcodes.PlayerApplyEnterMpResultNotify);

		PlayerApplyEnterMpResultNotify proto = PlayerApplyEnterMpResultNotify.newBuilder()
				.setTargetUid(targetId)
				.setTargetNickname(targetName)
				.setIsAgreed(isAgreed)
				.setReason(reason)
				.build();

		this.setData(proto);
	}
}
