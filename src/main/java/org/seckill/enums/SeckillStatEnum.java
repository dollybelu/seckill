package org.seckill.enums;

/**
 * ʹ��ö�ٱ������������ֶ�
 * @author Administrator
 *
 */
public enum SeckillStatEnum {
	SUCCESS(1, "��ɱ�ɹ�"),
	END(0, "��ɱ����"),
	REPEAT_KILL(-1, "�ظ���ɱ"),
	INNER_ERROR(-2, "ϵͳ�쳣"),
	DATA_REWRITE(-3, "���ݴ۸�");
	
	private int state;
	
	private String stateinfo;

	private SeckillStatEnum(int state, String stateinfo) {
		this.state = state;
		this.stateinfo = stateinfo;
	}

	public int getState() {
		return state;
	}

	public String getStateinfo() {
		return stateinfo;
	}
	
	public static SeckillStatEnum stateOf(int index) {
		for(SeckillStatEnum state : values()) {
			if(state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
