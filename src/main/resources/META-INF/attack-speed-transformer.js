function initializeCoreMod() {
	Opcodes = Java.type("org.objectweb.asm.Opcodes");

	VarInsnNode = Java.type("org.objectweb.asm.tree.VarInsnNode");
	MethodInsnNode = Java.type("org.objectweb.asm.tree.MethodInsnNode");
	InsnNode = Java.type("org.objectweb.asm.tree.InsnNode");
	LabelNode = Java.type("org.objectweb.asm.tree.LabelNode");

	INVOKESTATIC = Opcodes.INVOKESTATIC;
	ALOAD = Opcodes.ALOAD;
	FRETURN = Opcodes.FRETURN;
	
	return {
		"PlayerEntity#getCooldownPeriod" : {
			"target" : {
				"type" : "METHOD",
				"class" : "net.minecraft.entity.player.PlayerEntity",
				"methodName" : "func_184818_cX",
				"methodDesc" : "()F"
			},
			"transformer" : function(methodNode) {
				injectHook(methodNode.instructions);
				return methodNode;
			}
		}
	}
}

function injectHook(instructions) {
	instructions.clear();
	
	instructions.add(new LabelNode())

	instructions.add(new VarInsnNode(ALOAD, 0)); // this
	instructions.add(new MethodInsnNode(INVOKESTATIC, "info/u_team/attack_speed_enchantment/hook/PlayerAttackSpeedHook", "hook", "(Lnet/minecraft/entity/player/PlayerEntity;)F", false));
	instructions.add(new InsnNode(FRETURN));
	
	instructions.add(new LabelNode())
}
