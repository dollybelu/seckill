package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

	/**
	 * ���빺����ϸ���ɹ����ظ�
	 * @param seckillId
	 * @param user_phone
	 * @return ���������
	 */
	int insertSuccessed(@Param("seckillId") long seckillId, @Param("userPhone") long user_phone);
	
	/**
	 * ����id��ѯSuccessKilled��Я����ɱ��Ʒ����
	 * @param seckilledId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(@Param("seckilledId") long seckilledId, @Param("userPhone") long userPhone);
	
}
